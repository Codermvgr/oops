#include<iostream>
#include<math.h>
using namespace std;


class Polygon{
    private:
        int num;
    public:
        Polygon(int n=0): num(n){}
    void shape()
    {
        cout << "Shape: ";
        if(num==3)
        {
            cout << "TRIANGLE" << endl ;
        }
        else if (num==4)
        {
            cout << "QUADRILATERAL" << endl;
        }
        else
        {
            if(num<3)
            cout << "NOT A POLYGON" << endl;
            else
            cout << "POLYGON"  << endl;
        }  
    }
    void setsides(int n)  
    {
        num=n;
    }
};
class Triangle : public Polygon {
    private:
        float a,b,c;
        float base,height;
        float s;
        double ar;
    public:
        Triangle(float a,float b,float c) :Polygon(3) {
            this->a=a;
            this->b=b;
            this->c=c;
            s=(a+b+c)/2;
            ar= sqrt(s*(s-a)*(s-b)*(s-c));
            base= (a<b && a<c)? a: (b<c)? b: c;
            height=ar*2/base;
            if(ar!=ar || ar == 0){
                cout << "Triangle is not formed with given sides" << endl;
                setsides(0);
                s=ar=0;
            }
   
        }
        Triangle(float b,float h) : Polygon(3){
            base=b;
            height=h;
            ar =(base*height)/2;
        }
        double area(){
            return ar;
        }
        double perimeter(){
            return 2*s;
        }
        void printsides(){
            cout << "The sides of triangle : " << a << "," << b << "," << c << endl;
        }
};
class Quadrilateral : public Polygon {
    private:
        float a,b,c,d;
        float s;
        double ar;
    public:
        Quadrilateral(float a,float b,float c,float d) : Polygon(4)
        {
            this->a=a;
            this->b=b;
            this->c=c;
            this->d=d;
            s=(a+b+c+d)/2;
            ar=sqrt((s-a)*(s-b)*(s-c)*(s-d));
            if(ar!=ar || ar==0)    
            {
                cout << "Quadrilateral is not formed with given sides" << endl;
                setsides(0);
                s=ar=0;
            }
        }
        Quadrilateral(float s) : Polygon(4)
        {
            a=s;
            b=s;
            c=s;
            d=s;                
        }
        double area()
        {
            return ar;
        }
        double perimeter()
        {
            return 2*s;
        }
        void printsides(){
            cout << "The sides of quadrilateral : " << a << "," << b << "," << c << "," << d << endl;
        }


};
int main()
{
    float a,b,c,d;
    cout << "Enter the sides of triangle : " ;
    cin >> a >> b >> c ;
    Triangle t(a,b,c);
    t.shape();
    cout << "calling methods from Triangle" << endl;
    cout << "Perimeter: " << t.perimeter() << endl;
    cout << "Area: " << t.area() << endl;
   
    cout << "Enter the sides of cyclic quadrilateral : " ;
    cin >> a >> b >> c >> d ;
    Quadrilateral q(a,b,c,d);
    q.shape();
    cout << "calling methods from Quadrilateral" << endl;
    cout << "Perimeter: " << q.perimeter() << endl;
    cout << "Area: " << q.area() << endl;
}
