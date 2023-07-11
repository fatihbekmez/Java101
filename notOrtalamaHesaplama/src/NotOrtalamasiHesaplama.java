import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, tarih, turkce, muzik;

        var sinir = 60;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunu Giriniz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunu Giriniz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunu Giriniz: ");
        kimya = inp.nextInt();

        System.out.print("Tarih Notunu Giriniz: ");
        tarih = inp.nextInt();

        System.out.print("Türkçe Notunu Giriniz: ");
        turkce = inp.nextInt();

        System.out.print("Müzik Notunu Giriniz: ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + tarih + turkce + muzik);

        double ort = toplam/6;

        boolean kalgec = ort >= sinir;

        String gecis = kalgec? "Geçtiniz" : "Kaldınız";

        System.out.println("Girilen notlara göre ortamala: " + ort);
        System.out.println(gecis);

    }
}
