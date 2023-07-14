import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, select;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("Yapılacak işlemi seçiniz: ");
        System.out.println("1 Toplama\n 2 Çıkarma\n 3 Çarpma\n 4 Bölme");
        select = input.nextInt();

        switch (select){

            case 1:
                System.out.print("Toplama sonucu:" +  (n1+n2));
                break;

            case 2:
                System.out.print("Çıkarma sonucu:"+  (n1-n2));
                break;

            case 3:
                System.out.print("Çarpma sonucu:"+  (n1*n2));
                break;

            case 4:
                System.out.print("Bölme sonucu:"+  (n1/n2));
                break;

            default:
                System.out.println("Lüften işlem seçiniz");

        }



    }
}