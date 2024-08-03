// Day : 08 Operators, Types of Operators & Expressions in Java

// Operator are used to perform operation on variables and values.

// Types of Operators :-
//Arithmetic Operators -> +, -, *, /, %, ++, --
// Assignment Operator -> =, +=, -=, *=, /=
// Comparison Operator -> ==, >=, <=
// Logical Operator -> &&, ||, !
// Bitwise Operator -> &, | (Operates bitwise)

public class Java08
{
    public static void main(String[] args)
    {
        // Arithmetic Operator : Cannot work on boolean.
        int a = 5;
        int b = 8 % a;
        System.out.print("Modulo Operator 5 % 8 = "); // Modulo operator can work on float and double also.
        System.out.println(b);

        // Assignment Operator
        b += 3;
        System.out.print("Assignment Operator 3 + 3 = ");
        System.out.println(b);

        // Comparison Operator
        System.out.print("Comparison Operator 6 == 6 = ");
        System.out.println(6 == 6);

        // Logical Operator AND
        System.out.print("Logical Operator AND 9 > 3 && 9 > 2 = ");
        System.out.println(9 > 3 && 9 > 2);

        // Logical Operator OR
        System.out.print("Logical Operator OR 9 > 3 && 9 < 2 = ");
        System.out.println(9 > 3 || 9 < 2);

        // Bitwise Operator OR
        System.out.print("Bitwise Operator 5 & 4 = ");
        System.out.println(5 & 4);
    }
}
