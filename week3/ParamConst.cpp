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
        student(string name,double percentage):student()
        {
            fullname = name;
            sempercentage = percentage;
        }
        ~student(){}
        void getstudentdetails()
        {
            cout << "The student details :" << endl;
            cout << "Name : " << fullname  << endl ;
            cout << "Rollno : " << rollnum << endl ;
            cout << "College : " << collegename << endl ;
            cout << "College code : " << collegecode << endl ;
            cout << "Sem percentage : " << sempercentage   << endl ;
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
    s.getstudentdetails();         
           
}
