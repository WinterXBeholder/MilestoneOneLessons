import java.util.Scanner;

public class Lesson07Arrays {
    public static void main(String[] args) {
        String[] names = new String[7]; // holds 7 strings, default values are null
        int[] grades = new int[16];               // can hold 16 ints, default 0
        float[] monthlyIncome = new float[12];    // can hold 12 floats, default 0.0
        boolean[] yesNoAnswers = new boolean[50]; // can hold 50 booleans, default false
        // Scanner[] scanners = new Scanner[3];      // can hold 3 Scanners, default null

    /* Run-time error - NegativeArraySizeException!
        int[] grades = new int[-12];

        // An array that can store zero values.
        int[] numbers = new int[0];
    */
    /*
        String[] planets = new String[8];

        // assign values to the first, second, and third planets
        // using index 0, 1, and 2.
        planets[0] = "Mercury";
        planets[1] = "Venus";
        planets[2] = "Mars";

        // read values by using an index
        // in this case, the element at index 5 is not set so its value
        // is the String default value `null`
        System.out.println(planets[0]); // Mercury
        System.out.println(planets[5]); // null

        // Mars is not the third planet from the sun.
        // Fix it and complete the rest.
        planets[2] = "Earth";
        planets[3] = "Mars";
        planets[4] = "Jupiter";
        planets[5] = "Saturn";
        planets[6] = "Uranus";
        planets[7] = "Neptune";

        System.out.println(planets[2]); // Earth
        System.out.println(planets[5]); // Saturn
    */
        // initialize
        int[] numbers = new int[5];

        // store three values
        numbers[0] = -55;
        numbers[3] = 9;
        numbers[4] = 80;

        // NEW CODE
        // store first five positive even numbers
        numbers[0] = 2;
        numbers[1] = 4;
        numbers[2] = 6;
        numbers[3] = 8;
        numbers[4] = 10;

        String[] planets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };

        System.out.println(planets[1]); // Venus

        int[] evenNumbers = {2, 4, 6, 8, 10, 12, 14, 16};

        System.out.println(evenNumbers[4]); // 10

        Scanner[] scanners = { new Scanner(System.in), new Scanner(System.in), new Scanner(System.in) };
        String input = scanners[1].nextLine(); // user enters "corndog"
        System.out.println(input);             // corndog

        /*
            Array literals without a type name are only allowed when the array is first initialized. The following causes a compiler error:

            int[] values = { 1, 2, 3 };
            // Error: Array constants can only be used in initializers
            values = { 4, 5, 6};
         */

        int[] values = {1, 2, 3};
        values = new int[] {4, 5, 6};

        String[] jupinterMoons = {"Io", "Ganymede"};
        jupinterMoons = new String[] { "Io", "Europa", "Ganymede", "Callisto"};

        System.out.printf("There are %s planets in the solar system.%n", planets.length);
        // There are 8 planets in the solar system.
        int[] oddNumbers = { 1, 3, 5, 7 };
        int oddCount = oddNumbers.length; // oddCount equals 4

        String[] elements = { "Hydrogen", "Helium", "Lithium", "Beryllium" };
        // loop from front to back
        for (int index = 0; index < elements.length; index++) {
            String elementName = elements[index];
            System.out.printf("The element at index %s is %s.%n", index, elementName);
        }
        // then back to front
        for (int index = elements.length - 1; index >= 0; index--) {
            System.out.printf("The element at index %s is %s.%n", index, elements[index]);
        }

        values = new int[] { 68, -72, -67, 82, -6, -49, 48, -36, 73, -27, 0, 3 };
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }
        int average = sum / values.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        //multi dimensional arrays:
        String[][] twoDimensionalArray;
        int[][] values2 = new int[10][12];
        // there are 45 null int[] in values
        values2 = new int[45][];
        // the array at index 5 is no longer null
        // it's now an int array with a capacity of 6.
        values2[5] = new int[6];
        // the array at index 15 is no longer null
        // it's now an int array with a capacity of 22.
        values2[15] = new int[22];
        // Omitting the first capacity, int[][] values = new int[][];, is not valid. It's a syntax error.

        String[][] threeOfAKind = {
                { "Strawberry", "Blueberry", "Gooseberry" },
                { "Red", "Yellow", "Blue" },
                { "Atlantic", "Pacific", "Indian" }
        };

        int[][][] valueCube = {
                {
                        { 1, 2, 3 },
                        { 4, 5, 6 },
                        { 7, 8, 9 }
                },
                {
                        { 11, 12, 13 },
                        { 14, 15, 16 },
                        { 17, 18, 19 }
                },
                {
                        { 21, 22, 23 },
                        { 24, 25, 26 },
                        { 27, 28, 29 }
                }
        };


        // Read from the second "row" and third "column";
        String element = threeOfAKind[1][2];
        System.out.println(element);            // Blue
        System.out.println(threeOfAKind[2][0]); // Atlantic
        // Replace the element in the third row, first column.
        threeOfAKind[2][0] = "Arctic";
        System.out.println(threeOfAKind[2][0]); // Arctic
        threeOfAKind[0][1] = "Cloudberry";
        System.out.println(threeOfAKind[0][0]); // Strawberry
        System.out.println(threeOfAKind[0][1]); // Cloudberry
        System.out.println(threeOfAKind[0][2]); // Gooseberry


        /*
                int[][][] valueCube = {
                {
                        { 1, 2, 3 },
                        { 4, 5, 6 },
                        { 7, 8, 9 }
                },
                {
                        { 11, 12, 13 },
                        { 14, 15, 16 },
                        { 17, 18, 19 }
                },
                {
                        { 21, 22, 23 },
                        { 24, 25, 26 },
                        { 27, 28, 29 }
                }
        };
         */
        int value = valueCube[1][1][1];
        System.out.println(value);               // 15
        int[] oneDimension = valueCube[1][1];
        System.out.println(oneDimension[2]);     // 16
        int[][] twoDimensions = valueCube[1];
        System.out.println(twoDimensions[1][0]); // 14
        // Replace a sub-array.
        valueCube[2][2] = new int[] { 37, 38, 39 };
        System.out.println(valueCube[2][2][0]);  // 37


        for (int row = 0; row < threeOfAKind.length; row++) {
            for (int col = 0; col < threeOfAKind[row].length; col++) {
                System.out.println(threeOfAKind[row][col]);
            }
        }
        // Use caution when looping over multi-dimensional arrays, because there's no guarantee that a sub-array is not null.
        // Use defensive code to avoid the run-time error.
        values2 = new int[5][];
        values2[0] = new int[] { 1, 2, 3 };
        values2[2] = new int[] { 7, 8, 9 };
        for (int row = 0; row < values2.length; row++) {
            System.out.printf("Row %s: ", row);
            if (values2[row] == null) {
                System.out.println("null");
                continue;
            }
            for (int col = 0; col < values2[row].length; col++) {
                System.out.print(values2[row][col] + " ");
            }
            System.out.println();
        }



    }





























}

