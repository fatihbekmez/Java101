import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int weather;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sıcaklık değerini giriniz: ");
        weather = inp.nextInt();

        if(weather <= 5){
            System.out.println("Hava sıcaklığı: " + weather +" Derece, kayak yapabilirsiniz.");
        } else if (weather >= 5 || weather <= 14){
            System.out.println("Hava sıcaklığı: " + weather +" Derece, Sinemaya gidebilirsiniz.");
        }else if (weather >= 15 || weather <= 25){
            System.out.println("Hava sıcaklığı: " + weather +" Derece, Pikniğe gidebilirsiniz.");
        }else{System.out.println("Hava sıcaklığı: " + weather +" Derece, yüzmeye gidebilirsiniz.");}

    }
}
