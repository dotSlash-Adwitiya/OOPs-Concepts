class A {
    
    //* This below code, won't give any error */
    //* Because, a child class can be typecasted into its parent class */
    //* But vice-versa isn't true ! */
    Object fun1(String str) {
        return (Object) str+"Adwitiya";
    }
    //* O/p : Adwitiya */

    //* ---->>> Every String is object but not every OBject is a STRING, it could be anything. -- <<<<<
    // Object fun2(Object obj) {
    //     //* Code Won't work because of below line, and throws - ClassCastException */
    //     return (String) obj;
    // }
}

public class ClassQuestionCastThree {
  public static void main(String[] args) {
    A a = new A();
    System.out.println(a.fun1(new String()));
}
}
