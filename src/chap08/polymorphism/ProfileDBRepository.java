package chap08.polymorphism;

public class ProfileDBRepository implements ProfileRepository {
    @Override
    public void save() {
        System.out.println("회원의 Profile 정보를 DB에 저장");
    }
}
