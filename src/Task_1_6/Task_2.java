package Task_1_6;

public class Task_2 {

    public static void main(String[] args) {
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
    }


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


}
