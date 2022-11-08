import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class artıkyılbulma {
    public static void main(String[] args) {
        int yıl, sonuç;
        String kalan = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Bir yıl giriniz:");
        yıl = input.nextInt();
        sonuç = yıl % 4;

        switch (sonuç) {
            case 0:
                kalan = "bir artık yıldır";
                break;
            case 1:
                kalan = "bir artık yıl değildir";
                break;
            case 2:
                kalan = "bir artık yıl değildir";
                break;
            case 3:
                kalan = "bir artık yıl değildir";
                break;
        }
        System.out.print(yıl +  kalan);


    }
}
