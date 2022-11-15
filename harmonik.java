import java.util.Scanner;

public class harmonik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k;
        System.out.print("Bir sayı giriniz :");
        k = input.nextInt();
        double result = 0;

        for (double i = 1; i <= k; i++) {
            result+=(1/i);
        }
        System.out.print(result);

    }
}
