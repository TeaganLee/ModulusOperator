package com.LickingHeights;

        import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        testOddness();
        keepContained();
    }

        public static void testOddness() {

            //Odd And Even


            Scanner keyboard;
            keyboard = new Scanner(System.in);

            int number;

            System.out.println("Insert a POSITIVE #!!");
            number = keyboard.nextInt();

            System.out.println("number is Even: " + (number % 2 == 0));
            System.out.println("number is Odd: " + (number % 2 != 0));
            System.out.println("");

        }
    public static void keepContained(){
        // Keep It Contained
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int number;

        System.out.println("Insert a POSITIVE #!!");
        number = keyboard.nextInt();

        System.out.print("Number contained is: " + ((number%8)+5 ));




    }
}
