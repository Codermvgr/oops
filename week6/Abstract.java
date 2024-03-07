import java.util.Scanner;

class AccessSpecifierDemo{
    private int priVar;
    protected int proVar;
    public int pubVar;
    public void setVar(int priValue,int proValue, int pubValue)
    {
        this.proVar = proValue;
        this.priVar = priValue;
        this.pubVar = pubValue;
    }
    public void getVar()
    {
        System.out.println("Private variable: " + priVar );
        System.out.println("Protected variable: " + proVar );
        System.out.println("Public variable: " + pubVar );
    }
    
};
public class Abstract{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AccessSpecifierDemo obj = new AccessSpecifierDemo();
        int a,b,c;
        System.out.print("Enter the value of private variable :");
        a = input.nextInt();
        System.out.print("Enter the vaule of protected variable :");
        b = input.nextInt();
        System.out.print("Enter the value of public variable :");
        c = input.nextInt();
        obj.setVar(a,b,c);
        obj.getVar();
        input.close();
    }
}
