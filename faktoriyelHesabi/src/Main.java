import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        Scanner inp2 = new Scanner(System.in);
        Scanner inp3 = new Scanner(System.in);

        int normalTutar, onIkiSale,yirmiDortSale,altmisBesSale,indirimliTutar;
        double kmUcret = 0.10;

        System.out.print("Mesafeyi km türünden giriniz : " );
        int km = inp.nextInt();

        System.out.print("Yaşınızı Giriniz: " );
        int age = inp2.nextInt();

        System.out.print("Yolculuk tipini giriniz ( 1 => Tek Yön, 2 => Çift Yön): ");
        int ttype = inp3.nextInt();


        switch (ttype){
            case 1:
                normalTutar = (int) (km*kmUcret);

                if(age <= 12){
                    onIkiSale = (int) normalTutar/2;
                    System.out.print("Toplam Tutar =" + (normalTutar - onIkiSale) + " TL");
                }else if (age >= 13 && age <=24){
                    yirmiDortSale = (int) (normalTutar * 0.10);
                    System.out.print("Toplam Tutar =" + (normalTutar - yirmiDortSale) + " TL");
                }else if (age >= 65){
                    altmisBesSale = (int) ((normalTutar/100)* 30);
                    System.out.print("Toplam Tutar =" + (normalTutar - altmisBesSale) + " TL");
                }
                    break;

            case 2:
                normalTutar = (int) (km*kmUcret);
                indirimliTutar = (int) (normalTutar * 0.20);

                if(age <= 12){
                    onIkiSale = (int) (indirimliTutar/2);
                    System.out.print("Toplam Tutar =" + ((indirimliTutar - onIkiSale)*2) + " TL");
                }else if (age >= 13 && age <=24){
                    yirmiDortSale = (int) (indirimliTutar * 0.10);
                    System.out.print("Toplam Tutar =" + ((indirimliTutar - yirmiDortSale)*2) + " TL");
                }else if (age >= 65){
                    altmisBesSale = (int) ((indirimliTutar/100)* 30);
                    System.out.print("Toplam Tutar =" + ((indirimliTutar - altmisBesSale)*2) + " TL");
                }
                break;
            }


        }

    }
