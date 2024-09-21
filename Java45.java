// Day : 45 Inheritance

class Base45
{
    int x;

    public void setX(int a)
    {
        System.out.println("I am in Base and Setting X Now!");
        this.x = a;
    }
    public int getX()
    {
        return x;
    }

    public void printMe()
    {
        System.out.println("I am a Constructor of X!");
    }
}

class Derived45 extends Base45
{
    int y;

    public void setY(int a)
    {
        System.out.println("I am in Derived and Setting Y Now!");
        this.y = a;
    }
    public int getY()
    {
        return y;
    }

    public void printME()
    {
        System.out.println("I am a Constructor of Y!");
    }
}

class Animal45
{
    String yes;
    String no;

    public void animalY(String Y)
    {
        this.yes = Y;
    }
    public String printAnimalY()
    {
        return yes;
    }
    public void animalN(String N)
    {
        this.no = N;
    }
    public String printAnimalN()
    {
        return no;
    }
}

class Dog45 extends Animal45
{
    String yes;
    String no;

    public void dogBarkY(String Y)
    {
        this.yes = Y;
    }
    public String printBarkY()
    {
        return yes;
    }
    public void dogBarkN(String N)
    {
        this.no = N;
    }
    public String printBarkN()
    {
        return no;
    }
}

public class Java45
{
    public static void main(String[] args)
    {
        // Using Base Class
        Base45 b1 = new Base45();
        b1.setX(4);
        System.out.println("X = " + b1.getX() + " using Base Class\n");

        // Using Derived Class
        Derived45 d1 = new Derived45();
        d1.setX(4);
        System.out.println("X = " + d1.getX() + " using Derived Class");
        d1.setY(2);
        System.out.println("Y = " + d1.getY() + " using Derived Class");

        System.out.println();

        // Note : Private things are not accessible by derived Class from Base Class!

        // Quick Quiz : Create a class Animal and Derive another class Dog from it?
        System.out.println("Quick Quiz = ");

        Animal45 dog = new Animal45();
        dog.animalY("Yes It is a Animal!");
        System.out.println(dog.printAnimalY());

        Dog45 doggy = new Dog45();
        doggy.dogBarkN("No Dog is not Barking!");
        System.out.println(doggy.printBarkN());
    }
}
