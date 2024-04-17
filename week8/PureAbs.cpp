#include<iostream>
using namespace std;

class AbstractClass {
public:
    virtual void abstractMethod() = 0;
};

class PureAbs : public AbstractClass {
public:
    void abstractMethod() override {
        cout << "This is a pure virtual function implemented in a PureAbs class" << endl;
    }
};
int main() {
    PureAbs obj;
    obj.abstractMethod();
    return 0;
}
