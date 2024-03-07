#include <iostream>

using namespace std;
int main() {
 
    float number1,number2;
    char c;
    cout << "Enter two numbers :";
    cin >> number1>> number2;
    
    cout << "Enter your choice (+,-,*,/) :";
    cin >> c;
    switch(c)
    {
        case '+': cout << number1<< " + " << number2<< " = " << number1+number2<< endl;
                break;
        case '-': cout << number1<< " - " << number2<< " = " << number1-number2<< endl;
                break;
        case '*': cout << number1<< " * " << number2<< " = " << number1*number2<< endl;
                break;
        case '/': cout << number1<< " / " << number2<< " = " << number1/number2<< endl;
                break;
        default: cout << "Invalid choice" << endl;
    
        
    }
    
    return 0;
}
    
