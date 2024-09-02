// Day : 32 Methods

public class Java31
{
    static int logic1(int x, int y) // Method Name // With static
    {
        // Method Body
        int z;
        if(x > y)
        {
            z = x + y;
        }
        else
        {
            z = (x + y) * 5;
        }
        return z;
    }
    int logic2(int x, int y) // Method Name // Without static
    {
        // Method Body
        int z;
        if(x > y)
        {
            z = x - y;
        }
        else
        {
            z = (x - y) + y;
        }
        return z;
    }
    public static void main(String[] args)
    {
        int a = 7, b = 5, c;
        c = logic1(a,b); // Method Calling
        System.out.println("SUM 1 = " + c);

        int a1 = 5, b1 = 7, c1;
        c1 = logic1(a1,b1); // Method Calling
        System.out.println("SUM 2 = " + c1);

        // Another way to call Method : Method invoked using object creation
        int d, e;
        Java31 obj = new Java31(); // --> Object creation
        d = obj.logic2(a,b);
        System.out.println("SUBTRACT 1 = " + d);

        e = obj.logic2(a1,b1);
        System.out.println("SUBTRACT 2 = " + e);
    }
}
