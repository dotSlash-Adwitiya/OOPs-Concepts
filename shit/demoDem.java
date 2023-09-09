interface A {
  int a = 2;
  default void meth() {
    System.out.println("Meth of Interface A");
  }
}

interface B   {
  default void meth(){
    System.out.println("Meth of Interface B");

  }
}

public class demoDem implements A, B {
  public void meth() {
    System.out.println("This method must be overrided because its common in"
    + "both the interfaces else the code will produce error ! - duplicate \"meth\" name");
  }

  public static void main(String[] args) {
    demoDem d = new demoDem();
    
    d.meth();
    
  }
  
}
