// Day : 60 Chapter : 11 Practice Set

// Abstract Pen Class :
abstract class Pen60
{
    abstract void write60();
    abstract void refill60();
}

// Foundation Pen Class :
class FountainPen60 extends Pen60
{
    void changeNib60()
    {
        System.out.println("Need to change Refill!");
    }
    public void write60()
    {
        System.out.println("Pen refill is full for writing a Quotes!");
    }
    public void refill60()
    {
        System.out.println("Pen refill is Empty!");
    }
}

// Basic Animal Interface :
interface BasicAnimal60
{
    void eat60();
    void sleep60();
}
// Monkey Class :
class Monkey60
{
    void jump60()
    {
        System.out.println("Jumping....!");
    }
    void bite60()
    {
        System.out.println("Biting....!");
    }
}
// Human Class :
class Human60 extends Monkey60 implements BasicAnimal60
{
    void speak60()
    {
        System.out.println("Speaking....!");
    }

    @Override
    public void eat60()
    {
        System.out.println("Eating....!");
    }
    @Override
    public void sleep60()
    {
        System.out.println("Sleeping....!");
    }
}

// Abstract Telephone Class :
abstract class Telephone60
{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
// Smartphone Class :
class Smartphone60 extends Telephone60
{
    void busy60()
    {
        System.out.println("Busy with someone else....!");
    }

    void ring()
    {
        System.out.println("Ringing....!");
    }
    void lift()
    {
        System.out.println("Phone on a Call....!");
    }
    void disconnect()
    {
        System.out.println("Disconnected....!");
    }
}

interface TVRemote60
{
    void boxTVRemote60();
}
interface SmartTVRemote60 extends TVRemote60
{
    void LEDtvRemote60();
}
class TV60 implements SmartTVRemote60
{
    public void boxTVRemote60()
    {
        System.out.println("This is a Box TV Remote!");
    }
    public void LEDtvRemote60()
    {
        System.out.println("This is a LED Smart TV Remote!");
    }
}

public class Java60
{
    public static void main(String[] args)
    {
        // Qs1.) Create an abstract class Pen with methods write() and refill() as abstract methods?
        System.out.println("Program to create abstract class : Done");

        System.out.println("----------------------------------------");

        // Qs2.) Use the Pen class from Ques1 to create a concrete class FountainPen with additional method changeNib()?
        System.out.println("Program to create another class extract from Pen class with additional methods :");
        FountainPen60 P1 = new FountainPen60();
        P1.write60();
        P1.refill60();
        P1.changeNib60();

        System.out.println("----------------------------------------");

        // Qs3.) Create a class Monkey with jump and bite() methods. Create a class Human which inherits this Monkey class and implements Basic Animal interface with eat() and steep methods?
        System.out.println("Program to demonstrate Interface : ");
        Human60 H1 = new Human60();
        H1.bite60();
        H1.eat60();
        H1.jump60();
        H1.speak60();
        H1.sleep60();


        System.out.println("----------------------------------------");

        // Qs4.) Create c class Telephone with rings(), lift() and disconnect() methods as abstract methods. Create another class SmartTelephone and demonstrate polymorphism?
        System.out.println("Program to demonstrate Polymorphism : ");
        Telephone60 Tel1 = new Smartphone60();
        Tel1.ring();
        Tel1.lift();
        Tel1.disconnect();
        // Tel1.busy60(); --> Not possible because we use the Telephone class reference in smartphone

        System.out.println("----------------------------------------");

        // Qs5.) Demonstrate polymorphism using monkey class from Ques3?
        System.out.println("Program to demonstrate Polymorphism : ");
        Monkey60 Mon1 = new Human60();
        // Mon1.speak60(); --> Cannot use speak method because the reference is monkey which does not have speak method; Use only Monkey class methods
        Mon1.jump60();
        Mon1.bite60();

        BasicAnimal60 love = new Human60();
        love.eat60();
        love.sleep60();
        // love.speak60; --> generate error

        System.out.println("----------------------------------------");

        // Qs6.) Create an Interface TV remote and use it to inherits another Interface SmartTVRemote?
        System.out.println("Program to demonstrate Interface : Done");

        System.out.println("----------------------------------------");

        // Qs7.) Create a class TV which implements TV Remote interface from Ques6?
        System.out.println("Program to demonstrate Interface : ");
        TV60 Philips = new TV60();
        Philips.boxTVRemote60();
        Philips.LEDtvRemote60();

        System.out.println("----------------------------------------");
    }
}