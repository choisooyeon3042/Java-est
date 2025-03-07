package chap05;

public class ArrayExample {
    public static void main(String[] args) {
        String[] array = new String[7];
        array[0] = "월";
        array[1] = "화";
        array[2] = "수";
        array[3] = "목";
        array[4] = "금";
        array[5] = "토";
        array[6] = "일";

        for (int i= 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("\n=============================");
        for (String str: array) {
            System.out.println(str);
        }
        System.out.println("\n=============================");
        System.out.print(array[6]);

     }
}
