package chap04;

public class QuizExample {
    public static void main(String[] args) {
        String day = args[0];
        String dayString;

        switch (day) {
            case "월요일" ->
                dayString = "Start of the work week";
            case "금요일" ->
                dayString = "Almost weekend";
            case "화요일", "수요일", "목요일" ->
                dayString = "Midweek";
            case "토요일", "일요일" ->
                dayString = "Weekend";
            default ->
                dayString = "invaid value";
        };
        System.out.println(dayString);
    }
}
