package chap06;
/*
*
* (static final) 상수 정의하기
* */
public class Earth {
    // static final double PI = 3.14159;
    static final double EARTH_RADIUS = 6400;
    static final double EARTH_SURFACE_AREA;


    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }

    public static void main(String[] args) {
        System.out.println("지구의 표면적: " + EARTH_SURFACE_AREA);
    }
}
