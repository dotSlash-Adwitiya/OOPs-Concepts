//*
//* Operator overloading basically allows you to operate on user-defined objects
//* such as classes and structure. You can directly perform operations on them 
//* by using operators like ARITHMETIC operations etc
//* It basically allows us to define custom behaviours for the operators and overloading their pre-defined ones.
//* It is an idea of giving special meaning to an existing operator
//* in C++ without changing its original meaning
//*

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
    Complex operator+(Complex const &obj) {
      Complex res;
      res.real = real + obj.real; 
      res.imaginary = imaginary + obj.imaginary; 
      return res;
    }
};

int main()
{
  Complex c1(10, 2);
  Complex c2(3, 5);

  Complex c3 = c1 + c2;

  cout << c3.real << "+" << c3.imaginary  << "i" << endl; 

  return 0;
}