import java.util.Scanner;

public class ArrayNumber {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczby");

        numbers [0] = scan.nextInt();
        numbers [1] = scan.nextInt();
        numbers [2] = scan.nextInt();
        numbers [3] = scan.nextInt();
        numbers [4] = scan.nextInt();

        System.out.println(numbers[0] + numbers [2] + numbers [4]);
    }
}
