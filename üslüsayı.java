import java.util.Scanner;

public class üslüsayı {
    public static void main(String[] args) {
        int n, k;

        Scanner input = new Scanner(System.in);
        System.out.print("üs alıncak bir sayı giriniz:");
        n = input.nextInt();
        System.out.print("üs sayısını giriniz:");
        k = input.nextInt();
        int total = 1;

        for (int i = 1; i <= k;i++) {
            total *= n;
        }
        System.out.print("sonuç:" + total);


    }
}
