import java.io.*;

public class Warmups {
    public static void main(String[] args) {
        String input = "";
        while(!input.equals("exit")) {
            try {
                System.out.println("Input the warmup number you want to run:\n");
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                input = br.readLine();
                System.out.println("Trying: " + input);

                switch (input.toLowerCase())
                {
                    case "exit":
                        System.out.println("exiting");
                        break;
                    case "01":
                        warmup01();
                        break;
                    case "02":
                        warmup02();
                        break;
                    default:
                        System.out.println("try again");
                        break;
                }
            }
            catch (IOException ioe) {
                System.out.println("IO Exception raised!");
            }
        };
    }

    public static void warmup01() {
        System.out.println("Hello Warmups");

        String name = "Brian";
        String adj1 = "Happy";
        String adj2 = "Tall";
        System.out.println(name + " is " + adj1 + " and \n" + adj2);

        System.out.println( true || false && true && true);

    }

    public static void warmup02() {
    }
}
