#include<iostream>
using namespace std;

class Parent{
    public:
    void print(){
        cout << "This is a Parent method" << endl;
    }  
  
};

class Child : public Parent{
    public:
    // void print(string s){ //overloading is not possible
        
    //     cout << "This is a Child method with one argument" << endl;
    // }
    void print(){ //overriding is ok
        
        cout << "This is a Child method" << endl;
    }
};

int main(){
    
    Child c;
    c.print();
    //c.print("MVGR");

}
    

