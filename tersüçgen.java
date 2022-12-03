import java.util.Scanner;

public class tersüçgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("sayı giriniz:");
        int n = inp.nextInt();

        for (int i = n - 1; i >= 1; i--) {
            for (int k = n; k > i; k--) {
                System.out.print(" ");
            }

            for (int l = 1; l <= (2 * i - 1); l++) {
                System.out.print("*");
            }

            System.out.println(" ");

        }


    }
}