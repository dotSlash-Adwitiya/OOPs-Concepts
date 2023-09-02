
//* Basic demo to understand how start method calls the run method */

//* Method 1 - By extending Thread class */
class MyThread1 extends Thread {
  @Override
  public void run() {
      System.out.println("run(), called by Start method of Thread Class!");
  }
}

class MyThread2 implements Runnable {
  public void run() {
    System.out.println("run() called !");
  }
}

public class MultiThreading {
  public static void main(String[] args) {
    //* Using Thread Class extend : Method-1*/
    MyThread1 thread = new MyThread1();
    System.out.println("Calling start() which further calls run().");
    thread.start();

    //* We call start method, which further class run() method */
    //* This WILL NOT Create a THREAD because to create a thread,*/
    //* we must call start method() */
    //* So, in total we have only 2 threads one is main() and another when we called start() */
    System.out.println("Calling run through main directly.");
    thread.run();

    //* Using RUNNABLE Interface : Method-2*/
    //* [IMP] : In this method, we still need the object of thread class */

    MyThread2 thread2 = new MyThread2();
    //* Create thread class's obj and give the class's (obj) as actual arg */
    //* to the constructor of thread class */
    //* Analogy : A horse kart. Horse is thread that runs, along 
    //* with the kart attached to it. */ */
    Thread th = new Thread(thread2);

    th.start();

  }
}