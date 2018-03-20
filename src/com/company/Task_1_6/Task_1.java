package com.company.Task_1_6;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        System.out.println(add(1, 2));
        System.out.println(sub(6, 4));
        System.out.println(mul(65, 11));
        System.out.println(div(1, 20));
        System.out.println(mod(31, 13));
        System.out.println(avg(40, 30));
        System.out.println(pow(43));
        System.out.println(per(1951, 13));
    }

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
}
