import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner malongScanner = new Scanner(System.in);

        int totalNumber = 0;
        int number;

        for (int i = 1; i <= 5 ; i++){
            System.out.println("enter number " +i + ": ");
            number = malongScanner.nextInt();
            totalNumber += number;
        }
        String bobp = "bob palautog ";
        System.out.println(" " + bobp);
        System.out.println("total number is " + totalNumber);


    }
}