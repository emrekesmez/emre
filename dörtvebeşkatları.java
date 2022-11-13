import java.util.Scanner;

public class dörtvebeşkatları {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k;
        System.out.print("Sayı Giriniz:");
        k = input.nextInt();

        for (int i = 1; i <= k; i*=4 ) {
            System.out.println(i);
        }
        for (int i = 1; i <= k; i*=5 ) {
            System.out.println(i);
        }

    }
}
