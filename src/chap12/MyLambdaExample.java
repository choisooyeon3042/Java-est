package chap12;

public class MyLambdaExample {
    public static void main(String[] args) {
        MyFunctionlInterface inter = () -> {
            System.out.println("매개변수가 없고 리턴값이 없는 람다 표현식 입니다.");
        };
        inter.method();

        MyFunctionalInterface2 inter2 = value -> System.out.println("매개변수로 입력받은 값: " + value);
        inter2.method(453);

        MyFunctionalInterface3 inter3 = (x, y) -> x * y;
        System.out.println(inter3.method(3,5));

        MyFunctionalInterface4 inter4 = str -> str.length();
        int result = inter4.run("특정문자열");
        System.out.println("특정문자열 길이는: " + result);


//        MyFunctionalInterface3 inter3 = (x, y) -> {
//            int multiple = x * y;
//            System.out.println(multiple);
//            return multiple;
//        };



    }
}
