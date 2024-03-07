#include<iostream>
using namespace std;

class AccessSpecifierDemo{
    private :
        int priVar;
    protected :
        int proVar;
    public :
        int pubVar;
    public :
        void setVar(int priValue,int proValue, int pubValue)
        {
            this->priVar = priValue;
            this->proVar = proValue;
            this->pubVar = pubValue;

        }
        void getVar(){

            cout << "Private variable: " << priVar << endl;
            cout << "Protected variable: " << proVar << endl;
            cout << "Public variable: " << pubVar << endl;

        }

};
int main()
{
    AccessSpecifierDemo obj;
    int a,b,c;
    cout << "Enter the value of private variable :";
    cin >> a;
    cout << "Enter the value of protected variable :";
    cin >> b;
    cout << "Enter the value of public variable :";
    cin >> c;
    obj.setVar(a,b,c);
    obj.getVar();

}
