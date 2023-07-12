import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {

        double para, kdvOrani;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen tutar giriniz: ");


        para = input.nextDouble();
        kdvOrani = (para > 0 && para <= 1000 ) ? 0.18 : 0.08;

        double vergiliTutar = para * kdvOrani;
        double vergiMiktari = para + vergiliTutar;

        System.out.println("KDV Tutarı: " + vergiliTutar + " TL");
        System.out.println("Vergisiz Tutar: " + para + " TL");
        System.out.println("Vergili Tutar: " + vergiMiktari + " TL");
        System.out.println("Vergi Oranı: " + kdvOrani);

    }
}


