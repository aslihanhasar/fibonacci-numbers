import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, i, tNum;
        int fNum = 0, sNum = 1;

        System.out.print("The number of elements of the sequence: ");
        number = scanner.nextInt();

        System.out.print("The fibonacci sequence: " + fNum + " , " + sNum);

        for (i = 1; i <= number - 2; i++) {
            tNum = fNum + sNum;
            System.out.print(" , " + tNum);
            fNum = sNum;
            sNum = tNum;
        }
    }
}
