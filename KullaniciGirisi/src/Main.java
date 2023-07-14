import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password, secim;

        Scanner input = new Scanner(System.in);

        System.out.print("KUllanıcı adınızı giriniz: ");
        userName = input.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Başarılı");
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı !");
            System.out.println("Şifrenizi sıfırlamak ister misiniz ? Evet/Hayır");
        }
            secim = input.nextLine();

            switch (secim) {
                case "Evet || evet":
                    System.out.println("Yeni Şifrenizi giriniz: ");
                    if (secim.equals("java123")) {
                        System.out.println("Girilen şifre eski şifre ile aynı olamaz");
                    } else {
                        System.out.println("Şife başarı ile değiştirildi.");
                    }
                 break;
                case "Hayır || hayır":
                    System.out.println("Şifre yenileme talebi reddedildi.");
                    break;
            }

    }
}