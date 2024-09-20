// Day : 44 Chapter : 09 Practice Set

import java.util.Scanner;

// Cylinder Class :
class cylinder44
{
    private float radius;
    private float height;

    // Constructor :
    public cylinder44()
    {

    }
    public cylinder44(float a, float b)
    {
        this.radius = a;
        this.height = b;
    }

    // Setter :
    public void set_rad_height(float a, float b)
    {
        this.radius = a;
        this.height = b;
    }
    // Getter :
    public void get_rad_height()
    {
        System.out.println("Radius of Cylinder = " + radius);
        System.out.println("Height of Cylinder = " + height);
    }

    // Area :
    // Math.PI is used to take accurate Pi Value from the Math Library which is only give us in double data type!
    public double area()
    {
        return ((2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius));
    }
    // Volume :
    public double volume()
    {
        return (Math.PI * radius * radius * height);
    }
};

// Rectangle Class :
class Rectangle44
{
    private int lenght;
    private int breadth;

    public Rectangle44()
    {
        this.breadth = 4;
        this.lenght = 5;
    }

    public Rectangle44(int lenght, int breadth) {
        this.lenght = lenght;
        this.breadth = breadth;
    }

    public int getLenght() {
        return lenght;
    }

    public int getBreadth() {
        return breadth;
    }
};

// Sphere Class :
class Sphere44
{
    private float radius;

    // Setter :
    public void setRadius(float a)
    {
        this.radius = a;
    }
    // Getter :
    public void getRadius()
    {
        System.out.println("Radius of Cylinder = " + radius);
    }

    // Area :
    // Math.PI is used to take accurate Pi Value from the Math Library which is only give us in double data type!
    public double area()
    {
        return (2* Math.PI * radius * radius);
    }
    // Volume :
    public double volume()
    {
        return ((4 / 3)* Math.PI * radius * radius * radius);
    }
};

public class Java44
{
    public static void main(String[] args)
    {
        Scanner variable = new Scanner(System.in);

        // Qs1.) Create a class cylinder and use getter and setters to set its radius and height?
        System.out.println("Program to create a Cylinder class :");
        cylinder44 c1 = new cylinder44();
        c1.set_rad_height(4.0f, 2.0f);
        c1.get_rad_height();

        System.out.println("----------------------------------------");

        // Qs2.) Use 1 to calculate surface area and volume of the cylinder?
        System.out.println("Program to calculate the area and volume of a Cylinder : ");
        System.out.println("Area of Cylinder = " + c1.area());
        System.out.println("Volume of Cylinder = " + c1.volume());

        System.out.println("----------------------------------------");

        // Qs3.) Use a Constructor and repeat 1?
        System.out.println("Program to print same work as 1 using Constructor : ");
        cylinder44 c2 = new cylinder44(4.0f, 2.0f);
        c2.get_rad_height();
        System.out.println("Area of Cylinder = " + c2.area());
        System.out.println("Volume of Cylinder = " + c2.volume());

        System.out.println("----------------------------------------");

//         Qs4.) Overload a constructor and repeat 1 to initialize a rectangle of length 4 and breadth 5 for using custom parameters?
        System.out.println("Program to show constructor overloading : ");
        Rectangle44 rec1 = new Rectangle44();
        System.out.println("Breadth = " + rec1.getBreadth());
        System.out.println("Lenght = " + rec1.getLenght());
        Rectangle44 rec2 = new Rectangle44(7,8);
        System.out.println("Breadth = " + rec2.getBreadth());
        System.out.println("Lenght = " + rec2.getLenght());

        System.out.println("----------------------------------------");

        // Qs5.) Repeat 1 for a Sphere?
        System.out.println("Program to create a Cylinder class :");
        Sphere44 s1 = new Sphere44();
        s1.setRadius(4.0f);
        s1.getRadius();
        System.out.println("Area of Cylinder = " + s1.area());
        System.out.println("Volume of Cylinder = " + s1.volume());

        System.out.println("----------------------------------------");
    }
}
