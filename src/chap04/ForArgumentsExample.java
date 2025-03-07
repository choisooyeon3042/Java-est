package chap04;

public class ForArgumentsExample {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++){
            System.out.println("Argument" + (i + 1) + ": " + args[i]);
        }

        // 문자열 배열 선언, for
        String[] array = {"one", "two", "three", "four"};

//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

        // for each문       //  for(자료형 변수 : iterate)
        for (String str : array) {
            System.out.println(str);
        }

        String[] fruits = {"사과", "바나나", "오렌지", "파인애플"};

        for(String str : fruits) {
            System.out.println(str);
        }
    }
}
