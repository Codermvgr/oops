#include<iostream>
using namespace std;

inline void msg() { cout << "Welcome to C++" << endl ;}

class Box{
    public:
        float length,width,height;
    public:
        Box(){
            length = width = height = 1;
        }
        Box(float l, float b,float h)
        {
            length = l ;
            width = b ;
            height = h ;
            cout << "I am created" << endl;
        }
        ~Box() { cout << "I am Dead" << endl ;}
    
        void boxArea(float length,float width,float height)
        {
            float area = 2*(length*width+width*height+height*length);
            cout << "Area of the box is " << area << endl;
        }
        void boxArea()
        {
            float area = 2*(length*width+width*height+height*length);
            cout << "Area of the box is " << area << endl;
        }
        void boxvolume(float length,float width,float height)
        {
            float vol = length*width*height;
            cout << "Volume of the box is " << vol << endl;
        }
};
void displayBoxDimensions(Box b)
{
    cout << "length : " << b.length << endl;
    cout << "width : " << b.width << endl;
    cout << "height : " << b.height << endl;
}
int main()
{
    Box b {1,2,3};
    displayBoxDimensions(b);
    msg();
    b.boxArea();
    b.~Box();
}