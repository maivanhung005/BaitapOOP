package baitapc2;

public class Bai17 {
    public static void main(String[] args) {
        for (int num = 100; num < 1000; num++) {
            int a = num / 100;
            int b = (num / 10) % 10;
            int c = num % 10;
            if (a * a * a + b * b * b + c * c * c == num) {
                System.out.println(num);
            }
        }
    }
}
