#include<bits/stdc++.h>
using namespace std;

class MyClass1 {
public:
    MyClass1() {
        std::cout << "MyClass1 Constructor Called" << std::endl;
    }

    ~MyClass1() {
        std::cout << "MyClass1 Destructor Called" << std::endl;
    }
};

class MyClass2 {
public:
    MyClass2() {
        std::cout << "MyClass2 Constructor Called" << std::endl;
    }

    ~MyClass2() {
        std::cout << "MyClass2 Destructor Called" << std::endl;
    }
};

class MyClass3 {
public:
    MyClass3() {
        std::cout << "MyClass3 Constructor Called" << std::endl;
    }

    ~MyClass3() {
        std::cout << "MyClass3 Destructor Called" << std::endl;
    }
};

int main()
{
  MyClass1 c1;
  MyClass3 c3;
  MyClass2 c2;




  return 0;
}