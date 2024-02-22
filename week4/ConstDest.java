import java.util.Scanner;
class Student{
    String fullname;
    int rollnum;
    double sempercentage;
    String collegename;
    int collegecode;
    Student(){}
    Student(String name,int roll,String college,int code,double percentage)
    {
        fullname = name;
        rollnum = roll;
        collegename = college;
        collegecode = code;
        sempercentage = percentage;

    }
    void printstudentdetails()
    {
        System.out.println("The student details:");
        System.out.println("Name :" +fullname);
        System.out.println("Roll no :" +rollnum);
        System.out.println("College name :" +collegename);
        System.out.println("College code :" +collegecode);
        System.out.println("Sem percentage:" +sempercentage);
    }
}
public class ConstDest {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter your name :");
        String name = input.nextLine();

        System.out.print("Enter your rollno :");
        int roll = input.nextInt();
        input.nextLine();
        System.out.print("Enter your college name :");
        String collname = input.nextLine();

        System.out.print("Enter your college code :");
        int code = input.nextInt();

        System.out.print("Enter your percentage :");
        double sem = input.nextDouble();

        Student s = new Student(name,roll,collname,code,sem);

        s.printstudentdetails();

        input.close();
    }
    
}
