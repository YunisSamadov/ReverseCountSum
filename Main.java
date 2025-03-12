import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReverseCountSum();
    }

    public static int ReverseCountSum() {
        System.out.println("Please input number");
        int a = new Scanner(System.in).nextInt();

        int reverse = 0;
        int remainder;
        int count = 0;
        int sum = 0;

        while (a > 0) {
            remainder = a % 10;
            reverse = reverse * 10 + remainder;
            a = a / 10;
            sum = sum + remainder;
            count++;
        }
        System.out.println("Reverse of input number is " + reverse + ", " + count + " digit and sum of numbers are " + sum + ".");
        return ReverseCountSum();
    }

}

