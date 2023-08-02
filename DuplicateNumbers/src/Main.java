import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] list = {0,0,2,2,6,4,3,7,3,2,4};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && ((list[i] %2 == 0) && (list[j] %2 == 0) && list[i]==list[j])){
                    duplicate[startIndex++] = list[i];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(duplicate));
    }

}