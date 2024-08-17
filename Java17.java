// Day : 17 Relational and Logical Operators :

public class Java17
{
    public static void main(String[] args)
    {
        // Relational Operator :
        // ==(equals), >=(greater than and equal to), >, <, <=(), !=(Not equals)
        int age = 17;
        if(age >= 16)
        {
            System.out.println("You are eligible to fill the sarkari form.");
        }
        else
        {
            System.out.println("You are not eligible to fill the sarkari form.");
        }

        System.out.println("\n");

        // Logical Operator : AND :
        // Associativity of logical operator is Left To Right.

        System.out.println("Logical Operator : AND :");

        // case : 1
        boolean a = true;
        boolean b = false;
        if(a && b)
        {
            System.out.println("True && False = True");
        }
        else
        {
            System.out.println("True && False = False");
        }

        // case : 2
        a = false;
        // b = false;
        if(a && b)
        {
            System.out.println("False && False = True");
        }
        else
        {
            System.out.println("False && False = False");
        }

        // case : 3
        a = true;
        b = true;
        if(a && b)
        {
            System.out.println("True && True = True");
        }
        else
        {
            System.out.println("True && True = False");
        }

        // case : 4
        a = false;
        b = true;
        if(a && b)
        {
            System.out.println("False && True = True");
        }
        else
        {
            System.out.println("False && True = False");
        }

        // We can also run for 3 variables.

        System.out.println("\n");

        // Logical Operator : OR :

        System.out.println("Logical Operator : OR :");

        // case : 1
        a = true;
        b = false;
        if(a || b)
        {
            System.out.println("True || False = True");
        }
        else
        {
            System.out.println("True || False = False");
        }

        // case : 2
        a = false;
        // b = false;
        if(a || b)
        {
            System.out.println("False || False = True");
        }
        else
        {
            System.out.println("False || False = False");
        }

        // case : 3
        a = true;
        b = true;
        if(a || b)
        {
            System.out.println("True || True = True");
        }
        else
        {
            System.out.println("True || True = False");
        }

        // case : 4
        a = false;
        b = true;
        if(a || b)
        {
            System.out.println("False || True = True");
        }
        else
        {
            System.out.println("False || True = False");
        }

        System.out.println("\n");

        // Logical Operator : NOT :

        System.out.println("Logical Operator : NOT : doing reverse and vice-versa");

        System.out.println("Not(a) is = " + !a);
        System.out.println("Not(b) is = " + !b);
    }
}
