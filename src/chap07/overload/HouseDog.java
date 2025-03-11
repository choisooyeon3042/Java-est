package chap07.overload;
/*
 * 상속 관계에서 메소드 오버로딩
 */
public class HouseDog extends Dog{
    void sleep(int hour) {      //
        System.out.println(name + " Zzz... for " + hour);
    }

}
