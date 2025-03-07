package chap02;

/**
 * String -> 숫자 변환 (parse, valueOf 메소드 사용)
 */
public class StringConvertToNumber {
    public static void main(String[] args) {
        String str = "12345";
//        String str = "!@#$%^&@$^@*$^@$";    // NumberFormatException

        int intValue = Integer.parseInt(str);
        Integer integerValue = Integer.valueOf(str);

        System.out.println(intValue);
        System.out.println(integerValue);

        // String -> long/Long
        String str2 = "34";
        long longValue = Long.parseLong(str2);
        Long longValue2 = Long.valueOf(str2);

        System.out.println(longValue);
        System.out.println(longValue2);

        // String -> float/Float

        // String -> double/Double
    }
}