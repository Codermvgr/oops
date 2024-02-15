#include<iostream>
using namespace std;

void boxArea(float length,float width,float height)
{
    float area = 2*(length*width+width*height+height*length);
    cout << "Area of the box is " << area << endl;
}