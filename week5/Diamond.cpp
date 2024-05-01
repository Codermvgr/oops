#include <iostream>
using namespace std;
class Animal {
public:
    void whoAmI() {
        cout << "I am an animal." <<endl;
    }
};
class Bird : public Animal {
public:
    void fly() {
        cout << "I can fly!" <<endl;
    }
};
class Mammal : public Animal {
public:
    void run() {
        cout << "I can run!" <<endl;
    }
};

class Bat : public Bird, public Mammal {
public:
    void greet() {
        cout << "I am a bat." << endl;
    }
};

int main() {
    Bat bat;
    bat.greet();
    // bat.whoAmI(); Error: Ambiguity
    bat.run();
    bat.fly();
    return 0;
}
