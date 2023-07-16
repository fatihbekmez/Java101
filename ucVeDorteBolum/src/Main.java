import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, i, toplam = 0, count = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");

        a = input.nextInt();

        for (i = 1; i <= a; i++) {
            if ( i % 4 == 0 && i % 3 ==0){
                toplam += i;
                count++;
            }
        }

        if (count > 0) {
            double ortalama = (double) toplam / count;
            System.out.println("3 ve 4'e bölünen sayıların ortalaması: " + ortalama);
        } else {
            System.out.println("3 ve 4'e tam bölünen sayı bulunamadı.");
        }

    }
}