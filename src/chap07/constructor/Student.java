package chap07.constructor;

public class Student extends Person {
    private int studentNo;

    public Student(String name, String ssn, int studentNo) {
        // 부모 생성자 호출
        super(name, ssn);
        this.studentNo = studentNo; // 필드 초기화
    }

    public int getStudentNo() {
        return studentNo;
    }
}
