import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik ;
        Scanner input = new Scanner(System.in);

        System.out.print ("matematik notunu giriniz:");
        mat = input.nextInt();
        System.out.print("fizik notunu giriniz:");
        fizik = input.nextInt();
        System.out.print("kimya notunu giriniz:");
        kimya = input.nextInt();
        System.out.print("türkçe notunu giriniz:");
        turkce = input.nextInt();
        System.out.print("tarih notunu giriniz:");
        tarih = input.nextInt();
        System.out.print("müzik notunu giriniz:");
        muzik = input.nextInt();
        double sonuc = (mat + fizik + kimya + turkce + tarih + muzik) ;
        double bitis = (sonuc / 6) ;
        boolean gecme = bitis >= 60 ;
        System.out.println(bitis);
        System.out.println(gecme ? "Geçti" : "kaldı");
    }
}