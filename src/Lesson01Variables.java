public class Lesson01Variables {
    public static void main(String[] args) {

        /* declaration with assignment
        [type name] [variable name] = [value];
        */

        int linesOfCode;
        linesOfCode = 17;
        int dogCount = 0;
        int catCount = 123;
        int petCount = dogCount + catCount;
        System.out.println(petCount);

        int tacos = 3;
        System.out.println(tacos);
        tacos = 5;
        System.out.println(tacos);
        // no need to add 'int' a second time

        int hotdogs = 43;
        int total = hotdogs + tacos;
        System.out.println(total);
        tacos = 1;
        System.out.println(tacos);
        System.out.println(total);
        total = tacos + hotdogs;
        System.out.println(tacos);

        byte b = 8;
        short s = 16;
        int i = 32;   // int literal
        long lng = 64L; // long literal
        /* The following assignments fail.
        b = 1024;       // value is too big for a byte
        s = 75000;      // too big for a short
        i = 3000000000; // too big for an int
        */

        // widening conversions (allowed)
        s = b;    // a byte fits in a short
        i = s;    // a short fits in an int
        lng = i;  // an int fits in a long
        lng = 32; // `32` is an integer literal, it fits in a long

        /* narrowing conversions (not allowed)
        b = s;   // compiler error: cannot convert from short to byte
        s = i;   // compiler error: cannot convert from int to short
        i = lng; // compiler error: cannot convert from long to int */

        // floating-point types
        float f = 32.0f; // float literal
        double d = 64.0; // double literal

        // widening conversation (allowed)
        d = f;   // a float fits in a double
        f = i;   // an int fits in a float
        d = lng; // a long fits in a double

        /*
         narrowing conversions (not allowed)
         i = f;   // compiler error: cannot convert from float to int
         f = d;   // compiler error: cannot convert from double to float
         lng = d; // compiler error: cannot convert from double to long
        */

        float sum = 3.55f + 0.3f; //sum is 3.85
        f = -0.33f;
        float floatResult = sum + f; // result is 3.52
        System.out.println(floatResult);
        double value = 9.22 - 1.1; // value is 8.120000000000001
        System.out.println(value);
        d = 3.32;
        double doubleResult = value - d; // result is 4.800000000000001
        System.out.println(doubleResult);

        int product = 20 * 4;     // product is 80
        i = 3;
        int result = product * i; // result is 240

        long longValue = 100L / 2L;         // value is 50
        longValue = 100L / 3L;              // value is 33 without decimals
                                            // whole number types `int` and `long` discard decimal results.
                                            // the value is truncated.
        lng = 11;                           // the literal `11` is an int but it fits in a long
        long longResult = longValue / lng;  // result is 3

        int remainder = 100 % 3;    // remainder is 1
        remainder = 100 % 13;       // remainder is 9
        i = 3;
        int moduloResult = remainder % i; // result is 0

        i = 25;
        int chainResult = 100 / (2 + 3) * i % (20 - 3); // result is 7

        int intExample; // Variable declaration is a statement.

        /* We can't use the value of a declaration somewhere else
        because a value isn't produced.
        `int total = int tacos;` is a syntax error. */

        System.out.println("hello world"); // println is a method call that doesn't produce a value
        /* so it is a statement.
        Some methods _do_ produce a value, but println does not.

        We can't use println's value somewhere else because a value isn't produced.
        `int letterCount = System.out.println("hello world");`
        is a complier error:
        "Type mismatch: cannot convert void to int" */

        boolean isFast = true;
        boolean canFly = false;

        boolean andResult = true && false; // result is false
        andResult = false && false;        // result is false
        andResult = false && true;         // result is false
        andResult = true && true;          // result is true

        boolean orResult = true || false; // result is true
        orResult = false || false;        // result is false
        orResult = false || true;         // result is true
        orResult = true || true;          // result is true

        boolean notResult = !true; // result is false
        notResult = !false;        // result is true
        boolean yes = true;
        boolean no = false;
        notResult = !(yes && no || (yes || true)); // result is false
        notResult = !yes && no || (yes || true);           // result is true

        int one = 1;
        int negativeOne = -1;
        boolean equalResult = one == negativeOne; // result is false
        equalResult = (one == 1);                 // result is true, grouping with parentheses is optional

        char a = 'a';
        char z = 'z';
        equalResult = a == z;                     // result is false
        equalResult = 'z' == z;                   // result is true

        boolean comparisonResult = 1 < 25; // result is true
        comparisonResult = 1 <= 0;         // result is false
        comparisonResult = 5 <= 5;         // result is true
        comparisonResult = 3.44 > 1.2;     // result is true
        comparisonResult = -5.55 >= -5.0;  // result is false
    }
}
