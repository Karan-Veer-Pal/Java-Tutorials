// Day : 52 Chapter : 10 Practice Set

import java.util.Scanner;

// Circle Class :
class Circle52
{
    public int radius;

    Circle52(int r)
    {
        this.radius = r;
    }
    public void getRadius()
    {
        System.out.println("Radius of circle = " + radius);
    }
    public double areaCircle()
    {
        return Math.PI * this.radius * this.radius;
    }
};

// Cylinder Class :
class Cylinder52 extends Circle52
{
    public int height;

    Cylinder52(int r, int h)
    {
        super(r);
        this.height = h;
    }
    public void getHeight()
    {
        System.out.println("Height of Cylinder = " + height);
    }
    public double volumeCylinder()
    {
        return Math.PI * this.radius * this.radius * this.height;
    }
};

// Rectangle Class :
class Rectangle52
{
    public int length;
    public int breadth;

    Rectangle52(int l, int b)
    {
        this.length = l;
        this.breadth = b;
    }
    public void setLenBred(int l, int b)
    {
        this.length = l;
        this.breadth = b;
    }
    public void getLB()
    {
        System.out.println("Length = " + length + "Breadth = " + breadth);
    }
    public double areaRec()
    {
        return length * breadth;
    }
};

// Cuboid Class :
class Cuboid52 extends Rectangle52
{
    public int height;

    Cuboid52(int l, int b, int h) {
        super(l, b);
        height = h;
    }
    public void setLenBred(int l, int b, int h)
    {
        this.length = l;
        this.breadth = b;
        this.height = h;
    }
    public void getLBH()
    {
        System.out.println("Length = " + length + " Breadth = " + breadth + " Height = " + height);
    }
    public double volumeCuboid()
    {
        return length * breadth * height;
    }
};

public class Java52
{
    public static void main(String[] args)
    {
        Scanner variable = new Scanner(System.in);

        // Qs1.) Create a class circle and use inheritance to create another class cylinder from it?
        System.out.println("Program to show inheritance :");
        Cylinder52 cy1 = new Cylinder52(2, 3);
        cy1.getRadius();
        cy1.getHeight();

        System.out.println("----------------------------------------");

        // Qs2.) Create a class Rectangle and use inheritance to create another class Cuboid. Try to keep it as close to real world scenario as possible?
        System.out.println("Program to show inheritance :");
        Cuboid52 cub1 = new Cuboid52(2, 3, 1);
        cub1.getLBH();

        System.out.println("----------------------------------------");

        // Qs3.) Create Methods for area and volume in 1?
        System.out.println("Program to print Area of Circle and Volume of Cylinder : ");
        System.out.println("Area of Circle = " + cy1.areaCircle());
        System.out.println("Volume of Cylinder = " + cy1.volumeCylinder());

        System.out.println("----------------------------------------");

        // Qs4.) Create a Methods for area and Volume in 2. Also create getter and setters?
        System.out.println("Program to print Area of Rectangle and Cuboid : ");
        cub1.setLenBred(1,1,1);
        System.out.println("Area of Rectangle = " + cub1.areaRec());
        System.out.println("Volume of Cuboid = " + cub1.volumeCuboid());

        System.out.println("----------------------------------------");

        /*
        Qs5.) What is the order of constructor execution for the following inheritance hierarchy :
        Base -> Derived1 -> Derives2
        Derived2 Obj = new Derived2();
        Which constructor will be executed and in what order without super keyword?
        */
        /*
            Answer : Base class constructor is executed first.
            Derived1 class constructor is executed second.
            Derived2 class constructor is executed last.
        */

        System.out.println("----------------------------------------");
    }
}
// Math.PI is used to take accurate Pi Value from the Math Library which is only give us in double data type!