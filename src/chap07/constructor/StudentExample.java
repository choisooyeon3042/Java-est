package chap07.constructor;

public class StudentExample {
    public static void main(String[] args) {
        Student student = new Student("name","12345-12345",1);

        System.out.println("학생 이름: " + student.getName());
        System.out.println("학생 ssn: " + student.getSsn());
        System.out.println("학생 번호: " + student.getStudentNo());

    }
}
