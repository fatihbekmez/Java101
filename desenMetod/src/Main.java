package Metot;

import java.util.Scanner;

public class desenMetod {
    static void main(int sayi) {
        System.out.print(sayi + " ");
        if (sayi > 0) {
            main(sayi - 5);
        }
        System.out.print(sayi + " ");
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("N Sayısı: ");
        int n = inp.nextInt();

        main(n);
    }
}