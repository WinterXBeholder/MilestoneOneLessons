import org.w3c.dom.ls.LSOutput;

public class Lesson02Strings {
    public static void main(String[] args) {
        System.out.println("hello strings");

        String message; // 1. declare a variabl with the string type
        message = "My dog has fleas."; // 2. assign a literal string value to the variable
        System.out.println(message); // 3. Print the contents of message to the console

        String validNoText = "";

        // multiline literals create "error: unclosed string literal":
        /*
        String message = "My dog has fleas
        and charm";
         */

        String escapeNewLine = "My dog has fleas\nand charm";
        System.out.println(escapeNewLine);

        String escapeDoubleQuote = "My \"Dog\" has fleas";
        System.out.println(escapeDoubleQuote);

        String escapeBackslash = "¯\\_(ツ)_/¯";
        System.out.println(escapeBackslash);
        /*
            \t - tab
            \r - carriage return
            \b - backspace
         */


        String gluedMessage = "school buses are kind of " + "orange";
        System.out.println(gluedMessage);  // school buses are kind of orange

        String redAndBlue = "red, blue, ";
        String primaryColors = redAndBlue + "yellow";
        System.out.println(primaryColors); // red, blue, yellow

        String name1 = "Fifine";
        String name2 = "Bendex";
        String adjective1 = "hopeful";
        String adjective2 = "churlish";
        System.out.println(name1 + " is " + adjective2);                // Fifine is churlish
        System.out.println(name2 + " is " + adjective1);                // Bendex is hopeful
        System.out.println(name1 + " will be " + adjective1 + " soon"); // Fifine will be hopeful soon

        int dozen = 12;
        boolean likesWalks = true;
        double n = -9.75;

        message = dozen + " is my favorite number."; // `dozen` is converted to a string
        System.out.println(message);                        // 12 is my favorite number.

        message = "Do you feel like a walk? " + likesWalks;  // `likesWalks` is converted to a string
        System.out.println(message);                        // Do you feel like a walk? true

        message = "The retail value is $" + n + ".";        // `n` is converted to a string
        System.out.println(message);                        // The retail value is $-9.75.

        int poorlyNamed = 22;
        String badName = "23";
        int awfulName = 23;

        System.out.println(poorlyNamed + badName);   // 2223, string concatenation
        System.out.println(poorlyNamed + awfulName); // 45,   addition

        int characterCount = message.length();
        System.out.println(characterCount);

        message = "baked apples";
        char fifthChar = message.charAt(4);
        System.out.println(fifthChar);  // d
        char eighthChar = message.charAt(7);
        System.out.println(eighthChar); // p
        char firstChar = message.charAt(0);
        System.out.println(firstChar);  // b
        // char c = message.charAt(-3); // CRASH, Error
        // c = message.charAt(25);      // Would CRASH if we hadn't already crashed!

        message = "baked apples";
        String fruit = message.substring(6);
        System.out.println(fruit);      // apples
        String personName = message.substring(3, 5);
        System.out.println(personName); // ed
        String empty = message.substring(5,5);
        System.out.println(empty);       // no output. a string with no characters

        message = "baked apples baked apples";
        String aBecomesI = message.replace('a', 'i');
        System.out.println(aBecomesI); // biked ipples
        String fresh = message.replace(" ", "-fresh-");
        System.out.println(fresh);     // baked-fresh-apples
        String cookies = message.replace("apples", "cookies");
        System.out.println(cookies);   // baked cookies

        String a = new String("turnip");
        String b = new String("squash blossom");
        String c = new String("turnip");
        System.out.println(a == b); // false
        System.out.println(a == c); // false
        System.out.println(a.equals(b)); // false
        System.out.println(a.equals(c)); // true

        a = new String("turnip");
        b = new String("TURNIP");
        c = new String("tUrNip");
        System.out.println(a.equals(b));           // false
        System.out.println(a.equalsIgnoreCase(b)); // true
        System.out.println(a.equals(c));           // false
        System.out.println(a.equalsIgnoreCase(c)); // true


        String value = null;
        // Run-time error!
        int l = value.length(); // Exception in thread "main" java.lang.NullPointerException
        // Calling .equals would cause a run-time error.
        // System.out.println(value.equals(null)); // java.lang.NullPointerException
        // But comparing to a null literal with the equality operator works fine.
        System.out.println(value == null); // true
    }
}
