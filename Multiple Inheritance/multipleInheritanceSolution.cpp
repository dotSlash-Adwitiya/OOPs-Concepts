//*
//*
//* In this example, virtual inheritance ensure that only single copy of a base class
//* is possesed by all the derived objects.
//*

#include<iostream>
using namespace std;

class A
{
int x;
public:

A() {
  cout << "A's Object" << endl;
}
void setX(int i) {x = i;}
void print() { cout << x; }
};

class B:  virtual public A
{
public:
B() {
  cout << "B called " << endl; 
  setX(10); }
};

class C:  virtual public A
{
public:
C() { 
  cout << "C called " << endl; 
  setX(20); }
};

class D: public B, public C {
};

int main()
{
	D d;
	d.print();
	return 0;
}
