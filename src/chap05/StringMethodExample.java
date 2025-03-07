package chap05;

public class StringMethodExample {
    public static void main(String[] args) {
        String a = "Hello World!I'm Java!";

        // indexOf
        int indexOf = a.indexOf("I");
        System.out.println(indexOf); // 없으면 -1, 있으면 index

        // contains
        boolean isContains = a.contains("Javas!");
        System.out.println(isContains);

        // charAt
        char ch = a.charAt(8);
        System.out.println("ch: " + ch);

        // replaceAll
        String replaceValue = a.replace("World","Java");
        System.out.println("replace value: " + replaceValue);

        String str = "Hello 1234 Java";
        String replaceValue2 = str.replaceAll("\\d","");
        System.out.println("replace value2: " + replaceValue2);

        // substring = 인덱스를 이용해서 문자열을 뽑아낼 때 사용
        System.out.println(a.substring(7, 8));
        System.out.println(a.substring(7));

        // 대문자/소문자로 바꿔주는 Method
        System.out.println("대문자:" + a.toUpperCase() + ", 소문자: " + a.toLowerCase());
    
        // 문자열 이어 붙이기
        System.out.println(a.concat("반가워!"));
    }
}
