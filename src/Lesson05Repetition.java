import java.util.Random;
import java.util.Scanner;


public class Lesson05Repetition {
    public static void main(String[] args) {
        /*
        while (true) {
            System.out.println("this message is repeated forever.");
        }
        while (false) {
            System.out.println("this message is never printed");
        } */

        int count = 10;                   // 01: go to 02
        System.out.println("Countdown:"); // 02: go to 04
                                          // 03: (empty)
        while (count > 0) {               // 04: if condition is true, go to 05, else go to 09
            System.out.println(count);    // 05: go to 06
            count--;                      // 06: go to 04 (back to the while condition!)
        }                                 // 07: (empty)
                                          // 08: (empty)
        System.out.println("Blast off!"); // 09: go to next available line
        String message = "Visit Mars.";
        int index = 0;
        while (index < message.length()) {
            System.out.println(message.charAt(index));
            index = index + 1;
        }

        Random rand = new Random();
        int a = 1;
        int b = 2;
        int c = 3;
        while (a < 50 || b % 2 == 0 && c % 3 != 0) {
            System.out.printf("%s,%s,%s%n", a, b, c);
            a = rand.nextInt(100);
            b = rand.nextInt(100); // random data type has the nextInt() method
            c = rand.nextInt(100); // nextInt() returns a new random number between 0 (inclusive) and the argument
        }

        Scanner console = new Scanner(System.in);
        String word = "";
        while (!word.equals("magic")) {
            System.out.print("Enter the \"magic\" word: ");
            word = console.nextLine();
        }
        System.out.println("You got it!");

        /*
        A do/while loop is similar to a while loop except that its condition is checked after its code block. A do/while's code block executes at least once.
            do {
                System.out.println("repeats forever");
            } while (true);

            do {
                System.out.println("prints once");
            } while (false);
         */

        count = 10;
        System.out.println("Countdown:");
        do {
            System.out.println(count);
            count--;
        } while (count > 0);
        System.out.println("Blastoff!");

        String input;
        do {
            System.out.print("Enter \"yes\" to accept our terms:");
            input = console.nextLine();
        } while (!input.equalsIgnoreCase("yes"));
        System.out.println("Thank you!");


        boolean isValid = false;
        // 1. the `do/while` approach doesn't repeat code
        // ==============================================
        do {
            System.out.println("1. Red");
            System.out.println("2. Blue");
            System.out.println("3. Yellow");
            System.out.print("Choose your favorite primary color [1-3]: ");
            input = console.nextLine();
            isValid = input.length() == 1 && input.charAt(0) >= '1' && input.charAt(0) <= '3';
            if (!isValid) {
                System.out.printf("\"%s\" is not a valid number between 1 and 3.%n", input);
            }
        } while (!isValid);
        // 2. the `while` approach repeats code
        // ====================================
        // it must prompt the user before its condition
        System.out.println("1. Red");
        System.out.println("2. Blue");
        System.out.println("3. Yellow");
        System.out.print("Choose your favorite primary color [1-3]: ");
        input = console.nextLine();
        isValid = input.length() == 1 && input.charAt(0) >= '1' && input.charAt(0) <= '3';
        if (!isValid) {
            System.out.printf("\"%s\" is not a valid number between 1 and 3.%n", input);
        }
        while (!isValid) {
            // and prompt again inside the code block
            System.out.println("1. Red");
            System.out.println("2. Blue");
            System.out.println("3. Yellow");
            System.out.print("Choose your favorite primary color [1-3]: ");
            input = console.nextLine();
            isValid = input.length() == 1 && input.charAt(0) >= '1' && input.charAt(0) <= '3';
            if (!isValid) {
                System.out.printf("\"%s\" is not a valid number between 1 and 3.%n", input);
            }
        }


         /*
        initialize: one-time set-up before looping begins
        condition: a boolean expression, looping continues while it evaluates to true
        after-each-loop: operations that occur after each loop

        for (<initialize> ; <condition>; <after-each-loop>) {
        }
        */
        message = "Looping...";
        //Standard Format
        for (int num = 0; num < message.length(); num++) {
            System.out.println(message.charAt(num));
        }
        // This loop is formatted to demonstrate the clauses.
        // The format isn't standard and may be confusing to a Java developer:
        for (int num = 0;
                index < message.length();
                index++) {
            System.out.println(message.charAt(num));
        }

        int sum = 0;
        // sum the numbers less than or equal to 10
        for (int n = 0; n <= 10; n++) {
            sum += n;
        }
        System.out.println("Sum: " + sum); // Sum: 55

        System.out.println("Countdown:");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Blast off!");

        // count by 5 starting at 4 less than 100
        for (int i = 4; i < 100; i += 5) {
            System.out.println(i);
        }

        message = "Grouper, Halibut, and Trout";
        String vowels = "aeiou";
        String result = "";
        // remove all vowels from `message` and store the new string in `result`
        for (int i = 0; i < message.length(); i++) {
            if (vowels.indexOf(message.charAt(i)) < 0) { // indexOf returns -1 if char doesn't exist
                result += message.charAt(i);
            }
        }
        System.out.println("Result: " + result); // Result: Grpr, Hlbt, nd Trt

        /* infinite, but not that useful
        for (;;) {
            System.out.println("prints forever");
        }
        */

        // two initializations
        // a two-part condition
        // and two after-loop operations
        for ( a = 10, b = 0; a > 0 && b < 10; a--, b += 2) {
            System.out.printf("a:%s, b:%s %n", a, b);
        }

        // clauses can also include method calls:
        System.out.print("Guess a fruit: ");
        for (String response = console.nextLine(); !response.equals("persimmon"); response = console.nextLine()) {
            System.out.printf("%s isn't correct.%nGuess a fruit: ", response);
        }
        System.out.println("You got it!");

        for (int i = 0; i < 10000; i++) {
            System.out.println("First line in the block: " + i);
            // a 10% chance to break out of the loop
            if (Math.random() > 0.9) {
                System.out.println("breaking!");
                break; // exit the for's code block immediately
            }
            System.out.println("Last line in the block: " + i);

            // The continue keyword stops the current iteration (or repetition) but keeps looping
            // print all even numbers under 100
            int n = 0;
            while (n < 100) {

                if (n % 2 == 1) {
                    n++;
                    continue; // skip remaining code, but continue looping
                }

                System.out.println(n);
                n++;
            }
            // print 20% of the numbers under 100, randomly
            for (n = 0; n < 100; n++) {

                if (Math.random() < 0.80) {
                    continue; // skip remaining code, but continue looping
                }

                System.out.print("lucky number: ");
                System.out.println(n);
            }
        }

        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {
                if (column == 3) {
                    break; // the column loops stops entirely, but not the row loop
                }
                System.out.printf("row: %s, column: %s%n", row, column);
            }
        }
    }
}
