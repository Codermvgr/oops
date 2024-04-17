#include<iostream>
using namespace std;

template<typename MyType>
class Cal{
    public:
        MyType add(MyType a, MyType b){ return a+b;}
        MyType sub(MyType a, MyType b){ return a-b;}
        MyType mul(MyType a, MyType b){ return a*b;}
        MyType div(MyType a, MyType b){ return a/b;}
};

int main(){

    Cal <int> obj1;
    Cal <double> obj2;
    cout << obj1.add(1,2) << endl;
    cout << obj2.div(3.2,1.8) << endl;
}

