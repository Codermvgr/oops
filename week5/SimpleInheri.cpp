#include<iostream>
using namespace std;


class Rectangle {
    private:
        float length,breadth;


    public:
        Rectangle(float l=0,float b=0) : length(l),breadth(b) {}
        double area()
        {
            cout << "AREA: ";
            return length*breadth;
        }
        double perimeter()
        {
            cout << "PERIMETER: ";
            return 2*(length+breadth);
        }
        void printlengthbreadth()
        {
            cout << "length: " << length << endl;
            cout << "Breadth: " << breadth << endl;
        }
};
class Square : public Rectangle {
    private:
        float side;
    public:
        Square(float a): side(a),Rectangle(a,a){}
        void printside()
        {
            cout << "Side: " << side << endl;  
        }
};
int main()
{
    float a;
    cout << "Enter the side of a square : " ;
    cin >> a;
    Square s(a);
    cout<< s.perimeter() << endl;
    cout<< s.area() << endl;
}

