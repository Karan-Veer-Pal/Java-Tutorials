// Dsy : 70 Creating a Thread by Extending Thread class

// Concurrency : Multiple tasks are in progress at the same time, but not necessarily executing at the same time. The CPU rapidly switches between tasks, -
// - creating the illusion of parallel execution. Concurrency is about managing multiple tasks, and it can be achieved with a single CPU core.
// Parallelism : Multiple tasks are executed simultaneously on multiple CPUs or cores. Parallelism is about executing multiple tasks, and it requires more than one CPU core.

class MyThread70_1 extends Thread // Thread class extend from the java.
{
    // We override the run() method from Thread class.
    @Override
    public void run()
    {
        int i = 0;
        while(i < 1000)
        {
            System.out.println("Thread 1 doing Chatting with her.");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class MyThread70_2 extends Thread // Thread class extend from the java.
{
    // We override the run() method from Thread class.
    @Override
    public void run()
    {
        int i = 0;
        while(i < 1000)
        {
            System.out.println("Thread 2 doing Cooking for him.");
            System.out.println("I am sad!");
            i++;
        }
    }
}

public class Java70
{
    public static void main(String[] args)
    {
        MyThread70_1 t1 = new MyThread70_1();
        MyThread70_2 t2 = new MyThread70_2();

        // we use start() method to run thread. start() method call run() method auto-internally.
        t1.start();
        t2.start();
    }
}
