import java.util.Scanner;

public class ebobekok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz : ");
        int ilksayı = input.nextInt();
        System.out.print("ikinci sayıyı giriniz : ");
        int ikincisayı = input.nextInt();
        int obeb = 1;
        int okek = 1;

        if (ilksayı >= ikincisayı) {
            System.out.print("First Number Cannot Be Big");
        } else {
            for (int i = 1; i <= ilksayı; i++) {
                if (ilksayı % i == 0 && ikincisayı % i == 0) {
                    obeb = i;
                }
            }
            System.out.println("Obeb : " + obeb);

            for (int k = 1; k <= (ilksayı * ikincisayı); k++) {
                if (k % ilksayı == 0 & k % ikincisayı == 0) {
                    okek = k;
                    break;
                }
            }
            System.out.println("Okek : " + okek);
        }

        System.out.println("Okek : " + (ilksayı * ikincisayı) / obeb);

    }
}
