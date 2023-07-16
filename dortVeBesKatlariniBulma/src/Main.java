import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i = 1, a;
        int bes, dort;

        Scanner input = new Scanner(System.in);
        System.out.print(" bir sayı giriniz: ");
        a = input.nextInt();

        for (i =1 ; i <= a; i++){
            bes = (int) Math.pow(5, i);
            dort = (int) Math.pow(4, i);
            System.out.println("5'in Kuvveti = " + bes);
            System.out.println("4'ün Kuvveti = " + dort);
        }


    }
}