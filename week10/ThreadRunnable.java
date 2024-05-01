class ThreadA implements Runnable{
    String name;
    ThreadA(String name){
        this.name=name;
    }
    public void run(){
        System.out.println("hello "+name);
    }
}
class ThreadRunnable{
    public static void main(String[] args){
        Thread x = new Thread(new ThreadA("krishna"));
        ThreadA y = new ThreadA("pawan");
        y.run();
        x.start();
    }
}
