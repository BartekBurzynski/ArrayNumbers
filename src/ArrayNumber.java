import java.util.Scanner;

public class ArrayNumber {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczby");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();
        int number4 = scan.nextInt();
        int number5 = scan.nextInt();
        numbers [0] = number1;
        numbers [1] = number2;
        numbers [2] = number3;
        numbers [3] = number4;
        numbers [4] = number5;

        System.out.println(numbers[0] + numbers [2] + numbers [4]);
    }
}
