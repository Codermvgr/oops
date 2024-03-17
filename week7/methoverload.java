import java.lang.System;

class Cal{
    public float add(float a,float b){
        return a+b;
    }
    public float add(float a,float b,float c){
        return a+b+c;
    }
}

public class methoverload {
    public static void main(String[] args) {
        Cal obj = new Cal();
        float a=10;
        float b=20;
        float c=30;

        System.out.println(a + " + " + b + " = " + obj.add(a,b));
        System.out.println(a + " + " + b + " + " + c + " = " + obj.add(a,b,c));
        
    }
    

}
