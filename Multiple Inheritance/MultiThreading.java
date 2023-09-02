
//* Basic demo to understand how start method calls the run method */

//* Method 1 - By extending Thread class */
class MyThread extends Thread {
  @Override
  public void run() {
      System.out.println("run(), called by Start method of Thread Class!");
  }
}


public class MultiThreading {
  public static void main(String[] args) {
    MyThread thread = new MyThread();

    //* */
    System.out.println("Calling start() which further calls run().");
    thread.start();
    
    //* We call start method, which further class run() method */
    //* This WILL NOT Create a THREAD because to create a thread,*/
    //* we must call start method() */
    System.out.println("Calling run through main directly.");
    thread.run();
  }
}
