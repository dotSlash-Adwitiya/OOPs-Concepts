class A {
    //* ---->>> Every String is object but not every OBject is a STRING, it could be anything. -- <<<<<
    Object fun2(Object obj) {
        //* Code Won't work because of below line, and throws - ClassCastException */
        return (String) obj;
    }
}

public class ClassQuestionCastThree {
  public static void main(String[] args) {
    A a = new A();
    System.out.println(a.fun2(new Object()));
}
}
