package ch06_class2;

public class StudentTest4 {
    public static void main(String[ ] args){
        Student3 studentLee = new Student3();
        studentLee.setStudentName("이청용");
        System.out.println(Student3.getSerialNum());
        System.out.println(studentLee.studentName + " 학번: " + studentLee.studentID);

        Student3 studentSon = new Student3();
        studentSon.setStudentName("손흥민");
        System.out.println(Student3.getSerialNum());
        System.out.println(studentSon.studentName + " 학번: " + studentSon.studentID);
    }
}
