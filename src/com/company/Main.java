package com.company;

import javafx.scene.paint.Stop;

public class Main {

    public static void main(String[] args) {
//////////////////              Task 1               /////////////////////////////////////////////
        System.out.println("Task 1");
        System.out.println(add(1, 2));
        System.out.println(sub(6, 4));
        System.out.println(mul(65, 11));
        System.out.println(div(1, 20));
        System.out.println(mod(31, 13));
        System.out.println(avg(40, 30));
        System.out.println(pow(43));
        System.out.println(per(1951, 13));


//////////////////              Task 2               /////////////////////////////////////////////
//////////////////                 a)                /////////////////////////////////////////////
        System.out.println("");
        System.out.println("Task 2, a)");
        System.out.println(castToLong(100.134));
        System.out.println(castToLong(12.0));
        System.out.println(castToLong(402.542));
        System.out.println(castToLong(23.85));
//////////////////                 b)                /////////////////////////////////////////////
        System.out.println("");
        System.out.println("Task 2, b)");
        System.out.println(checkSign((byte)-5));
        System.out.println(checkSign((byte)-128));
        System.out.println(checkSign((byte)-127));
        System.out.println(checkSign((byte)0));
        System.out.println(checkSign((byte)64));
        System.out.println(checkSign((byte)127));
//////////////////                 c)                /////////////////////////////////////////////
        System.out.println("");
        System.out.println("Task 2, c)");
        System.out.println(checkEvenNumber(100.134));
        System.out.println(checkEvenNumber(12.0));
        System.out.println(checkEvenNumber(402.542));
        System.out.println(checkEvenNumber(23.85));
//////////////////                 d)                /////////////////////////////////////////////
        System.out.println("");
        System.out.println("Task 2, d)");
        System.out.println(bitWiseDivByFour(100));
        System.out.println(bitWiseDivByFour(32));
        System.out.println(bitWiseDivByFour(8));
        System.out.println(bitWiseDivByFour(6));
        System.out.println(bitWiseDivByFour(4));
        System.out.println(bitWiseDivByFour(3));
        System.out.println(bitWiseDivByFour(1));
        System.out.println(bitWiseDivByFour(0));
        System.out.println(bitWiseDivByFour(-100));


//////////////////              Task 3               /////////////////////////////////////////////
        System.out.println("");
        System.out.println("Task 3)");
        System.out.println(YearToCentury(1910));
        System.out.println(YearToCentury(1700));
        System.out.println(YearToCentury(1998));
        System.out.println(YearToCentury(2000));
        System.out.println(YearToCentury(2001));
        System.out.println(YearToCentury(200));
        System.out.println(YearToCentury(381));
        System.out.println(YearToCentury(45));
        System.out.println(YearToCentury(1000));
        System.out.println(YearToCentury(1001));


//////////////////              Task 4               /////////////////////////////////////////////
//////////////////                 a)                /////////////////////////////////////////////
        System.out.println("");
        System.out.println("Task 4, a)");
//////////////////                 b)                /////////////////////////////////////////////
        System.out.println("");
        System.out.println("Task 4, b)");
//////////////////                 c)                /////////////////////////////////////////////
        System.out.println("");
        System.out.println("Task 4, c)");
//////////////////                 d)                /////////////////////////////////////////////
        System.out.println("");
        System.out.println("Task 4, d)");
//////////////////                 e)                /////////////////////////////////////////////
        System.out.println("");
        System.out.println("Task 4, e)");
//////////////////                 f)                /////////////////////////////////////////////
        System.out.println("");
        System.out.println("Task 4, f)");
//////////////////                 g)                /////////////////////////////////////////////
        System.out.println("");
        System.out.println("Task 4, g)");
//////////////////                 h)                /////////////////////////////////////////////
        System.out.println("");
        System.out.println("Task 4, h)");
    }

//////////////////              Task 1               /////////////////////////////////////////////
    public static double add(double val1, double val2) {   // сложение
        double result = val1 + val2;
        return result;
    }

    public static double sub(double val1, double val2) {   // вычитание
        double result = val1 - val2;
        return result;
    }

    public static double mul(double val1, double val2) {   // умножение
        double result = val1 * val2;
        return result;
    }

    public static double div(double val1, double val2) {   // деление
        double result = val1 / val2;
        return result;
    }

    public static double mod(double val1, double val2) {   // остаток от деления
        double result = val1 % val2;
        return result;
    }

    public static double avg(double val1, double val2) {   // среднее арифметическое
        double result = (val1 + val2) / 2;
        return result;
    }

    public static double pow(double val1) {                // степень числа во 2-й степени
        double result = val1 * val1;
        return result;
    }

    public static double per(double val1, double val2) {   // процент от числа
        double result = (val1 / 100) * val2;
        return result;
    }


//////////////////              Task 2               /////////////////////////////////////////////
//////////////////                 a)                /////////////////////////////////////////////
    public static long castToLong(double val) {
        long l = (long) val;
        return l;
    }
//////////////////                 b)                /////////////////////////////////////////////
    public static byte checkSign(byte b){
        if (b < 0)
            return -128;
            else return 0;
      }
//////////////////                 c)                /////////////////////////////////////////////
    public static int checkEvenNumber(double value){
        int r =((int)value & 1);
                return r;
    }
//////////////////                 d)                /////////////////////////////////////////////
    public static long bitWiseDivByFour(double number){
        int shiftRightWithSign = (int)number >> 2;
        return shiftRightWithSign;
    }


//////////////////              Task 3               /////////////////////////////////////////////
    public static int YearToCentury(int year){
        int century;
        if (year % 100 == 0) {
            century = year / 100;
        } else {
            century = (year / 100) + 1;
        }
        return century;
    }


//////////////////              Task 4               /////////////////////////////////////////////
//////////////////                 a)                /////////////////////////////////////////////
//////////////////                 b)                /////////////////////////////////////////////
//////////////////                 c)                /////////////////////////////////////////////
//////////////////                 d)                /////////////////////////////////////////////
//////////////////                 e)                /////////////////////////////////////////////
//////////////////                 f)                /////////////////////////////////////////////
//////////////////                 g)                /////////////////////////////////////////////
//////////////////                 h)                /////////////////////////////////////////////




}