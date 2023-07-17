import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        a = inp.nextInt();

        b= a %12;

        if(b==0){
            System.out.print("Çin Zodyağı Burcunuz : Maymun" );
        }else if (b==1){
            System.out.print("Çin Zodyağı Burcunuz : Horoz" );
        }else if (b==2){
            System.out.print("Çin Zodyağı Burcunuz : Köpek" );
        }else if (b==3){
            System.out.print("Çin Zodyağı Burcunuz : Domuz" );
        }else if (b==4){
            System.out.print("Çin Zodyağı Burcunuz : Fare" );
        }else if (b==5){
            System.out.print("Çin Zodyağı Burcunuz : Öküz" );
        }else if (b==6){
            System.out.print("Çin Zodyağı Burcunuz : Kaplan" );
        }else if (b==7){
            System.out.print("Çin Zodyağı Burcunuz : Tavşan" );
        }else if (b==8){
            System.out.print("Çin Zodyağı Burcunuz : Ejderha" );
        }else if (b==9){
            System.out.print("Çin Zodyağı Burcunuz : Yılan" );
        }else if (b==10){
            System.out.print("Çin Zodyağı Burcunuz : At" );
        }else if (b==11){
            System.out.print("Çin Zodyağı Burcunuz : Koyub" );
        }

    }
}