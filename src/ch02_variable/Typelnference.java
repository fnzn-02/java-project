package ch02_variable;
// 자료형 추론
public class Typelnference {
    public static void main(String[] args) {
        var i = 10;
        var j = 10.0;
        var str = "hello";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str = "test";
    }
}
