package chap09;

public class ArrayExceptionSample {
    public static void main(String[] args) {
        try {
            int index = Integer.parseInt(args[0]);
            int[] num = {1, 2, 3, 4, 5};
            System.out.println(num[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("ERROR: 배열의 범위를 벗어난 인덱스 입니다.");
        }
//         catch (Exception e) {
//            System.out.println(e.getMessage());
//            System.out.println("ERROR: 배열의 범위를 벗어난 인덱스 입니다.");
//        }
    }
}
