package com.company.Task_1_6;


import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        //////////////////                 a)                /////////////////////////////////////////////
        System.out.println();
        System.out.println("a)");
        System.out.println();
        System.out.println(isPalindrome());
        //////////////////                 b)                /////////////////////////////////////////////
        System.out.println();
        System.out.println("b)");
        System.out.println();
        System.out.println(Massive());
        //////////////////                 c)                /////////////////////////////////////////////
        System.out.println();
        System.out.println("c)");
        System.out.println("Massive");
        System.out.println(MassiveSwitch());
        //////////////////                 d)                /////////////////////////////////////////////
        System.out.println();
        System.out.println("d)");
        System.out.println(MassiveSearch());
        System.out.println();
    }

    //////////////////                 a)                /////////////////////////////////////////////
    public static boolean isPalindrome() {
        int palindrome;
        int reverse = 0;

        System.out.print("Enter the palindrome: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        palindrome = number;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        System.out.println("The number " +number + " is a palindrome?");
        return number == reverse;
    }

    //////////////////                 b)                /////////////////////////////////////////////
    public static String Massive(){
        int numListM[][] = new int[10][10];
        int max = 0;
        int min = 50;
        int sum = 0;
        int kolvoPlus = 0;
        int kolvoMinus = 0;
        double average = 0;

        for (int row = 0; row < 10; row++) {
            for (int column = 0; column < 10; column++) {
                int num = (int) Math.round((Math.random() * 40) - 20);
                numListM[row][column] = num;
                sum += numListM[row][column];
                average = sum / 100.0;

                if (num > 0) {
                    kolvoPlus++;
                }

                if (num < 0){
                    kolvoMinus++;
                }

                if(num < min){
                    min = num;
                }

                if(num > max){
                    max = num;
                }

                System.out.print(numListM[row][column] + "\t");
            }
            System.out.println("");
        }
        System.out.println();
        System.out.println("Sum value = " + sum);
        System.out.println("Average value = " + average);
        System.out.println("Min value = " + min );
        System.out.println("Max value = " + max );
        System.out.println("Number of Positive elements = " + kolvoPlus);
        System.out.println("Number of Negative elements = " + kolvoMinus);

        return "";
    }
    //////////////////                 c)                /////////////////////////////////////////////
    public static String MassiveSwitch() {
        int numListMS[][] = new int[5][2];

        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 2; column++) {
                numListMS[row][column] = (int) Math.round((Math.random() * 10));
                System.out.print(numListMS[row][column] + "\t");
            }
            System.out.println("");
        }

        System.out.println();
        System.out.println("Switch");

        for (int i = 0; i < 5; i++) {
                int tmp = numListMS[i][1];
                numListMS[i][1] = numListMS[i][0];
                numListMS[i][0] = tmp;
            }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(numListMS[i][j] + "\t");
            }
            System.out.println("");
        }
        return "";
    }
    //////////////////                 d)                /////////////////////////////////////////////
    public static String MassiveSearch(){
        int numListMSearch[][] = new int[3][5];

        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        int s4 = 0;
        int s5 = 0;

        int max;

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 5; column++) {
                numListMSearch[row][column] = (int) Math.round((Math.random() * 10));
                System.out.print(numListMSearch[row][column] + "\t");
            }
            System.out.println("");

            s1 += numListMSearch[row][0];
            s2 += numListMSearch[row][1];
            s3 += numListMSearch[row][2];
            s4 += numListMSearch[row][3];
            s5 += numListMSearch[row][4];
        }

        System.out.println();
        System.out.println("Sum of digits in the" +
        " column 1: " + s1 +
        " , column 2: " + s2 +
        " , column 3: " + s3 +
        " , column 4: " + s4 +
        " , column 5: " + s5);
        System.out.println();

        if (s1 > s2 && s1 > s3 && s1 > s4 && s1 > s5) {
            max = s1;
            System.out.println("The sum of the digits in the column 1 " +"(" + max + ")"+ " is the largest.");
        } else
            if (s2 > s1 && s2 > s3 && s2 > s4 && s2 > s5) {
            max = s2;
                System.out.println("The sum of the digits in the column 2 " +"(" + max + ")"+ " is the largest.");
        } else
            if (s3 > s1 && s3 > s2 && s3 > s4 && s3 > s5) {
            max = s3;
                System.out.println("The sum of the digits in the column 3 " +"(" + max + ")"+ " is the largest.");
        } else
            if (s4 > s1 && s4 > s2 && s4 > s3 && s4 > s5) {
            max = s4;
                System.out.println("The sum of the digits in the column 4 " +"(" + max + ")"+ " is the largest.");
        } else {
            max = s5;
                System.out.println("The sum of the digits in the column 5 " +"(" + max + ")"+ " is the largest.");
        }
        return "";
    }
}
