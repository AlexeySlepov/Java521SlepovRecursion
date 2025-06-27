import java.util.Scanner;

public class TaskOne {
    public static String string = "0, 1";
    public static int firstNumber = 0, secondNumber = 1, count = 2;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите конечное число");
        int number = scan.nextInt();

        fibonacci(number);
        System.out.println("Итоговая строка: " + string + ", кол-во - " + count);
    }

    public static void fibonacci(int number) {
        int temp = firstNumber + secondNumber;
        if (temp > number) {
            return;
        }
        firstNumber = secondNumber;
        secondNumber = temp;
        string += ", " + temp;
        count++;
        fibonacci(number);
    }
}
