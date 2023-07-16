import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i, i2, i3, i4, n, r, z, C, totaln = 1, totalr=1, totala=1, totalra=1;

        Scanner inp = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz: ");
        n = inp.nextInt();

        Scanner inp2 = new Scanner(System.in);
        System.out.print("2. Sayıyı Giriniz: ");
        r = inp2.nextInt();

        int a=n-r;
        int ra = totala-totalr;

        for (i = 1; i <= n ; i++ ){
            totaln = totaln * i;
        }
        for (i2= 1; i2<= r; i2++){
            totalr = totalr * i2;
        }
        for (i3= 1; i3<= a; i3++) {
            totala = totala * a;
        }
        for (i4=1 ; i4<= ra; i4++){
            totalra = totalra *i4;
        }

        C = totaln / totalra;
        System.out.println(C);
    }
}