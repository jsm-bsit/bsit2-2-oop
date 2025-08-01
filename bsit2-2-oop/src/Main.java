import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner malongScanner = new Scanner(System.in);

        System.out.println("enter number 1: ");
        int num1 = malongScanner.nextInt();
        System.out.println("enter number 2: ");
        int num2 = malongScanner.nextInt();
        System.out.println("enter number 3: ");
        int num3 = malongScanner.nextInt();
        System.out.println("enter number 4: ");
        int num4 = malongScanner.nextInt();
        System.out.println("enter number 5: ");
        int num5 = malongScanner.nextInt();

        int totalSum = num1 + num2 + num3 + num4 + num5;

        System.out.println("total number is: " + totalSum);



    }
}

