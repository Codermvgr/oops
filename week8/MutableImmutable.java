
import java.util.*;

public class MutableImmutable {

    public static void main(String[] args) {
        
        Integer a = 10;
        System.out.println("variable a before changing, Hashcode:" + System.identityHashCode(a));
        a = a + 1;
        System.out.println("variable a after changing, Hashcode:" + System.identityHashCode(a));

        String name1 = "Hello";
        String name = "World";
        System.out.println("name before changing, Hashcode:" + System.identityHashCode(name));
        name = name1 + name;
        System.out.println("name after changing, Hashcode:" + System.identityHashCode(name));

        int i = 1;
        System.out.println("variable i before changing, Hashcode:" + System.identityHashCode(i));
        i = i + 1;
        System.out.println("variable i after changing, Hashcode:" + System.identityHashCode(i));

        List<String> list = new ArrayList<>();
        list.add("Hello");
        System.out.println("list before modification,Hashcode: " + System.identityHashCode(list));
        list.add("World");
        list.set(0, "Hi");
        System.out.println("list after modification,Hashcode: " + System.identityHashCode(list));

    }
}
