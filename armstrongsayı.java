import java.util.Scanner;

public class armstrongsayı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("bir sayı giriniz:");
        int number = input.nextInt();

        int tempnumber = number;
        int basnumber = 0;
        int basvalue;
        int baspow;
        int total=0;

        while (tempnumber != 0) {
            tempnumber /= 10;
            basnumber++;
        }

        tempnumber = number;
        while (tempnumber != 0) {
            basvalue = tempnumber % 10;
            baspow = 1;
            for (int i = 1; i <= basnumber; i++){
                baspow *= basvalue;
            }
            total += baspow;
            tempnumber /= 10;
        }
        System.out.println(total);


    }

}
