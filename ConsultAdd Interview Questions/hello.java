interface A {
    default void method() {
        System.out.println("method1");
    }
}

interface B {
    default void method() {
        System.out.println("method2");
    }
}

class demo implements A {
//   @Override
//   public void method() {
//     System.out.println("svdd");
//   }  

}

public class hello {
    public static void main(String[] args) {
      demo d = new demo();
        
      // Call the default implementation of method from interface A
      A a = d;
      a.method();
      
      // Call the default implementation of method from interface B
    //   B b = d;
    //   b.method(); 
    }
}
