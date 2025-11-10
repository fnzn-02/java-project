package ch06_class2;

public class StudentTest2 {
    public static void main(String[] args) {
        Student2 studentLee = new Student2();
        studentLee.setStudentName("이순신");
        System.out.println(studentLee.serialNum); // 1001
        System.out.println(studentLee.studentName + " 학번: " + studentLee.studentID);

        Student2 studentSon = new Student2();
        studentSon.setStudentName("손흥민");
        System.out.println(studentSon.serialNum); // 1002
        System.out.println(studentSon.studentName + " 학번: " + studentSon.studentID);
    }
}
