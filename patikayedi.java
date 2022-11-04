import java.util.Scanner;

    public class patikayedi {
        public static void main(String[] args) {
            int a , e , d , m , p;
            double armut = 2.14 , elma = 3.67 , domates = 1.11 , muz = 0.95 , patlıcan = 5.00 ;
            Scanner input = new Scanner(System.in);
            System.out.print("kaç kilo armut aldığını gir: ");
            a = input.nextInt();
            System.out.print("kaç kilo elma aldığını gir: ");
            e  = input.nextInt();
            System.out.print("kaç kilo domates aldığını gir: ");
            d = input.nextInt();
            System.out.print("kaç kilo muz aldığını gir: ");
            m = input.nextInt();
            System.out.print("kaç kilo patlıcan aldığını gir: ");
            p = input.nextInt();
            double toplamtutar = ((armut * a) + (elma * e) + (domates * d) + (muz * m) + (patlıcan * p));
            System.out.println("ödenecek tutar :" + toplamtutar);
}
}
