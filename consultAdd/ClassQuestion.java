
//* Method Overriding in java */
class A {
  int fun(int a, float b) {
    return a;
  }
}

class B extends A{
  //* This code is perfect to override the java method :-
  //* Criteria is , that the method's signature should exactly be the same - return_Type, name, Parameter_list
  //* */ And the data types of the parameter list !
  @Override
  int fun(int a, float b) {
      return a;
  }

}

public class ClassQuestion {
  public static void main(String[] args) {
    B b = new B();
    System.out.println(b.fun(2,3.5f);
  }
  
}
