// Day : 76 Chapter : 13 Practice Set

class Thread76_1 extends Thread
{
    public void run()
    {
        for(int i = 0; i < 15; i++)
        {
            System.out.println("Thank You!");
            System.out.println("I am a Thread! and Priority is " + Thread.currentThread().getPriority());
        }
    }
}

class Thread76_2 extends Thread
{
    public void run()
    {
        for(int i = 0; i < 15; i++)
        {
            System.out.println("Welcome!");
            // Thread.sleep(8); // It also use try-catch method for exception handling. Here, we use sleep() method to stop the thread 1 for 8 millis second.
            try
            {
                Thread.sleep(8);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("I am a Thread! and Priority is " + Thread.currentThread().getPriority());
        }
    }
}

public class Java76
{
    public static void main(String[] args)
    {
        // Qs1.) WAP to print "Thank You" and "Welcome" continuously on the screen in Java using Threads?
        System.out.println("Program to print message using Threads : ");

        Thread76_1 T1 = new Thread76_1();
        Thread76_2 T2 = new Thread76_2();
        T1.start();
        T2.start();

//        System.out.println("----------------------------------------");

        // Qs2.) Add a sleep() method in welcome thread of question 1 to delay its execution for 200ms?
        System.out.println("Program to add a sleep() method in second method for delay purpose :");

        // Thread76_1 T1 = new Thread76_1();
        // Thread76_2 T2 = new Thread76_2();
        T1.start();
        T2.start();

//        System.out.println("----------------------------------------");

        // Qs3.) Demonstrate getpriority() and setPriority methods in Java Threads?
        System.out.println("Program to demonstrate getpriority() and setPriority Methods : ");

        // Thread76_1 T1 = new Thread76_1();
        // Thread76_2 T2 = new Thread76_2();
        T1.setPriority(Thread.MAX_PRIORITY);
        T2.setPriority(4);
        T1.start();
        T2.start();
        T1.getPriority();
        T2.getPriority();

//        System.out.println("----------------------------------------");

        // Qs4.) How to you get state of a given thread in Java?
        System.out.println("Program to get state of a Thread : ");

        // Thread76_1 T1 = new Thread76_1();
        // Thread76_2 T2 = new Thread76_2();
        System.out.println("Thread State = " + T1.getState());
        System.out.println("Thread State = " + T2.getState());
        T1.start();
        T2.start();
        System.out.println("Thread State = " + T1.getState());
        System.out.println("Thread State = " + T2.getState());

//        System.out.println("----------------------------------------");

        // Qs5.) How do you get reference to the current thread in Java?
        System.out.println("Program to get reference to the current thread : ");

        // Thread76_1 T1 = new Thread76_1();
        // Thread76_2 T2 = new Thread76_2();
        T1.start();
        T2.start();
        System.out.println(Thread.currentThread().getState()); // // Take a reference of getsState() bu using currentThread()

        System.out.println("----------------------------------------");
    }
}
