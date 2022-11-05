import java.util.Scanner;

public class patikaodevüç {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        double ortalama;
        int derssayısı = 0, dersler = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunu giriniz:");
        mat = input.nextInt();
        if (mat < 0 || mat > 100) {
            System.out.print("0 ile 100 arasında değer giriniz:");
        } else {
            derssayısı += 0;
            dersler += mat;
        }
        System.out.print("Fizik notunu giriniz:");
        fizik = input.nextInt();
        if (fizik < 0 || fizik > 100) {
            System.out.print("0 ile 100 arasında değer giriniz:");
        } else {
            derssayısı += 0;
            dersler += fizik;
        }
        System.out.print("Türkçe notunu giriniz:");
        turkce = input.nextInt();
        if (turkce < 0 || turkce > 100) {
            System.out.print("0 ile 100 arasında değer giriniz:");
        } else {
            derssayısı += 0;
            dersler += turkce;
        }
        System.out.print("Kimya notunu giriniz:");
        kimya = input.nextInt();
        if (kimya < 0 || kimya > 100) {
            System.out.print("0 ile 100 arasında değer giriniz:");
        } else {
            derssayısı += 0;
            dersler += kimya;
        }
        System.out.print("Müzik notunu giriniz:");
        muzik = input.nextInt();
        if (muzik < 0 || muzik > 100) {
            System.out.print("0 ile 100 arasında değer giriniz:");
        } else {
            derssayısı += 0;
            dersler += muzik;
        }

        ortalama = dersler / derssayısı;
        if (ortalama<55){
            System.out.print("tebrikler sınıfı geçtiniz.");
        } else {
            System.out.print("sınıfta kaldınız seneye görüşürüz.");
        }
    }
}
