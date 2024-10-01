// Day : 53 Abstract Class & Abstract Methods

abstract class Parent53
{
    public Parent53()
    {
        System.out.println("I'm constructor of Base Class!");
    }
    public void sayHello()
    {
        System.out.println("Hello!");
    }
    abstract public void greet();
    abstract public void greet2();
};

class Child531 extends Parent53
{
    public void greet()
    {
        System.out.println("Good Morning!");
    }
    public void greet2()
    {
        System.out.println("Good Evening!");
    }
};

/*
It is not possible; when we make an abstract class then we inherit the other class for only overriding;
In other case if we make an inherit abstract class then we make either overriding or abstracted inherited class of an abstract class.
Like this :
abstract class Child532 extends Parent53
{
    public void th()
    {
        System.out.println("Good Morning!");
    }
}
Ir this case Parent53 class is a way to make other classes.
Cases :
1.) Abstract Class (fake) = make concrete class (real). In real class, we must implement all the methods of Abstract class.
2.) Abstract Class (fake) = making other Abstract Class (fake).
*/

public class Java53
{
    public static void main(String[] args)
    {
        Child531 c1 = new Child531(); // Allowed
        c1.greet();
        c1.greet2();
        // Parent53 p1 = new Parent53(); // Not Allowed : Because it is an abstract class.
        // Child532 c2 = new Child532(); // Not Allowed : Because it is an abstract class.
    }
}

// Abstract Class is not able to make own object because it is not like a class, it is a standard to make other classes
