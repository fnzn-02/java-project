package ch06_class2;

public class Student1Test1 {
    public static void main(String[] args) {
        Student1 studentLee = new Student1();
        studentLee.setStudentName("이순신");
        System.out.println(studentLee.serialNum); // serialNum = 1000
        studentLee.serialNum++; // serialNum = 1001

        Student1 studentSon = new Student1();
        studentSon.setStudentName("손흥민");
        System.out.println(studentSon.serialNum);
        System.out.println(studentLee.serialNum);
    }
}
