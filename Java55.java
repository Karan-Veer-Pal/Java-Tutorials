// Day : 55 Abstract Class VS Interfaces

interface Bicycle
{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface CycleThings
{
    void blowHorn();
    void air();
}

class AvonCycle implements Bicycle, CycleThings
{
    void Oil()
    {
        System.out.println("Oiling!");
    }
    // When you implement the Interface method then we must need to make the public methods
    public void applyBrake(int decrement)
    {
        System.out.println("Applying Break!!");
    }
    public void speedUp(int increment)
    {
        System.out.println("Press Accelerator!!");
    }
    public void blowHorn()
    {
        System.out.println("Horn Blowing!!");
    }
    public void air()
    {
        System.out.println("Ais is Full!!");
    }
}

public class Java55
{
    public static void main(String[] args)
    {
        AvonCycle cycle1 = new AvonCycle();
        cycle1.applyBrake(1);

        // You can create properties in Interfaces!
        System.out.println("a = " + cycle1.a);

        // You cannot modify the properties of Interfaces as they are final! Default typeof a is final
        // cycle1.a = 456;
        // System.out.println("a = " + cycle1.a);

        cycle1.blowHorn();
        cycle1.air();
    }
}
// Interface is like a group of methods whose implements is mandatory!
