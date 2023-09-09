class A {
  public String method(Object obj) {
    return (String) obj;
  }
}

class B extends A {
  public Object method(Object obj) {
    return "";
  }
}
public class Main2 {
  public static void main(String[] args) {
    A a = new A();
    Object obj = new Object();
    System.out.println(a.method(obj));
  }
}