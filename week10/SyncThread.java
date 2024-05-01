class table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}

class ThreadA extends Thread {
    table t;
    int n;

    ThreadA(table t, int n) {
        this.t = t;
        this.n = n;
    }

    public void run() {
        t.printTable(n);
    }
}

class ThreadB extends Thread {
    table t;
    int n;

    ThreadB(table t, int n) {
        this.t = t;
        this.n = n;
    }

    public void run() {
        t.printTable(n);
    }
}

class ThreadC extends Thread {
    table obj;
    int n;

    ThreadC(table obj, int n) {
        this.obj = obj;
        this.n = n;
    }

    public void run() {
        obj.printTable(n);
    }
}

public class SyncThread {
    public static void main(String args[]) {
        table obj = new table();
        ThreadA t1 = new ThreadA(obj, 5);
        ThreadB t2 = new ThreadB(obj, 10);
        ThreadC t3 = new ThreadC(obj, 15);
        t1.start();
        t3.start();
        t2.start();
    }
}
