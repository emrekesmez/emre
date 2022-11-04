import java.util.Scanner ;

public class patikaüç {
    public static void main(String[] args) {
        /* taksimetre kilometre başı:2.20
        minimum ödencek tutar 20 tl 20 tl altı ise 20 tl alınacaktır
        taksimetre açılış ücreti ise 10 tldir
         */
        int acilis = 10  ;
        double kmbasi = 2.20 , mesafe , tutar , toplamtutar ;

        Scanner girdi = new Scanner(System.in);
        System.out.print("kaç kilometre mesafe gittiğini yaz: ");
        mesafe = girdi.nextDouble();
        tutar = mesafe * kmbasi ;
        toplamtutar = tutar + acilis ;
        toplamtutar = (toplamtutar < 20) ? 20 : toplamtutar;
        System.out.println("gittiğiniz km: " + mesafe);
        System.out.println("ödeyeceğiniz tutar: " + toplamtutar);
    }
}
