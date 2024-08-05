// Day : 09 Associativity of Operators

// Presedence of Operator : The operator are applied and evaluated based on precedence. For example (+,-) has less precedence as compared to (*,/). Hence * & / are evaluated first. In case we like to change this order we use parenthesis.

// Associativity : Associativity tells the direction of execution of operators. It can either to left to right or right to left. 

// Precedence Level :
// 1 Parenthesis
// 2 *, /, %
// 3 +, -

// Associativity : When two same Operator occuring in a euation, precedence is same then Associativity will break the tie between operator.
// Parenthesis : Left to Right
// *, /, % : Left to Right
// +, - : Left to Right

public class Java09
{
    public static void main(String[] args)
    {
        // Precedence & Associativity :

        int a = 4 * 8 - 64 / 8;
        /*
            Here Precedence Level Work :
            32 - 64 / 8
            32 - 8
            24
        */
        System.out.println(a);

        int b = 40 / 8 - 2 * 8;
        /*
            Here Precedence Level Fail and Associativity Work :
            Precendence of * and / is equal. So to break this tie we see Associativity and associativity is like left to right, right to left
            * and / associativity is left to right
            5 - 2 * 8
            5 - 16
            -11
        */
        System.out.println(b);

        // Quick Quiz : Solution :

        // 1 :
        int x1 = 7;
        int y1 = 6;
        int z1 = x1 - y1 / 2;
        System.out.println(z1);

        // 2 :
        int a1 = 1;
        int b1 = 4;
        int c1 = 2;
        int d1 = ((b1 * b1) - (4 * a1 * c1)) / (2 * a1);
        System.out.println(d1);

        // 3 :
        int v = 4;
        int u = 2;
        int t = v * v - u * u;
        System.out.println(t);

        // 4 :
        int k = 5;
        int l = 8;
        int e = k * l - l;
        System.out.println(e);
    }
}
