// Day : 71 Creating a Java Thread Using Runnable Interface

class MyThreadRunnable71_1 implements Runnable
{
    public void run()
    {
        int i = 0;
        while(i < 100)
        {
            System.out.println("I'm a thread 1 not a threat!");
            i++;
        }
    }
}

class MyThreadRunnable71_2 implements Runnable
{
    public void run()
    {
        int i = 0;
        while(i < 100)
        {
            System.out.println("I'm a thread 2 not a threat!");
            i++;
        }
    }
}

public class Java71
{
    public static void main(String[] args)
    {
        MyThreadRunnable71_1 bullet1 = new MyThreadRunnable71_1();
        Thread gun1 = new Thread(bullet1); // In which we make a thread and gave them a runnable thing like bullet1
        MyThreadRunnable71_2 bullet2 = new MyThreadRunnable71_2();
        Thread gun2 = new Thread(bullet2); // Analogy : insert a bullet into a gun.

        gun1.start();
        gun2.start();
    }
}

// Runnable Interface Vs Extending Thread Class :
// Since we've discussed both the ways to create a thread in Java. There might be a question in your mind that should we use the Runnable interface or Thread class to implement a
// thread in Java. Let me answer this question for you. The Runnable interface is preferred over extending the Thread class because of the following reasons :

// As multiple inheritance is not supported in Java, it is impossible to extend the Thread class if your class had already extended some other class.
// While implementing Runnable, we do not modify or change the thread's behavior.
// More memory is required while extending the Thread class because each thread creates a unique object.
// Less memory is required while implementing Runnable because multiple threads share the same object.
