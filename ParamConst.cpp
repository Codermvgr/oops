#include<iostream>
using namespace std;
class student{
    private:
        string fullname;
        int rollnum;
        double sempercentage;
        string collegename;
        int collegecode;
    public:
        student()
        {
            collegename = "MVGR";
            collegecode = 33;
        }
        student(string name,double percentage)
        {
            collegename = "MVGR";
            collegecode = 33;
            fullname = name;
            sempercentage = percentage;


        }
        ~student(){}
        void getstudentname()
        {
            cout << "Name : " << fullname  << endl ;
        }
        void getcollegename()
        {
            cout << "College : " << collegename << endl ;
        }
        void getstudentrollno()
        {
            cout << "Rollno : " << rollnum << endl ;
        }
        void getsempercentage()
        {
            cout << "Sem percentage : " << sempercentage   << endl ;
        }
        void getcollegecode()
        {
            cout << "College code : " << collegecode << endl ;
        }
        void setstudentrollno(int r)
        {
            rollnum = r;
        }
};

int main()
{
    student s;
    string name;
    double sem;
    int roll;
    cout << "Enter your name : ";
    getline(cin,name);
    cout << "Enter your Roll no : ";
    cin >> roll;
    cout << "Enter your percentage : ";
    cin >> sem;
    s={name,sem};
    s.setstudentrollno(roll);
    cout << "The student details :" << endl;
    s.getstudentname();
    s.getstudentrollno();
    s.getcollegename();
    s.getcollegecode();
    s.getsempercentage();          
           
}
