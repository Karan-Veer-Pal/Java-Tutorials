// Day : 46 Constructor in Inheritance

class Base46
{
    Base46()
    {
        System.out.println("I'm a Constructor in Base Class!");
    }
    Base46(int x)
    {
        System.out.println("I'm an overloaded Constructor in Base Class! with value of x as : " + x);
    }
}

class Derived46 extends Base46
{
    Derived46()
    {
        // Use super keyword to call the parameterized constructor first! Defaultly Derived Class Object call the Simple constructor first from the Base Class!
        super(0);
        System.out.println("I'm a Constructor in Derived Class!");
    }
    Derived46(int x, int y)
    {
        super(x);
        System.out.println("I'm an overloaded Constructor in Derived Class! with value of y as : " + y);
    }
}

class ChildOfDerived46 extends Derived46
{
    ChildOfDerived46()
    {
        System.out.println("I'm a Child of Derived Constructor!");
    }
    ChildOfDerived46(int x, int y, int z)
    {
        super(x, y);
        System.out.println("I'm an overloaded Constructor in Derived Class! with value of z as : " + z);
    }
}

public class Java46
{
    public static void main(String[] args)
    {
        System.out.println("By using Base Class :");
        Base46 b1 = new Base46();

        System.out.println();

        System.out.println("By using Derived Class object 1:");
        Derived46 d1 = new Derived46();

        System.out.println();

        System.out.println("By using Derived Class object 2:");
        Derived46 d2 = new Derived46(14, 16);

        System.out.println();

        System.out.println("By using Child of Derived Class object 1:");
        ChildOfDerived46 cd1 = new ChildOfDerived46();

        System.out.println();

        System.out.println("By using Child of Derived Class object 2:");
        ChildOfDerived46 cd2 = new ChildOfDerived46(22, 33, 44);
    }
}

// Always Derived Class Constructor calls Base's Class Constructor automatically! when the Object is made of a Derived Class.