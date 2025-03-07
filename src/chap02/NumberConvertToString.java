package chap02;
/*
* 숫자 -> 문자열
* */
public class NumberConvertToString {
    public static void main(String[] args) {
        int num = 3456;
        String convert1 = Integer.toString(num);
        String convert2 = String.valueOf(num); // null safe
        String convert3 = num + "";

        System.out.println(convert1);
        System.out.println(convert2);
        System.out.println(convert3);
    }
}
