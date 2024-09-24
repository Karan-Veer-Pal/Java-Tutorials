// Day : 48 Method Overriding

class A
{
    private int a;

    public void method1()
    {
        System.out.println("I'm method 1! of class A");
    }
    public void method2()
    {
        System.out.println("I'm method 2! of class A");
    }
}

class B extends A
{
    // It is Method Overriding
    @Override // It is notation to show the override the method
    public void method2()
    {
        System.out.println("I'm method 2! of class B");
    }
    public void method3()
    {
        System.out.println("I'm method 3! of class B");
    }
}

public class Java48
{
    public static void main(String[] args)
    {
        A a = new A();
        a.method2();

        B b = new B();
        b.method2();
    }
}
// Simply, One class is inherited from another class then, we want to make some change in method from derived class to base class then we use Method Overriding!