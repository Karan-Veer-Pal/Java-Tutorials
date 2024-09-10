// Day : 39 Chapter : 08 Practice Set

import java.util.Scanner;

// Employee Class :
class Employee1
{
    int salary;
    String name;

    public int getSalary()
    {
        return salary;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        name = n;
    }
};

// Cell Phone Class :
class cellphone
{
    public void ringVibra()
    {
        System.out.println("Phone is ringing or vibrating!");
    }
};

// Square Class :
class square
{
    int a;

    public void getSide(int side)
    {
        a = side;
    }

    public void calculateAreaAndPerimeter()
    {
        System.out.println("Side of Square is = " + a);

        int areaResult;
        int perimeterResult;

        areaResult = a*a;
        perimeterResult = 4*a;

        System.out.println("Area of Square is = " + areaResult);
        System.out.println("Perimeter of Square is = " + perimeterResult);
    }
};

// Rectangle Class
class rectangle
{
    int a;
    int b;

    public void getSide(int length, int breadth)
    {
        a = length;
        b = breadth;
    }

    public void calculateAreaAndPerimeter()
    {
        System.out.println("Length and Breadth of a Rectangle is = " + a + " and " + b + " respectively.");

        int areaResult;
        int perimeterResult;

        areaResult = a*b;
        perimeterResult = (a+b) * 2;

        System.out.println("Area of Rectangle is = " + areaResult);
        System.out.println("Perimeter of Rectangle is = " + perimeterResult);
    }
};

// TommyVecetti Class :
class TommyVecetti
{
    public void hit()
    {
        System.out.println("Hitting the Enemy!");
    }

    public void run()
    {
        System.out.println("Run from the Enemy!");
    }

    public void fire()
    {
        System.out.println("Firing on a Enemy!");
    }
};

// Circle Class
class circle
{
    float r;

    public void getSide(float radius)
    {
        r = radius;
    }

    public void calculateAreaAndPerimeter()
    {
        System.out.println("Radius of a Circle is = " + r);

        float areaResult;
        float circumferenceResult;

        areaResult = 3.14f * r * r;
        circumferenceResult = 2 * 3.14f * r;

        System.out.println("Area of Rectangle is = " + areaResult);
        System.out.println("Perimeter of Rectangle is = " + circumferenceResult);
    }
};

public class Java39
{
    public static void main(String[] args)
    {
        Scanner variable = new Scanner(System.in);

        // Qs1.) Create a class Employee with following properties and methods : salary(property)(int); getSalary(method returning int); name(property)(string); getName(method returning strina); setName(method changing name)?
        System.out.println("Program to create a Employee class :");
        Employee1 karan = new Employee1();
        karan.setName("Karan Veer Pal");
        System.out.println(karan.getName());
        karan.salary = 45;
        System.out.println("Salary = " + karan.getSalary());

        System.out.println("----------------------------------------");

        // Qs2.) Create a Class cellphone with method to print "ringing...", "vibrating..." etc?
        System.out.println("Program to print message using method of a class : ");
        cellphone pocoM3 = new cellphone();
        pocoM3.ringVibra();

        System.out.println("----------------------------------------");

        // Qs3.) Create a class square with a method to initialize its side, calculating area, perimeter etc?
        System.out.println("Program to print area and perimeter of a square using class : ");
        square sq = new square();
        sq.getSide(2);
        sq.calculateAreaAndPerimeter();

        System.out.println("----------------------------------------");

        // Qs4.) Create a class rectangle and Repeat 3?
        System.out.println("Program to print area and perimeter of a rectangle using class : ");
        rectangle rec = new rectangle();
        rec.getSide(2,3);
        rec.calculateAreaAndPerimeter();

        System.out.println("----------------------------------------");

        // Qs5.) Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting...), running, firing etc?
        System.out.println("Program to print some message of a game : ");
        TommyVecetti player1 = new TommyVecetti();
        player1.hit();
        player1.run();
        player1.fire();

        System.out.println("----------------------------------------");

        // Qs6.) Repeat 4 for Circle?
        System.out.println("Program to print area and perimeter of a circle using class : ");
        circle cir = new circle();
        cir.getSide(4);
        cir.calculateAreaAndPerimeter();
    }
}
