import java.util.Scanner;

public class UcgenAlanHesabi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double birinciKenar, ikinciKenar, ucuncuKenar, cevre;
        double alan,u;

        System.out.print("Birinci kenar uzunluğu giriniz: ");
        birinciKenar = input.nextInt();

        System.out.print("İkinci kenar uzunluğu giriniz: ");
        ikinciKenar = input.nextInt();

        System.out.print("Üçüncü kenar uzunluğu giriniz: ");
        ucuncuKenar = input.nextInt();

        cevre = birinciKenar + ikinciKenar + ucuncuKenar;
        System.out.println("Üçgenin çevresi: " + cevre);

        u = cevre / 2;

        alan = Math.sqrt (u * (u - birinciKenar) * (u - ikinciKenar) * (u - ucuncuKenar));

        System.out.println("Ücgenin alanı: "+ alan);

    }
}
