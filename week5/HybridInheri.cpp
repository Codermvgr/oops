#include<iostream>
using namespace std;
class Point {
    private:
        float x,y;
    public:
        Point(float a=0,float b=0) : x(a),y(b) {}
    void printpoint(){
        cout << "(x,y)" << " = " << "(" << x << "," << y << ")" << endl;
    }
       
};
class Geometry{
    protected:
        const double pi = 3.141;
    public:
    double area(){}
    double perimeter(){}
};
class Circle : public Point,public Geometry {
    protected:
        float radius;
    public:
        Circle(float r=0) : radius(r),Point() {}
        Circle(float x,float y,float r=1) : radius(r),Point(x,y) {} // center point of circle (x,y)
        double area()
        {  
            return pi*radius*radius;
        }
        double circumference()
        {
            return 2*pi*radius;
        }
        double perimeter(){
            return 2*pi*radius;
        }
        double getradius()
        {
            return radius ;
        }
};
class Sphere : public Circle {
   
    public:
        Sphere(float r): Circle(r){}
        double area()
        {
            return 4*pi*radius*radius;
        }
        double volume()
        {
            return (4/3)*pi*radius*radius*radius;
        }
};
int main()
{
    float r;
    cout << "Enter the radius of sphere : " ;
    cin >> r;
    Sphere s(r);
    s.printpoint();
    cout<< "Volume: "<< s.volume() << endl;
    cout<< "Total Surface area : " << s.area() << endl;
    return 0;
}
