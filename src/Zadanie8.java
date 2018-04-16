import java.util.Scanner;

/**
 *  Napisz program, który prosi o podanie poprawnego hasła( hasło to Polska), tak długo jak użytkownik nie odgadnie hasła
 *  wyświetlany jest komunikat podaj poprawne hasło.
 */
public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "Polska";

        System.out.print("Podaj hasło: ");
        String userWord = scanner.nextLine();

        while (!userWord.equals(password)){
            System.out.print("Podaj poprawne hasło: ");
            userWord = scanner.nextLine();
        }
        System.out.println("Password ACCEPT");
    }
}
