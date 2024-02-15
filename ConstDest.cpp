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
        ~student(){
            cout << "I am dead" <<endl;
        }
        void printstudentdetails()
        {
            cout << "The student details : " << endl;
            cout << "Name : " << fullname << endl
            << "Rollno : " << rollnum << endl
            << "College : " << collegename << endl
            << "College code : " << collegecode << endl
            << "Sem percentage : " << sempercentage   << endl;
        }
       
       
};
int main()
{
    string name;
    int roll;
    double semper;
    string collname;
    int collcode;
    cout << "Enter your Full name : " ;
    getline(cin,name);
    cout << "Enter your Roll no : " ;
    cin >> roll;
    cout << "Enter your College name : " <<ends;
    cin >> collname;
    cout << "Enter your College code : " ;
    cin >> collcode;
    cout << "Enter your Sem percentage : " ;
    cin >> semper;


    student s(name,roll,collname,collcode,semper);


    s.printstudentdetails();
   
}
