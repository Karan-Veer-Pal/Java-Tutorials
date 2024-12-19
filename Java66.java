// Day : 66 Access Modifiers

class C1
{
    public int w = 5;
    protected int x = 7;
    int y = 9;
    private int z = 1;

    public void meth1()
    {
        System.out.println("w = " + w);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}

public class Java66
{
    public static void main(String[] args)
    {
        // Use in same Class
        System.out.println("Use in same Class");
        C1 c = new C1();
        c.meth1();

        System.out.println();

        // Use in same Package
        System.out.println("Use in same Package");
        System.out.println(c.w);
        System.out.println(c.x);
        System.out.println(c.y);
        // System.out.println(c.z); // This line generate an error because we can't use private variable in same package!
    }
}
