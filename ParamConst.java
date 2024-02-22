import java.util.Scanner;
class Student{
    String fullname;
    double sempercentage;
    String collegename;
    int collegecode;
    Student()
    {
        collegename = "MVGR";
        collegecode = 33;
    }
    Student(String name,double percentage)
    {
        fullname = name;
        sempercentage = percentage;

    }
    
   
    // protected void finalize(){
        
    //     System.out.println("object is destroyed");
    // }
    
}
public class ParamConst {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter your name :");
        String name = input.nextLine();

        System.out.print("Enter your percentage :");
        double sem = input.nextDouble();

        Student s1 = new Student(name,sem);
        Student s2 = new Student(); 
        System.out.println("Name : "+s1.fullname);
        System.out.println("sem percentage : "+s1.sempercentage);
        System.out.println("college name : "+s2.collegename);
        System.out.println("college code : "+s2.collegecode);

        input.close();
    }
    
}
