class Sleep extends Thread  
{    
    public void run()  
    {    
        for(int i=1;i<5;i++)  
        {    
            try 
            {  
                Thread.sleep(2000);   
            }catch(InterruptedException e){System.out.println(e);}    
            System.out.println(i);    
        }    
    }    
}

public class SleepMultiThreadDemo {
  public static void main(String[] args) {
    Sleep th1 = new Sleep();
    Sleep th2 = new Sleep();

    th1.start();
    th2.start();
  }
}
