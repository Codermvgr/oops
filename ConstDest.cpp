#include<iostream>
using namespace std;

inline void msg() { cout << "Welcome to C++" << endl ;}

class student{
    private:
        string fullname;
        int rollnum;
        double sempercentage;
        string collegename;
        int collegecode;
    public:
        student(){}
        student(string name,int roll,string college,int code,double percentage)
        {
            fullname = name;
            rollnum = roll;
            collegename = college;
            collegecode = code;
            sempercentage = percentage;

        }
        ~student(){}
        void printstudentdetails()
        {
            cout << "Name : " << fullname         << endl
            << "Rollno : " << rollnum << endl
            << "College : " << collegename << endl
            << "College code : " << collegecode << endl
            << "Sem percentage : " << sempercentage   << endl;
        }
       
        
};

int main()
{
    student s1("Naga",59,"Mvgr",33,99);

      s1.printstudentdetails();
   
}