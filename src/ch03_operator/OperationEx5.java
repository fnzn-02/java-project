package ch03_operator;
// 비트 이동 연산자를 사용하여 연산하기
public class OperationEx5 {
    public static void main(String[] args) {
        int num = 0B00000101;

        System.out.println(num << 2); // 20
        System.out.println(num >> 2); // 1
        System.out.println(num >>> 2); // 1
        System.out.println(num); // 5
        
        num = num << 2;
        System.out.println(num); //20
    }
}
