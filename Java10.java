// Day : 10 Data Types of Expression, Increment/Decrement Operation

public class Java10
{
    public static void main(String[] args)
    {
        // Resulting datatype after arithmetic operation :
        System.out.println("Resulting datatype after arithmetic operation :");
        System.out.println(8 + 8.8f); // int + float -> float
        System.out.println(8.7 + 8.878); // float + double -> double

        // Increment/Decrement Operator :
        System.out.println("Increment/Decrement Operator :");
        // a++ means first print the value of a then increment the value of a, increment value doesn't show on first time run because increment a value internally
        // Same for Decrement
        int a = 4;
        System.out.println(a++); // 4
        System.out.println(a); // 5
        System.out.println(++a); // 6
        System.out.println(a); // 6

        // In character, after incremented the char value, it will shows a next character value
        char ch = 'C';
        ch++;
        System.out.println(ch);

        // Quick Quiz : What will be the value of the following expression(x) : value of x?
        int y = 7;
        int x = ++y * 2;
        System.out.println(x);
        // int x = ++y * 2; in which firstly calculate the ++y because of precedence level of Incre/Decre is high as compare of Arithmetic Operator, then * 8 will be evaluated.
    }
}

// Resulting Data Types after Arithmetic Operation :
// R = byte + short -> return int data type
// R = short + int -> return int data type
// R = long + float -> return float data type
// R = int + float -> return float data type
// R = char + int -> return int data type
// R = char + short -> return int data type
// R = long + double -> return double data type
// R = float + double -> return double data type