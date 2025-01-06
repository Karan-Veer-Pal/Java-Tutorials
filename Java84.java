// Day : 84 Throw vs Throws

class NegativeRadiusException84 extends Exception
{
    @Override
    public String toString()
    {
        return "Area cannot be Negative!";
    }

    @Override
    public String getMessage()
    {
        return "Radius cannot be Negative!";
    }
}

public class Java84
{
    public static double area(int r) throws NegativeRadiusException84
    {
        if(r <  0)
        {
            throw new NegativeRadiusException84();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException
    {
        int result = a/b;
        return result;
    }
    public static void main(String[] args)
    {
        try
        {
            int c = divide(6, 0);
            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println("Exception!");
        }

        try
        {
            double ar = area(-2);
            System.out.println(ar);
        }
        catch(Exception e)
        {
            System.out.println(" Exception in Area : Minus radius cannot be accessed!");
        }
    }
}
