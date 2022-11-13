import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k;

        System.out.print("Sayı Giriniz : ");
        k = input.nextInt();

        int sum = 0, counter = 0;

        for (int i = 1; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                counter++;
            }
        }

        double average = sum / counter;
        if (sum != 0) {
            System.out.println("Ortalama : " + average);
        } else System.out.println(k + " sayisina kadar 3 ve 4'e bölünebilen sayı yoktur!");
    }
}