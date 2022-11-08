import java.util.Scanner;

public class zodyakburcu {
    public static void main(String[] args) {
        int sonuc, dogumyılı, maymun = 0;
        String burç = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılını giriniz:");
        dogumyılı = input.nextInt();
        sonuc = dogumyılı % 12;

        switch (sonuc) {
            case 0:
                burç = "maymun";
                break;
            case 1:
                burç = "horoz";
                break;
            case 2:
                burç = "köpek";
                break;
            case 3:
                burç = "domuz";
                break;
            case 4:
                burç = "fare";
                break;
            case 5:
                burç = "öküz";
                break;
            case 6:
                burç = "kaplan";
                break;
            case 7:
                burç = "tavşan";
                break;
            case 8:
                burç = "ejderha";
                break;
            case 9:
                burç = "yılan";
                break;
            case 10:
                burç = "at";
                break;
            case 11:
                burç = "koyum";
                break;
        }

        System.out.println("Çin zodyağı burcunuz:" + burç);


    }
}
