import java.util.Scanner;

/**
 * Napiszmy prostą grę - zadaniem użytkownika będzie zgadnięcieliczby, którą zainicjujemy w programie (przykładowa liczba 600).
 * Wprzypadku, gdy liczba będzie za duża lub za mała, użytkownik otrzymaodpowiednią podpowiedź.
 * Gramy tak długo dopóki użytkownik zgadnie liczbę.
 */
public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj szukaną liczbę. Pamiętaj aby druga osoba jej nie widziała!!!");
        int searchNumber = scanner.nextInt();
        int userNumber;

        System.out.print("Podaj liczbę: ");
        userNumber = scanner.nextInt();

        while (userNumber != searchNumber){
            if (userNumber < searchNumber){
                System.out.print("Podaj troszkę większą liczbę: ");
                userNumber = scanner.nextInt();
            } if (userNumber > searchNumber){
                System.out.print("Podałeś troszkę mniejszą liczbę: ");
                userNumber = scanner.nextInt();
            }
        }
        System.out.print("Wygrałeś!!! Poprawna liczba to: " + userNumber);
    }
}
