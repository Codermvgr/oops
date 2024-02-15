#include <iostream>
#include "boxArea.h"
#include "boxVolume.h"

int main()
{
    float l,b,h;
    cout << "Enter the length , width and height : ";
    cin >> l >> b >> h ;
    boxArea(l,b,h);
    boxvolume(l,b,h);

}
