import java.util.Scanner;

public class TaskTwo {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во колец:");
        int count = scan.nextInt();

        towerOfHanoi(count, 'A', 'C', 'B');
    }

    static void towerOfHanoi(int n, char from_rod,
                             char to_rod, char aux_rod) {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod "
                + from_rod + " to rod "
                + to_rod);
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }

    // Driver code

}
