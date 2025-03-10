package chap06;

public class Animal {
    private String name; // 동물의 이름 필드

    // 생성자
    /*public Animal() {
        this.name = "";
    }*/

    // 이름 설정 메소드
    public void setName(String name) {
        this.name = name;
    }

    // 이름 반환 메소드
    public String getName() {
        return this.name;
    }

    // 동물이 자는 동작을 출력하는 메소드
    public void sleep() {
        System.out.println(name + "is sleeping..");
    }

    // 메인 메소드
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("lion ");
        System.out.println("Animal name: " + lion.getName());
        lion.sleep();
    }
}
