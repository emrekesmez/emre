import java.util.Scanner;

public class patikadört {
        public static void main(String[] args) {
            double pi = 3.14 ;
            int a , r;
            Scanner input = new Scanner(System.in);
            System.out.print("bir r giriniz: ");
            r = input.nextInt();
            System.out.print("bir a giriniz: ");
            a = input.nextInt();
            double dilimalan = (pi * (r * r) * a) / 360 ;
            System.out.println("dairenin dilim alanı: " + dilimalan);
        }
}
