interface A {
  int a = 2;
  default void meth() {

  }
}

interface B   {
  default void meth(){

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
