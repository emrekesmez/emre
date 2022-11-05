import java.util.Scanner;

public class patikaodev {
    public static void main(String[] args) {
        int n1, n2, sellect;

        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz:");
        n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz:");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        sellect = input.nextInt();

        switch (sellect) {
            case 1:
                System.out.print("Toplama işleminizin sonucu:" + (n1 + n2));
                break;
            case 2:
                System.out.print("Çıkarma işleminizin sonucu: " + (n1 - n2));
                break;
            case 3:
                System.out.print("Çarpma işleminizin sonucu: " + (n1 * n2));
                break;
            case 4:
                System.out.print("Bölme işleminizin sonucu: " + (n1 / n2));
                break;
            default:
                System.out.print("Hatalı giriş yaptınız");


        }
    }
}
