#include<bits/stdc++.h>
using namespace std;

//* INDEPENDENT Entity
class Employee{ 
  int emp_id;
  string first_name;
  string last_name;

  public : 

    Employee(int id, string fname, string lname) {
      this->emp_id = id;
      this->first_name = fname;
      this->last_name = lname;
    }

    string getName() {
      return first_name + " " + last_name;
    }

};

//* This will have some employee so it can be said to be a dependent entity
class Bank {
  string name;
  vector<Employee> employeeList;
  
  public :  
  //* A bank cannot exist without employee
  Bank () {}

  Bank(string name) {
    this->name = name;
  }
  
  //* METHOD to associate an employee with current Bank
  void addEmployee(Employee& theEmployee){
    employeeList.push_back(theEmployee);
  }

  string getName() {
    return name;
  }

  //* METHOD to print employees of current bank
  void printEmployees(){
    for(Employee &theEmployee : employeeList){
      cout << "Name : " << theEmployee.getName() << " is an employee in - " << getName() << " Bank" << endl;
    }
  }

};

int main()
{
  Employee e1(1, "Adwitiya", "Mourya");
  Employee e2(1, "Ethan", "Hunt");
  
  Bank b1("Kotak");
  Bank b2("HSBC");

  b1.addEmployee(e1);
  b2.addEmployee(e2);

  b1.printEmployees();
  b2.printEmployees();

  return 0;
}