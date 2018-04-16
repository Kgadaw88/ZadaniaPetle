/**
 *  Napisz program, który wypisuje liczby od 5 do 50, które są nieparzyste.
 */
public class Zadanie3 {
    public static void main(String[] args) {
        // ta pętla wypisuje liczby od 5 do 50
        for (int i = 5; i<=50; i++){
            // ta pętla sortuje liczby nieparzyste
            for (int k = i; k%2==1; k++) {
                System.out.println(k);
            }
        }
    }
}
