package chap10;

// Util.boxing()
public class Util {
    // 제네릭 메소드 boxing
    public static <T> Box<T> boxing(T t) {
        Box<T> returnValue = new Box<>();
        returnValue.set(t);
        return returnValue;
    }

    // 제한된 타입 파라미터 int compare(T t1, T t2)
    public static <T extends Number> int compare(T t1, T t2) {
        double d1 = t1.doubleValue();
        double d2 = t2.doubleValue();
        return Double.compare(d1, d2);

    }
}
