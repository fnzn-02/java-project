package ch05_class1;

public class Person {
    String name; // 이름
    float height; // 키
    float weight; // 몸무게

    public Person() { } // 자바 컴파일러가 자동으로 제공하는 디폴트 생성자

    public Person(String pname){
        name = pname;
    }
    public Person(String pname, float pheight, float pweight){
        name = pname;
        height = pheight;
        weight = pweight;
    }
    
}
