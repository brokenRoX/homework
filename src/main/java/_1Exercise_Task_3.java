import java.util.Scanner;

public class _1Exercise_Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First Number --> ");
        int firstNumber = scanner.nextInt();
        System.out.print("Second Number --> ");
        int secondNumber = scanner.nextInt();
        int result = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + result);

    }
}
