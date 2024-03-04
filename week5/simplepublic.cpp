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
            return b;  //private variable 'b' accessible with in the class
        }
};
class Subclass : public Superclass{
    public:
        Subclass(): Superclass(){
            cout << "In sub class" << endl;
            cout << "public:" << a << endl;
            cout << "private:" << "private member cannot be accessed" <<  endl;
            cout << "protected:" << c << endl;
        }
        int getc()
        {
            return c;  //protected variable accessible within the class and  inherited class
        }
};
int main()
{
    Subclass obj;
    cout << "In main(): Subclass inherits public Superclass" << endl;
    cout << "public:" << obj.a << endl;
    // cout << "public:" << obj.b << endl;// 'int Superclass::b' is private within this context
    // cout << "public:" << obj.c << endl; // 'int Superclass::c' is protected within this context
    cout << "private:" << obj.getb() <<  endl;
    cout << "protected:" << obj.getc() << endl;


    return 0;
}
