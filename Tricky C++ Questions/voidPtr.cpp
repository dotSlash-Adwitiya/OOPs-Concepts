#include<bits/stdc++.h>
using namespace std;

int main()
{
  int b = 5;
  void *a = &b; // * Void is a generic pointer type 
  
  // * Void ptr needs to be explicityly typecaseted into a valid datatype because its a generic type
  // * And hence the compiler doesn't have enough information thats why it will give compiler error
  // * Hence we need to first convert it into appropriate ptr type -> then datatype (int).
  cout << "Address of B: " << &b << " Address of A: " << *(int*) a << endl;

  return 0;
}