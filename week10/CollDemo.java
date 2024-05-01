import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Queue;

class CollDemo {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<>();
        x.add("dinesh");
        x.add("prasad");
        x.add("sunil");
        System.out.println("ARRAY LIST");
        Iterator<String> it = x.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(x);
        System.out.println("QUEUE");
        Queue<Integer> y = new ArrayDeque<>();
        y.add(1);
        y.add(2);
        y.add(3);
        y.peek();
        System.out.println(y.peek());
        y.remove();
        y.remove();
        System.out.println(y.peek());

        HashSet<String> z = new HashSet<>();
        z.add("1");
        z.add("2");
        z.add("3");
        z.add("4");
        z.add("5");
        z.add("6");
        z.add("7");
        if (z.contains("5")) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }
}
