import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pi = 3.14, r, alan, aci;
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz: ");
        r = input.nextDouble();

        System.out.print("Dairenin açı ölçüsünü giriniz: ");
        aci = input.nextDouble();

        alan = (pi * (r*r) * aci) / 360;

        System.out.print("Dairenin alanı; " + alan);


    }
}