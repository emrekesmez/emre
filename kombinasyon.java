import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, r;

        System.out.print("Lütfen 'n' sayısını giriniz: ");
        n = input.nextInt();
        System.out.print("Lütfen 'r' sayısını giriniz: ");
        r = input.nextInt();

        int nfaktoriyel = 1, rfaktoriyel = 1, nrfaktoriyel = 1;

        for (int i = 1; i <= n; i++) {
            nfaktoriyel *= i;
        }

        for (int k = 1; k <= r; k++) {
            rfaktoriyel *= k;
        }

        for (int l = 1; l <= (n-r); l++) {
            nrfaktoriyel *= l;
        }

        double combination = nfaktoriyel / (rfaktoriyel * nrfaktoriyel);
        System.out.println("C(" + n + "," + r + "):" + combination);
    }
}