// Day : 47 This Keyword and Super Keyword

class Base47
{
    int a;

    Base47(int a)
    {
        // this is a like a reference; a = a; this statement is confusing for compiler! so we use this.a = a;
        this.a = a;
    }
    public int getA()
    {
        return a;
    }
}
class Derived47 extends Base47
{
        Derived47(int c)
        {
            // When we make an object of derived class then by default derived's class object invoke the default constructor of a base class
            // but in base class default constructor is not written; so we use super keyword to invoke the desire or parameterized constructor from the base class!
            super(c);
            System.out.println("I'm a Constructor in Derived Class!");
        }
}

public class Java47
{
    public static void main(String[] args)
    {
        Base47 b1 = new Base47(5);
        System.out.println("A = " + b1.getA());

        Derived47 d1 = new Derived47(2);
        System.out.println("A = " + d1.getA());
    }
}
