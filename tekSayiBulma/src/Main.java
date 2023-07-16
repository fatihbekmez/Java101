import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i, a, toplam = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz: ");
            a = input.nextInt();
            if (a % 2 == 0 && a % 4 == 0) {
                toplam += a;
            } else {
                System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + toplam);
                break;
            }
        } while (a > 0);
        System.out.println("Çift sayı ve 4'e tam bölünebilen sayılar Toplam: " + toplam );
    }
}
