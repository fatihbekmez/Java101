import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, i = 1;
        int toplam = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        a = inp.nextInt();

        for (i = i; i < a; i++) {
            if (a % i ==0){
                toplam = toplam +1;
            }
        }
            if (toplam == a){
                System.out.println( a + " Mükemmel Sayıdır");
            }else {
                System.out.println( a + " Mükemmel Sayı Değildir.");
            }

    }
}