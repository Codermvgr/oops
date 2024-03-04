#include<iostream>
using namespace std;
class Point {
   
    public:
        const double pi = 3.141;
    private:
        float x,y;
    public:
        Point(float a=0,float b=0) : x(a),y(b) {}
       
};
class Circle : public Point {
    protected:
        float radius;
    public:
        Circle(float r=0) : radius(r),Point() {}
        Circle(float a,float b,float r=1) : radius(r),Point(a,b) {}
        double area()
        {
           
            return pi*radius*radius;
        }
        double circumference()
        {
           
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
    Sphere s1(r);
    cout<< "Volume: "<< s1.volume() << endl;
    cout<< "Total Surface area : " << s1.area() << endl;
    return 0;
}
