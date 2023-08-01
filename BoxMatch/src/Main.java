// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("ali", 20, 100, 75,1333 );
        Fighter f2 = new Fighter("cabbar", 6, 86, 78,530);
        Match match = new Match(f1,f2,50,90);

        match.run();
    }

}