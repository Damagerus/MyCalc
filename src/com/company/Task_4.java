package Task_1_6;

import java.util.Random;

public class Task_4 {
    public static void main(String[] args) {
    //////////////////                 a)                /////////////////////////////////////////////
        System.out.println("");
        System.out.println("Task 4, a)");
        System.out.println(SeasonsOfYearIf(1));
        System.out.println(SeasonsOfYearIf(10));
        System.out.println(SeasonsOfYearIf(4));
        System.out.println(SeasonsOfYearIf(7));
        System.out.println(SeasonsOfYearIf(13));
        System.out.println("");
        System.out.println("");
        System.out.println(SeasonsOfYearCase(1));
        System.out.println(SeasonsOfYearCase(10));
        System.out.println(SeasonsOfYearCase(4));
        System.out.println(SeasonsOfYearCase(7));
        System.out.println(SeasonsOfYearCase(13));
    //////////////////                 b)                /////////////////////////////////////////////
        System.out.println("");
        System.out.println("Task 4, b)");
        System.out.println(CycleFor());
    //////////////////                 c)                /////////////////////////////////////////////
        System.out.println("");
        System.out.println("Task 4, c)");
        System.out.println(DoWhileRandom());
    //////////////////                 d)                /////////////////////////////////////////////
        System.out.println("");
        System.out.println("Task 4, d)");
        System.out.println(DoWhileCounter());
    //////////////////                 e)                /////////////////////////////////////////////
        System.out.println("");
        System.out.println("Task 4, e)");
        System.out.println(MultiplicationTable());
    //////////////////                 f)                /////////////////////////////////////////////
        System.out.println("");
        System.out.println("Task 4, f)");
        System.out.println(SumDigitsOfNumber());
    //////////////////                 g)                /////////////////////////////////////////////
        System.out.println("");
        System.out.println("Task 4, g)");
        System.out.println("Факториал равен " + Factorial(5));
    //////////////////                 h)                /////////////////////////////////////////////
        System.out.println("");
        System.out.println("Task 4, h)");
        System.out.println(ArithmeticProgression());
    }

    //////////////////                 a)                /////////////////////////////////////////////
    public static String SeasonsOfYearIf(int m) {
        String s;
        if (m == 12 || m == 1 || m == 2)
            s = "Winter";
        else if (m == 3 || m == 4 || m == 5)
            s = "Spring";
        else if (m == 6 || m == 7 || m == 8)
            s = "Summer";
        else if (m == 9 || m == 10 || m == 11)
            s = "Autumn";
        else
            s = "You must enter number between 1-12 ";
        return s;
    }

    public static String SeasonsOfYearCase(int m) {
        String s;
        switch (m) {
            case 1:
                s = "Winter";
                break;
            case 2:
                s = "Winter";
                break;
            case 3:
                s = "Spring";
                break;
            case 4:
                s = "Spring";
                break;
            case 5:
                s = "Spring";
                break;
            case 6:
                s = "Summer";
                break;
            case 7:
                s = "Summer";
                break;
            case 8:
                s = "Summer";
                break;
            case 9:
                s = "Autumn";
                break;
            case 10:
                s = "Autumn";
                break;
            case 11:
                s = "Autumn";
                break;
            case 12:
                s = "Winter";
                break;
            default:
                s = "Wrong number of the month";
                break;
        }
        return s;
    }

    //////////////////                 b)                /////////////////////////////////////////////
    public static String CycleFor() {
        for (int x = 1; x <= 20; x++) {
            if (x == 6 || x == 12 || x == 18)
                System.out.println(" Race ");
            else
                System.out.println(" Race " + x);
        }
        return "";
    }

    //////////////////                 c)                /////////////////////////////////////////////
    public static String DoWhileRandom() {
        Random rnd = new Random();

        double d;
        int roll = 0;
        do {
            d = rnd.nextDouble();
            d = Math.rint(10 * d) / 10;
            roll++;
            if (d >= 0.5)
                System.out.println(d + " eagle");
            else if (d < 0.5 && d != 0.0)
                System.out.println(d + " tails");
        }while (d != 0.0);
        System.out.println(0.0);
        System.out.println("\nКол-во итераций " + roll);

        return "";
    }

    //////////////////                 d)                /////////////////////////////////////////////
    public static int DoWhileCounter() {
        int counter = 10;
        do {
            System.out.println(counter);
        } while (--counter > 1);
        return counter;
    }

    //////////////////                 e)                /////////////////////////////////////////////
    public static String MultiplicationTable() {
        int i = 1;
        int j = 1;
        while (i != 11) {
            while (j != 11) {
                    System.out.print(i * j + "\t");
                j++;
            }
            System.out.println();
            i++;
            j = 1;
        }
        return "";
    }

    //////////////////                 f)                /////////////////////////////////////////////
    public static int SumDigitsOfNumber() {
        int number = 8672;
        int sum = 0;
        while (number > 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    //////////////////                 g)                /////////////////////////////////////////////
    public static int Factorial(int n){
            int result;
            if (n == 1)
                return 1;
            result = Factorial(n - 1) * n;
            return result;
        }
    //////////////////                 h)                /////////////////////////////////////////////
    public static String ArithmeticProgression(){
        int n = 1;

        int a = 1;
        int step = 2;
        while (n != 10) {
            System.out.println(a);
            a = a + step;
            n++;
        }
        return "";
    }
}