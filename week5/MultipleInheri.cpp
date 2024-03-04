#include<iostream>
#include<math.h>
using namespace std;


class Rectangle {
    protected:
        float  diagonal;
    private:
        float length,breadth;
    public:
        Rectangle(float l=0,float b=0) : length(l),breadth(b) {}
        double area()
        { 
            return length*breadth;
        }
        double perimeter()
        {
            return 2*(length+breadth);
        }
        void printlengthbreadth()
        {
            cout << "length: " << length << endl;
            cout << "Breadth: " << breadth << endl;
        }
};
class Rhombus {
    protected:
        float side;
    private:  
        float d1,d2;
    public:
        Rhombus(float a=0,float b=0) : d1(a),d2(b) {
            side=sqrt(d1*d1+d2*d2)/2;
        }
        double area1()
        {
            return (d1*d2)/2;
        }
        double perimeter1()
        {
            return 2*sqrt(d1*d1+d2*d2);
        }
};
class Square :public Rhombus, public  Rectangle{
   
    public:
        Square(double d):Rectangle(side,side), Rhombus(d,d){  
               
            diagonal=d;
        }
        void printside()
        {
            cout << "Side: " << side << endl;  
        }
};
int main()
{
    float a;
    cout << "Enter the diagonal of a square : " ;
    cin >> a;
    Square s(a);
    cout << "calling methods from Rectangle" << endl;
    cout << "Perimeter: " << s.perimeter() << endl;
    cout << "Area: " << s.area() << endl;
    cout << "calling methods from Rhombus" << endl;
    cout << "Perimeter: " << s.perimeter1() << endl;
    cout << "Area: " << s.area1() << endl;
}
