// Day : 87 Exercise : 6 Custom Calculator

// Custom Exceptions
class InvalidInputException extends Exception
{
    public InvalidInputException(String message)
    {
        super(message);
    }
}

class CannotDivideByZeroException extends Exception
{
    public CannotDivideByZeroException(String message)
    {
        super(message);
    }
}

class MaxInputException extends Exception
{
    public MaxInputException(String message)
    {
        super(message);
    }
}

class MaxMultiplierReachedException extends Exception
{
    public MaxMultiplierReachedException(String message)
    {
        super(message);
    }
}

public class Java87
{
    // Addition
    public static int add(int a, int b) throws MaxInputException, InvalidInputException
    {
        validateInputs(a, b);
        return a + b;
    }

    // Subtraction
    public static int subtract(int a, int b) throws MaxInputException, InvalidInputException
    {
        validateInputs(a, b);
        return a - b;
    }

    // Multiplication
    public static int multiply(int a, int b) throws MaxInputException, MaxMultiplierReachedException, InvalidInputException
    {
        validateInputs(a, b);
        if (a > 7000 || b > 7000)
        {
            throw new MaxMultiplierReachedException("Multiplication inputs cannot be greater than 7000.");
        }
        return a * b;
    }

    // Division
    public static double divide(int a, int b) throws MaxInputException, CannotDivideByZeroException, InvalidInputException
    {
        validateInputs(a, b);
        if (b == 0)
        {
            throw new CannotDivideByZeroException("Cannot divide by zero.");
        }
        return (double) a / b;
    }

    // Validate Inputs
    private static void validateInputs(int a, int b) throws MaxInputException, InvalidInputException
    {
        if (a > 100000 || b > 100000)
        {
            throw new MaxInputException("Inputs cannot be greater than 100000.");
        }
        if (!isNumeric(a) || !isNumeric(b))
        {
            throw new InvalidInputException("Inputs must be numeric.");
        }
    }

    // Check if value is numeric
    private static boolean isNumeric(int value)
    {
        // Since we are already dealing with int, it will always be numeric.
        return true;
    }
    public static void main(String[] args)
    {
        /*
        You have to create a custom calculator with following operations:
        1. + -> Addition.
        2. - -> Subtraction.
        3. * -> Multiplication.
        4. / -> Division.
        which throws the following exceptions :
        1. Invalid Input Exception. like 3 & 7.
        2. Cannot divide by 0 exception.
        3. Max input exception, if any of the input is greater than 100000.
        4. max multiplier reached Exception - Don't allow any multiplication input to be greater than 7000.
        */
        try
        {
            System.out.println("Addition: " + add(5000, 4000));
            System.out.println("Subtraction: " + subtract(5000, 3000));
            System.out.println("Multiplication: " + multiply(7000, 1000));
            System.out.println("Division: " + divide(10000, 5));
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
}
