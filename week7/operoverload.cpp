#include<iostream>
using namespace std;

class Complex{
    public:
        float real;
        float img;
        Complex(float r=0,float i=0): real(r),img(i){}

        Complex operator+(Complex &a){
            Complex temp;
            temp.real = real + a.real;
            temp.img  = img + a.img;
            return temp;
        }
        Complex & operator=(Complex &a){
               
            real = a.real;
            img = a.img;
            return *this;
        }
        void print()
        {
            cout << "|"<< real << " + i " << img <<"|";
        }
};
int main(){

    Complex a(1,4);
    Complex b(3,5);
    Complex c=a+b;
    a.print();cout << " + " ;b.print(); cout << " = "; c.print(); cout << endl;

}