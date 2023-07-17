import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Taban değerini giriniz : ");
        int t = input.nextInt();

        System.out.print("Üs değerini giriniz : ");
        int u = input.nextInt();

        int s = usHesaplama(t,u);
        System.out.println("Sonuç: " + s);

    }

    public static int usHesaplama(int t, int u) {
        if (u == 0) {
            return 1;
        } else {
            return t * usHesaplama(t, u - 1);
        }
    }
}