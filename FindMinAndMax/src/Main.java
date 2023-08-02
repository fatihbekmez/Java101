import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("sayı giriniz : ");
        int a = input.nextInt();

        int [] list = {4,6,3,76,347,853};

        int max = list[0];
        int min = list[0];

        for (int i : list) {
            if ( i <= a && i < min){
                min =i;
            }
            if (i >= a && i > max){
                max = i;
            }
        }

        System.out.println(min);
        System.out.println(max);

    }
}