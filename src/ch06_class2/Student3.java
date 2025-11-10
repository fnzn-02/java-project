package ch06_class2;
public class Student3 {
    private static int serialNum = 1000;
    int studentID;
    String studentName;
    int grade;
    String address;

    public Student3() {
        serialNum++;
        studentID = serialNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public static int getSerialNum() {
        int i = 10;
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student3.serialNum = serialNum;
    }
}
