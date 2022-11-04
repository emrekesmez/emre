import java.util.Scanner;

    public class patikabeş {
        public static void main(String[] args) {
            int a;
            double b;
            Scanner girdi = new Scanner(System.in);
            System.out.print("kilonuzu giriniz: ");
            a = girdi.nextInt();
            System.out.print("boyunuzu metre cinsinden giriniz: ");
            b = girdi.nextDouble();
            double endeks = (a / (b * b));
            System.out.println("kütle endeksiniz :" + endeks);

    }
}
