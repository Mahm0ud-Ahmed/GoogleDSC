import java.util.Scanner;

public class TaskDSC {


    public static void main(String[] args){
        /*Task [1] Write a Java program to print the result of the following operations
         * A
        */
        Scanner input = new Scanner(System.in);

        int number1 = -5;
        int number2 = 8;
        int number3 = 6;
        System.out.println(number1+number2*number3);

        //B
        int number4 = 55;
        int number5 = 9;
        int number6 = 9;
        System.out.println((number4+number5)%number6);

        //C
        int number7 = 20;
        int number8 = -3;
        int number9 = 5;
        int number10 = 8;
        System.out.println(number7+number8*number9/number10);

        //D
        int number11 = 5;
        int number12 = 15;
        int number13 = 3;
        int number14 = 2;
        int number15 = 8;
        int number16 = 3;
        System.out.println(number11+number12/number13*number14-number15%number16);

        /*
        * [2] Write a Java program to print the sum (addition), multiply, subtract,
              divide and remainder of two numbers.
        */

        System.out.print("Input first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Input second number: ");
        int secondNumber = input.nextInt();
        System.out.println(firstNumber + " + " + secondNumber + " = "+ (firstNumber+secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = "+ (firstNumber-secondNumber));
        System.out.println(firstNumber + " x " + secondNumber + " = "+ (firstNumber*secondNumber));
        System.out.println(firstNumber + " / " + secondNumber + " = "+ (firstNumber/secondNumber));
        System.out.println(firstNumber + " % " + secondNumber + " = "+ (firstNumber%secondNumber));

        /*
         * [3] Write a Java program that takes a number as input and prints its
               multiplication table upto 10.
         */
        System.out.print("Input a number: ");
        int number = input.nextInt();
        System.out.println(number + " x " + "1" + " = "+(number*1));
        System.out.println(number + " x " + "2" + " = "+(number*2));
        System.out.println(number + " x " + "3" + " = "+(number*3));
        System.out.println(number + " x " + "4" + " = "+(number*4));
        System.out.println(number + " x " + "5" + " = "+(number*5));
        System.out.println(number + " x " + "6" + " = "+(number*6));
        System.out.println(number + " x " + "7" + " = "+(number*7));
        System.out.println(number + " x " + "8" + " = "+(number*8));
        System.out.println(number + " x " + "9" + " = "+(number*9));
        System.out.println(number + " x " + "10" + " = "+(number*10));

        /*
         * [4] Write a Java program to display the following pattern.
         */
        System.out.println("   J    a   v     v  a");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");

        /*
         * [5] Write a Java program to compute the specified expressions and print
               the output.
         */

        double number17 = 25.5;
        double number18 = 3.5;
        double number19 = 3.5;
        double number20 = 3.5;
        double number21 = 40.5;
        double number22 = 4.5;
        System.out.println((number17*number18-number19*number20)/(number21-number22));

        /*
         * [6] Write a Java program to compute a specified formula.
         */
        double number23 = 4.0;
        double number24 = 1;
        double number25 = 1.0;
        double number26 = 3;
        double number27 = 1.0;
        double number28 = 5;
        double number29 = 1.0;
        double number30 = 7;
        double number31 = 1.0;
        double number32 = 9;
        double number33 = 1.0;
        double number34 = 11;
        System.out.println(number23 * (number24 - (number25/number26) + (number27/number28) -
                (number29/number30) + (number31/number32) - (number33/number34)));

        /*
         * [7]Write a Java program to print the area and perimeter of a circle.
         */
        double radius = 7.5;
        double perimeter = Math.PI*(radius*2);
        double area = Math.PI*(radius*radius);
        System.out.println("Perimeter is: " + perimeter);
        System.out.println("Area is: " + area);



    }

    }
