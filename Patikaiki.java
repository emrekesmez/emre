import java.util.Scanner ;

public class Patikaiki {
    public static void main(String[] args) {
        double a , b, c;

        Scanner input = new Scanner(System.in) ;
        System.out.print("a kenarını giriniz: ");
        a = input.nextDouble();
        System.out.print("b kenarını giriniz: ");
        b = input.nextDouble();

        c = Math.sqrt((a * a) + (b * b)) ;
        System.out.println("hipotenüs : " + c);
    }
}
