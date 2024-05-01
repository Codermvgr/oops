class ThreadA extends Thread{
    int num;
    ThreadA(int num){
        this.num=num;
    }
    public void run(){
        for(int i=1; i<10; i++){
            System.out.println(num+"*"+i+"="+num*i);
            try{
            Thread.sleep(1000);
            }
            catch(InterruptedException obj){
                System.out.println("How have been interrupting the thread process");
            }
        }
    }
}
class Main{
    public static void main(String[] args){
        ThreadA t1=new ThreadA(1);
        ThreadA t2=new ThreadA(2);
        t1.start();
        t2.start();
    }
}

