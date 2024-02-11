#include<iostream>
#include<iomanip>

using namespace std;

int main()
{
	string str;

    // usage of ws and endl
	cout << "Enter a string :" <<ends;
	getline(cin >> ws, str);  
	cout << str << endl;
    
	// usage of flush
	cout << "line without flush" << endl;
	cout << "line with flush" << flush ;
    
    // usage of ends
	cout << "\na";
	cout << "b" << ends;
	cout << "c" << endl;
    
    // usage of setw() , setfill() ,setprecision()
    cout << setw(5) << "10" << endl;
    cout << setw(5) << setfill('0') << "10" << endl;
    double pi = 3.141325;
    cout << setprecision(3) << pi << endl;

	return 0;
}
   

