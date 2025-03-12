package chap08.polymorphism;

public class ProfileMemoryRepository implements ProfileRepository{
    @Override
    public void save() {
        System.out.println("회원의 Profile 정보를 Memory에 저장");
    }
}
