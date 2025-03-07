package chap04;

public class UpgradeSwitchCaseExample {
    public static void main(String[] args) {
        String type = checkType(args[0]);
        System.out.println(type);

    }

    static String checkType(String str) {
        return switch (str) {
            case String s -> "String 타입입니다";
        };
    }
}
