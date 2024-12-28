// Day : 75 Java Thread Methods

class Thread75_1 extends Thread
{
    @Override
    public void run()
    {
        int i = 0;
        while(i < 10)
        {
            System.out.println("I am Thread! 1");
            // Thread.sleep(8); // It also use try-catch method for exception handling. Here, we use sleep() method to stop the thread 1 for 8 millis second.
            try
            {
                Thread.sleep(8);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            i++;
        }
    }
}
class Thread75_2 extends Thread
{
    @Override
    public void run()
    {
        int i = 0;
        while(i < 10)
        {
            System.out.println("I am Thread! 2");
            i++;
        }
    }
}

public class Java75
{
    public static void main(String[] args)
    {
        Thread75_1 t1 = new Thread75_1();
        Thread75_2 t2 = new Thread75_2();

        t1.start();
        // t1.join(); // This line stop to run t2 thread, after t1 completion then t2 thread run. Means t1 thread execution done then t2 thread start to execute.
        // Otherwise this line generate the error, t1.join() method will throw an exception because if we try to join t1 thread whoKnow t1 thread is end,
        // in this case t1.join() not able to call t1 thread because it is ended! To solve this error we use try-catch method
        // try
        // {
        //     t1.join();
        // }
        // catch (Exception e)
        // {
        //     System.out.println(e);
        // }
        t2.start();
    }
}
