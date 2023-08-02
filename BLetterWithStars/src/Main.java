public class Main {
    public static void main(String[] args) {
        String[][] liste = new String[7][4];

        for (int i = 0; i < liste.length; i++) {
            for (int k = 0; k < liste[i].length; k++) {
                if (i == 0 || i == 3 || i == 6) {
                    liste[i][k] = " * ";
                } else if (k == 0 || k == 3) {
                    liste[i][k] = " * ";
                } else {
                    liste[i][k] = "   ";
                }
            }
        }

        for (String[] row : liste) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}