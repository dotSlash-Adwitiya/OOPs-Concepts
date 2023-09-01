//* JAVA Doesn't SUPPORT multiple Inheritance DIRECTLY,
//* But we can achieve it partially and indirectly using INTERFACES NOT Classes */

interface test1 {
  default void show() {
    System.out.println("This is default method!");
  }

  void fun();
}

interface test2 {
   default void show() {
    System.out.println("This is default method!");
  }
  
  default void show2() {
    System.out.println("This is default method!");
  }

  void fun();
}


class mult implements test1, test2 {
  public void fun() {
    System.out.println("Fun is overrided");
  }
  public void show() {
    System.out.println("default method overrided");
  }
}

public class multiInherit {
  public static void main(String[] args) {
    mult mt = new mult();
    mt.show();
    mt.fun();
  }
}