#include<iostream>
using namespace std;

 
class Base1 {
  public : 
    void show() {
      cout << "Show() of BASE-1" << endl;
    }
};

class Base2 {
  public : 
    void show() {
      cout << "Show() of BASE-2" << endl;
    }
};

class Derived : public Base1, public Base2 {};

int main()  {
  Derived d;

  //* Causes Ambiguity to compiler -which show() to call.
  // d.show();

  //* One possible Solution : Use scope resolution operator 
  d.Base1::show();
  d.Base2::show();
}