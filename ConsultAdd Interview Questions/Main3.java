
class A {
  public String fun(int a) {
    return "";
  }
}

class B extends A{
  public Object fun(int a) {
    Object obj = new Object();  
    return obj;
  }
}

public class Main3 {
  public static void main(String[] args) {
    B b = new B();
    Object obj = new Object();
    System.out.println(b.fun(6));

  }
  
}
