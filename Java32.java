// Day : 32 Method Overloading

public class Java32
{
    // Area of Triangle
    static float area(float base, float height)
    {
        return 0.5f * base * height;
    }

    // Area of Square
    static int area(int side)
    {
        return side * side;
    }

    // Area of Rectangle
    static int area(int length, int breadth)
    {
        return length * breadth;
    }

    // Area of Circle
    static float area(float radius)
    {
        return 3.14f * radius * radius;
    }

    public static void main(String[] args)
    {
        System.out.println("Area of Triangle = " + area(4.0f, 6.0f));
        System.out.println("Area of Square = " + area(4));
        System.out.println("Area of Rectangle = " + area(4, 6));
        System.out.println("Area of Circle = " + area(2.0f));

        // Arguments are actual!
        // Method overloading cannot be performed by changing the return type of methods.
    }
}
