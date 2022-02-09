import java.util.Scanner;

public class Lesson03Console {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = console.nextLine();
        System.out.println("Your name is: " + name);
        System.out.println(console);

        System.out.println("Enter a Grocery Item");
        String grocery = console.nextLine(); // standard nextLine, returns a string
        System.out.println("What does it cost?");
        String costInput = console.nextLine(); // all console inputs are strings first
        double cost = Double.parseDouble(costInput); // but can be parsed into doubles
        System.out.println("how many are available?");
        int inventory = Integer.parseInt(console.nextLine()); // can also parse directly
        System.out.println("Is it taxable? [true/false]");
        boolean isTaxable = Boolean.parseBoolean(console.nextLine());
        System.out.println();
        System.out.println("=======================");
        System.out.println(grocery + ": $" + cost);
        System.out.println("Current inventory: " + inventory);
        System.out.println("Taxable: " + isTaxable);
        // these parse methods crash on input that can't be parseed. We'll need error handling that we learn later.

        // change all question output to `print` which doesn't add new lines
        System.out.print("Enter a grocery item: ");
        grocery = console.nextLine();
        System.out.print("What does it cost?: ");
        cost = Double.parseDouble(console.nextLine());
        System.out.print("How many are available?: ");
        inventory = Integer.parseInt(console.nextLine());
        System.out.print("Is it taxable? [true/false]: ");
        isTaxable = Boolean.parseBoolean(console.nextLine());
        // report -- a mix of `print` and `println` to get the desired result
        // no string concatenation required
        System.out.println();
        System.out.println("=======================");
        System.out.print(grocery);
        System.out.print(": $");
        System.out.println(cost);
        System.out.print("Current inventory: ");
        System.out.println(inventory);
        System.out.print("Taxable: ");
        System.out.println(isTaxable);

        // The format string: "%s has %s %s and can jump %s inches vertically."
        // other arguments replace each `%s` in order
        System.out.printf("%s has %s %s and can jump %s inches vertically.", "Nomi", 3, "dogs", 37.68);
        int other = 3;
        double stockPrice = 87.6549513216;
        System.out.printf("%d %n", other);     // default string as whole number with a newline
        System.out.printf("%d%% %n", other);     // same with a percent sign
        System.out.printf("%s %n", stockPrice);     // default string terminated with a newline
        System.out.printf("%f %n", stockPrice);     // format as floating point
        System.out.printf("%.2f %n", stockPrice);   // floating point with a max of 2 digits after the decimal
        System.out.printf("%05.1f %n", stockPrice); // floating point with 1 digit after the decimal...
                                                    // a minimum of 5 printed characters, padded by 0s

        // table cell example: %-20s
        // % : start placeholder
        // - : a minimum of 20 printed characters
        // s : general string format
        String rowFormat = "| %-20s | %15s | %6s |%n";
        // header
        System.out.println("Beetle Families");
        System.out.println("-".repeat(51));
        System.out.printf(rowFormat, "Common Name", "Latin Name", "Rating");
        System.out.println("-".repeat(51));
        //rows
        System.out.printf(rowFormat, "Carrion Beetles", "Silphidae", 9.7);
        System.out.printf(rowFormat, "Darkling Beetles", "Tenebrionidae", 10.0);
        System.out.printf(rowFormat, "Fireflies", "Lampyridae", 9.98);
        System.out.printf(rowFormat, "Fungus Weevils", "Anthribidae", 9.45);
        System.out.printf(rowFormat, "Ladybugs", "Coccinellidae", 9.62);
        // footer
        System.out.println("-".repeat(51));

        String firstName = "Husein";
        String lastName = "Vaan";
        // fullName becomes "Husein Vaan"
        String fullName = String.format("%s %s", firstName, lastName);
        // title becomes "Name: Husein Vaan, Occupation: Game Developer"
        String title = String.format("Name: %s, Occupation: %s", fullName, "Game Developer");
    }
}
