public class A16_Operators {

    public static void main(String[] args) {

        //Unary operators
        int x = 10;
        int y = ++x;
        System.out.println("x: " + x);
        System.out.println("Y: " + y);

        int z = y++;
        System.out.println("z: " + z);
        System.out.println("y: " + y);

        int a = --x;
        System.out.println("a: " + a);
        System.out.println("x: " + x);

        int b = x--;
        System.out.println("b: " + b);
        System.out.println("x: " + x);

        //Arithmetic operators

        int c = 10;
        int d = 20;
        System.out.println("Addition of c and d: " + (c + d));
        System.out.println("Subtraction of c and d: " + (c - d));
        System.out.println("Multiplication of c and d: " + (c * d));
        System.out.println("division of c and d: " + (c / d));
        System.out.println("Modulo of c and d: " + (c % d));

        //string concatenation

        int e = 10;
        String f = "abc";
        int g = 20;
        System.out.println(e + f);
        //compiler starts evaluation from left f is string so it appends e and g value as string will not do integer additon
        System.out.println(f + e + g);
        //e and g are integers, so it does integer addition and then concatenate with string
        System.out.println( e + g + f);

        //Relational Operators
        int h = (int) 'a';
        int i = (int) 'A';
        System.out.println("'a' ascii value: " + h);
        System.out.println("'A' ascii value: " + i);
        System.out.println(10 < 20);
        System.out.println(10 > 'a');
        System.out.println(100 > 'A');
        System.out.println('a' < 'A');

        //Bitwise Operators
        System.out.println(true & true);// returns true if both are true
        System.out.println(true | false);// returns true if either of them is true
        System.out.println(false ^ true);// returns true if they are different
        System.out.println(4 & 5);// here bitwise comparison happens
        System.out.println(4 | 5);// here bitwise comparison happens
        System.out.println(4 ^ 5);// here bitwise comparison happens

        //Bitwise unary operators
        System.out.println(~10);
        System.out.println(!true);

        //Short circuit Operators
        // && ||
        System.out.println(false && true);//in case of &&, if first operand is false then it will not even check other operand.
        System.out.println(true || false);//in case of ||, if first operand is true then it will not even check other operand.

        //assignment operators
        int k = 100;
        int l, m, n ;
        l = m = n = 200;
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);

        int o = 20;
        o += n;// assignment operator with shorthand
        System.out.println(o);

        //ternary operator
        int p = 10;
        int q = 20;
        String result = (p > q) ? "p is grater" : "q is greater";
        System.out.println(result);




    }
}
