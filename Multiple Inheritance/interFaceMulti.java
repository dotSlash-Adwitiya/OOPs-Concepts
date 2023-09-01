interface test1 {
    // Default method
    default void show()
    {
        // Print statement if method is called
        // from interface 1
        System.out.println("Default Test-1");
    }
}
 

interface test2 {
 
    // Default method
    default void show()
    {
        // Print statement if method is called
        // from interface 2
        System.out.println("Default Test-2");
    }
}
 
// Main class
// Implementation class code
class TestClass implements test1, test2 {

// Overriding default show method
@Override
public void show()
{
  // Using super keyword to call the show
  // method of test-1 interface
  test1.super.show();//Should not be used directly in the main method;

  // Using super keyword to call the show
  // method of test-2 interface
  test2.super.show();//Should not be used directly in the main method;
}
}

public class interFaceMulti {
    public static void main(String[] args) 
	{
		 TestClass d = new TestClass();
        d.show();
	}
}
