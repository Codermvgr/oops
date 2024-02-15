#include <iostream>

using namespace std;

void evenodd(int n)
{
    if(n%2==0)
    {
        cout << n << " is a even number" << endl;  
    }
    else
    {
        cout << n << " is a odd number" << endl;  
    }
}


int main() {
 
    int number;
    cout << "Enter an integer : " ;
    cin >> number;
    evenodd(number);

    return 0;

}
