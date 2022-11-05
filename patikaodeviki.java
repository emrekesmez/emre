import java.util.Scanner;

public class patikaodeviki {
    public static void main(String[] args) {
        String username, password, sellect, newpassword, newpassword2;

        Scanner input = new Scanner(System.in);

        System.out.print("kullanıcı adını giriniz:");
        username = input.nextLine();
        System.out.print("şifrenizi giriniz:");
        password = input.nextLine();

        if (username.equals("ödev") &&password.equals("patikaödev")) {
            System.out.println("kullanıcı adı ve şifreniz doğru.");
        }
        else{
            System.out.println("Şifrenizi sıfırlamak ister misiniz (evet-hayır)? ");
            sellect = input.nextLine();
            
            if (sellect.equals("evet")) {
                System.out.print("yeni şifrenizi giriniz:");
                newpassword = input.nextLine();
                System.out.print("yeni şifrenizi tekrar giriniz:");
                newpassword2 =input.nextLine();

                if (newpassword.equals(newpassword2)) {
                    System.out.print("başarıyla değiştirdiniz");
                }
                else{
                    System.out.print("girdiğiniz şifreleri kontrol ediniz.");
                }
            }
            else{
                System.out.print("mevcut şifrenizle tekrar giriş yapınız.");
            }
        }
    }
}