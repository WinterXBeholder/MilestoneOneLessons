import java.sql.SQLOutput;
import java.util.Scanner;

public class Lesson06Methods {
    public static void main(String[] args) {

        String firstName = readRequiredString("Enter your first name: ");
        String lastName = readRequiredString("Enter your last name: ");
        String favoriteFood = readRequiredString("Enter your favorite food: ");
        System.out.println("First name   : " + firstName);
        System.out.println("Last name    : " + lastName);
        System.out.println("Favorite food : " + favoriteFood);

        String name = "Guillermo";
        // An argument can be a variable.
        // Output can be stored in a variable.
        String message = createHello(name);
        System.out.println(message);
        // An argument can be a literal.
        message = createHello("Avivah");
        System.out.println(message);
        String honorary = "Dr. ";
        // An argument can be any expression of the correct data type.
        // Output can be used immediately as input to another method.
        // Here, it's used as an input for the `println` method.
        System.out.println(createHello(honorary + name));

        int result = minimum(1, 2, 3);
        System.out.println(result);
        System.out.println(minimum(1000, 0, -1000));
        System.out.println(minimum(255, 255, 255));

        char letter = randomLetter();
        System.out.println(letter);
        System.out.println(randomLetter());
        System.out.println(randomLetter());

        System.out.println("Your garden:");
        repeatPrintln("hosta", 3);
        repeatPrintln("peony", 2);
        repeatPrintln("dandelion", 3);
        repeatPrintln("ghostflower", -9);

        // Using Overloading:
        // Pass 2 arguments.
        String fullName = createFullName("Powell", "Tatters");
        System.out.println(fullName);                                    // Powell Tatters
        String title = "Professor";
        firstName = "Leisha";
        lastName = "Yendle";
        // Pass 3 arguments.
        fullName = createFullName(title, firstName, lastName);
        System.out.println(fullName);                                    // Professor Leisha Yendle
        // Pass 3 arguments.
        System.out.println(createFullName("Senator", "Ly", "De Lasci")); // Senator Ly De Lasci

    }

    // Overloading is when you have multiple methods with identical names, but different signatures:
    // Signature: createFullName(String, String)
    public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
    // Signature: createFullName(String, String, String)
    public static String createFullName(String title, String firstName, String lastName) {
        // We can call the 2 argument version of createFullName
        // to re-use the logic.
        return title + " " + createFullName(firstName, lastName);
    }
    /* BAD OVLERLOADING BELOW:
        // Error message: Duplicate method doSomething(int, int)
        public static int doSomething(int small, int big) {
            return (big - small) / 2;
        }
        // Error message: Duplicate method doSomething(int, int)
        public static void doSomething(int a, int b) {
            System.out.println("a: " + a + " b: " + b);
        }
     */


    /*
        public            static            String        readRequiredString(String       prompt      ) {
        [access modifier] [static modifier] [output type] [name]            ([param type] [param name]) {

            return           "value";
            [return keyword] [value that matches the data type of output]
        }

        public static String readRequiredString(String prompt) {
        // code, code, code...
        return "value";
        }


        String firstName       = readRequiredString("Enter your first name: "       );
        [type] [variable name] = [name]            ([expression matching param type]);

        String firstName = readRequiredString("Enter your first name: ");
    */
    public static void repeatPrintln(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }

    public static char randomLetter() {
        String letters = "abcdefg";
        int index =(int) (Math.random() * letters.length());
        return letters.charAt(index);
    }

    public static int minimum(int a, int b, int c) {
        int min = Math.min(a, b);
        return Math.min(b, c);
    }

    public static String createHello(String value) {
        return "Hello " + value;
    }

    public static String readRequiredString(String prompt) {
        Scanner console = new Scanner(System.in);
        String result;
        do {
            System.out.print(prompt);
            result = console.nextLine();
        } while (result.length() == 0);
        return result;
    }

    public static void methodlessForms(String[] args) {
        Scanner console = new Scanner(System.in);

        String firstName;
        do {
            System.out.print("Enter your first name: ");
            firstName = console.nextLine();
        } while (firstName.length() == 0);

        String lastName;
        do {
            System.out.print("Enter your last name: ");
            lastName = console.nextLine();
        } while (lastName.length() == 0);

        String favoriteFood;
        do {
            System.out.print("Enter your favorite food: ");
            favoriteFood = console.nextLine();
        } while (favoriteFood.length() == 0);

        System.out.println("First name   : " + firstName);
        System.out.println("Last name    : " + lastName);
        System.out.println("Favorite food : " + favoriteFood);
}
}
