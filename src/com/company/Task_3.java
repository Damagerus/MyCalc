package Task_1_6;

public class Task_3 {

    public static void main(String[] args) {
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
    }

    public static int YearToCentury(int year){
        int century;
        if (year % 100 == 0) {
            century = year / 100;
        } else {
            century = (year / 100) + 1;
        }
        return century;
    }
}
