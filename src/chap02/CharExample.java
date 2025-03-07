package chap02;

/**
 * char(문자) 타입 변수
 */
public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A';            // 문자를 직접 저장
        char c2 = 65;            // 10진수로 저장
        char c3 = '\u0041';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        int unicode = c1;
        System.out.println(unicode);

        char ch = (char) 65;
        System.out.println(ch);

        char init = ' '; // char 타입의 변수를 초기화해줄 때는 빈 문자를 넣어줘야함
        String str = "";
    }
}