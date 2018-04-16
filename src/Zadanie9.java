import java.util.Scanner;

/**
 *  Napisz program, który odczytuje n i oblicza n!.
 */
public class Zadanie9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Podaj wartość N: ");
        int number = scanner.nextInt();
        int score = 1;
        for (int i = 1; i <= number; i++){
            score *= i;
        }
        System.out.println("Silnia dla liczby " + number + " wynosi: " + score);
    }
}
