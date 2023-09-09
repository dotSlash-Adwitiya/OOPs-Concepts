class A {
    int fun(int a, float b) {
        return a;
    }
}

class B extends A{
    //* The code won't compile if we've added @Override annotation in java and the following criteria isn't met !
    //* method_name, Parameter list and the datatypes of parameter list, return type - MUST BE THE SAME !
    //* ONLY The body should be different !
    @Override
    float fun(float a, int b) {
        return a;
    }
    //* This will not work either -
//    int fun(float a, int b) {
//        return a;
//    }

}

public class ClassQuestionTwo {
  public static void main(String[] args) {
    B b = new B();
    b.fun(4.5f, 2);
  }
  
}
