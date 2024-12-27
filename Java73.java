// Day : 73 Constructor from Thread Class in Java

class Thread73_1 extends Thread
{
    public Thread73_1(String Name)
    {
        // We use super keyword here because this Thread class already have a constructor which take a name and this Thread73 class is extended from the Thread
        // class and we call the constructor of a Thread class that's why we use the super keyword here.
        super(Name);
    }
    public void run()
    {
        int i = 0;
        while(i < 50)
        {
            System.out.println("I am a thread 1!");
            i++;
        }
    }
}

public class Java73
{
    public static void main(String[] args)
    {
        Thread73_1 t1 = new Thread73_1("Karan Veer Pal");
        Thread73_1 t2 = new Thread73_1("Harsh Pal");

        t1.start();
        t2.start();

        System.out.println("The id of the thread t1 is : " + t1.getId());
        System.out.println("The name of the thread t1 is : " + t1.getName());

        System.out.println("The id of the thread t2 is : " + t2.getId());
        System.out.println("The name of the thread t2 is : " + t2.getName());

    }
}
