import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random(); //javanın oto random sınıfını kullanarak yeni bir random değişkeni oluşturduk.
        int number = rand.nextInt(100); //random değişkenine sınır verdik 0-100 arasında olacak.


        Scanner input = new Scanner(System.in); // kullanıcıdan veri aldık
        int right = 0; // kullanıcının 5 hakkı olacak onu döngüye  sokmak için 0 dan başlayan değişken tanımladık
        int selected; //kullanıcan veri alaacak değilkenin tanımladık
        int []wrong = new int[5]; //kullanıcı 5 hakta da yanlış girerse yanlış girdiği verileri bir arraya atmak için 5 indeksli bir dizi tanımladık
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);

        while (right < 5) {
            System.out.println("Lütfen tahmininizi giriniz: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 aralığından bir değer giriniz..");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yapıldı. Kalan hakkınız: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı giriş yapmanız halinde giriş hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğiniz sayı : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı sayı girdiniz !.");
                if (selected < number) {
                    System.out.println(selected + " Girdiğiniz sayı tahmin edilecek sayıdan küçüktür.");
                } else {
                    System.out.println("Girdiğiniz sayı tahmin edilecek sayıdan büyüktür.");
                }

                wrong[right++] = selected;
                System.out.println("Kalan hakkınız: " + (5 - right));

            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz :( ");
            if (!isWrong){
                System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
            }

        }

    }
}