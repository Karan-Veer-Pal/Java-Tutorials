// Day : 58 Inheritance in Interface

interface baseSampleInterface
{
    void meth1();
    void meth2();
}

interface childSampleInterface extends baseSampleInterface
{
    // meth1 and meth2 present in this interface by using Inheritance.
    void meth3();
    void meth4();
}

class MySampleClass implements childSampleInterface
{
    public void meth1()
    {
        System.out.println("meth1!");
    }
    public void meth2()
    {
        System.out.println("meth2!");
    }
    public void meth3()
    {
        System.out.println("meth3!");
    }
    public void meth4()
    {
        System.out.println("meth4!");
    }
}

public class Java58
{
    public static void main(String[] args)
    {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
// We can't make class by extends Interface. Only implements the interface in class.
