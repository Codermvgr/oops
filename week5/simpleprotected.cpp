#include<iostream>
using namespace std;


class Superclass{

    public:
        int a = 10;
    private:
        int b = 20;
    protected:
        int c = 30;
    public:
        Superclass(){
            cout << "In super class" << endl;
            cout << "public:" << a << endl;
            cout << "private:" << b <<  endl;
            cout << "protected:" << c << endl;
        }
        int getb()
        {
            return b;   //private variable 'b' accessible with in the class
        }




};
class Subclass : protected Superclass{
    public:
        int tempa=a;
        int tempb=getb();  //private variable accessible with in the class
        int tempc=c;  //protected variable accessible with in the class and  inherited class
    public:
        Subclass(): Superclass(){
            cout << "In sub class" << endl;
            cout << "public:" << a << endl;
            cout << "private:" << "private member cannot be accessed" <<  endl;
            cout << "protected:" << c << endl;
        }
   


};
int main()
{
    Subclass obj;
    cout << "In main(): Subclass inherits protected Superclass" << endl;


    // cout << "public:" << obj.a << endl;// 'int Superclass::a' is inaccessible within this context
    // cout << "private:" << obj.b << endl;// 'int Superclass::b' is private within this context
    // cout << "protected:" << obj.c << endl; // 'int Superclass::c' is protected within this context
   
    cout << "public:" << obj.tempa << endl;
    cout << "private:" << obj.tempb <<  endl;
    cout << "protected:" << obj.tempc << endl;


    return 0;
}
