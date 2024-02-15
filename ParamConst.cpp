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
        void getstudentmarks()
        {
            cout << "Sem percentage : " << sempercentage   << endl ;
        }
        void getcollegecode()
        {
            cout << "College code : " << collegecode << endl ;
        }
};

int main()
{
    student s1("Naga",99);

    s1.getstudentname() ; 
            
            
}