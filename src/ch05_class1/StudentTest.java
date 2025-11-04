package ch05_class1;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.setStudentName("이순신");

        System.out.println(studentLee.getStudentName());
    }
}
