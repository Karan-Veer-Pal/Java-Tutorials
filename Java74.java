// Day : 74 Java Thread Priorities

class Thread74 extends Thread
{
    public Thread74(String name)
    {
        super(name);
    }

    @Override
    public void run()
    {
        int i = 0;
        while(i < 10)
        {
            // System.out.println("I am a Thread! " + this.getName() + " and Priority is " + Thread.currentThread().getPriority());
            System.out.println("I am a Thread! " + this.getName());
            i++;
        }
     }
}

public class Java74
{
    public static void main(String[] args)
    {
        // When java have many threads, and java virtual machine(JVM) having a ready Queue and all ready to run thread comes in ready queue. Like T1, T2, T3, T4.
        // java.lang.Thread.MIN_PRIORITY = 1 (Default Value)
        // java.lang.Thread.NORM_PRIORITY = 5 (Default Value)
        // java.lang.Thread.MAX_PRIORITY = 10 (Default Value)

        Thread74 T1 = new Thread74("1imkaranveerpal");
        Thread74 T2 = new Thread74("2karan");
        Thread74 T3 = new Thread74("3harsh");
        Thread74 T4 = new Thread74("4imharshpal");
        Thread74 T5 = new Thread74("5imanmol (*Most Important!)");

        // Set Priority :
        T5.setPriority(Thread.MAX_PRIORITY); // After that this thread will run more as compare to another.
        T1.setPriority(Thread.MIN_PRIORITY); // And this will run less as compare to another.
        T2.setPriority(Thread.MIN_PRIORITY); // And this will run less as compare to another.
        T3.setPriority(Thread.MIN_PRIORITY); // And this will run less as compare to another.
        T4.setPriority(Thread.MIN_PRIORITY); // And this will run less as compare to another.

        T1.start();
        T2.start();
        T3.start();
        T4.start();
        T5.start();

        // Default Priority is 3, 1, 4, 2, 5. Default priority automatically changed when run.
        // Which thread gets executed is highly dependent on the Operating System.
    }
}

// Java Thread Priorities :
// In a Multithreading environment, all the threads which are ready and waiting to be executed are present in the Ready queue. The thread scheduler is
// responsible for assigning the processor to a thread. But the question is on what basis the thread scheduler decides that a particular thread will run
// before other threads. Here comes the concept of priority in the picture.

// 1.) Every single thread created in Java has some priority associated with it.
// 2.) The programmer can explicitly assign the priority to the thread. Otherwise, JVM automatically assigns priority while creating the thread.
// 3.) In Java, we can specify the priority of each thread relative to other threads. Those threads having higher priorities get greater access to the
// available resources than lower priorities threads.
// 4.) Thread scheduler will use priorities while allocating processor.
// 5.) The valid range of thread priorities is 1 to 10 (but not 0 to 10), where 1 is the least priority, and 10 is the higher priority.
// 6.) If there is more than one thread of the same priority in the queue, then the thread scheduler picks any one of them to execute.
// The following static final integer constants are defined in the Thread class:
// MIN_PRIORITY: Minimum priority that a thread can have. Value is 1.
// NORM_PRIORITY: This is the default priority automatically assigned by JVM to a thread if a programmer does not explicitly set the priority of that
// thread. Value is 5.
// MAX_PRIORITY: Maximum priority that a thread can have. Value is 10.
