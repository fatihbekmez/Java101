import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int  a,b,c;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz: ");
        a = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        b = input.nextInt();

        System.out.print("Üçüncü Sayıyı Giriniz: ");
        c = input.nextInt();

        if ( (a > b) && (a > c) ){
            if (b > c){
                System.out.println("Büyüklük Sıralaması: A > B > C" );
            } else {
                System.out.println("Büyüklük Sıralaması: A > C > B");
            }
        } else if((b > a) && (b > c)){
            if (a > c){
                System.out.println("Büyüklük Sıralaması: B > A > C" );
            } else {
                System.out.println("Büyüklük Sıralaması: B > C > A");
        }
     } else if ((c > a) && (c >b)){
            if (a >b) {
                System.out.println("Büyüklük Sıralaması: C > A > B");
            }else {
                System.out.println("Büyüklük Sıralaması : C > B > A");
            }

        }
}
}