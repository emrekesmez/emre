import java.util.Scanner ;

public class Patika {
    public static void main(String[] args) {
        double fiyat , kdv , sonuc;
        Scanner input = new Scanner(System.in) ;
        System.out.println("fiyat bilgisini giriniz:");
        fiyat = input.nextDouble() ;
        kdv = (fiyat * 118) ;
        sonuc = (kdv / 100) ;
        System.out.println(sonuc);
    }
}