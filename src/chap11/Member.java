package chap11;

public class Member extends Object{
    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // set 객체가 어떠한 메소드를 추출해서 중복체크를 하는지 Check
    @Override
    public int hashCode() {
        return age + name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member member) {
            return this.age == member.age && this.name.equals(member.name);
        }
        return super.equals(obj);
    }
}
