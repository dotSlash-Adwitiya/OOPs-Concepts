//*
//* Another approach is to use friend function when doing operator overloading.
//* Basically we provide both object to another friend operator function and that function
//* adds them for us

#include<bits/stdc++.h>
using namespace std;

class Complex {
  public :
    int real;
    int imaginary; 

    Complex(int a = 0, int b = 0) {
      this->real = a;
      this->imaginary = b;
    }

    //* Complex add(Complex const &obj) -> This can also be done, but in this
    //* We're trying to demonstrate "OPERATOR Overloading"
    //* This below is called "Operator Function"
  friend Complex operator+(Complex const &obj1, Complex const &obj2);     
};

Complex operator+(Complex const &obj1, Complex const &obj2) {
  Complex res;
  res.real = obj1.real + obj2.real; 
  res.imaginary = obj1.imaginary + obj2.imaginary; 
  return res;
}

int main()
{
  Complex c1(0, 2);
  Complex c2(3, 10);

  Complex c3 = c1 + c2;

  cout << c3.real << "+" << c3.imaginary  << "i" << endl; 

  return 0;
}