package chap05;

public class StringQuizExample4 {
    public static void main(String[] args) {
        /*
        * 연속된 문자의 반복 횟수로 문자열 압축해 보기
        * "aaaabbccd" -> "a4b2c2d1"
        * */

//        String str = "aaaabbccd";
//        StringBuilder string = new StringBuilder();
//        int count = 1;
//        for (int i = 1; i <= str.length(); i++) {
//            if (str.charAt(i) == str.charAt(i - 1)) {
//                count++;
//            } else {
//                string.append(str.charAt(i - 1)).append(count);
//                count = 1;
//            }
//        }
//        string.append(str.charAt(str.length() - 1)).append(count);
//        System.out.println(string.toString());
    }
}
