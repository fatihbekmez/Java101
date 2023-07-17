import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);


        System.out.print("Bir sayı giriniz: ");
        int a = inp.nextInt();

        int s1 = 0;
        int s2 =1;
        int toplam;

        for(int i=1; i<=a; i++){

            System.out.print(s1 + " , ");

            toplam = s1 + s2;
            s1 = s2;
            s2 =toplam;

        }
    }
}