interface A {
  void method();
}

interface B {
  void method();
}

public class InterfaceQuestionTwo implements A, B{
  public void method() {
    System.out.println("This method must be overided");
  }
  public static void main(String[] args) {
    InterfaceQuestionTwo it = new InterfaceQuestionTwo();
    it.method();
  }
  
}
