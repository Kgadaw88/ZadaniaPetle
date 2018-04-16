import java.util.Scanner;

/**
 *  Napisz program, który odczytuje n i sumuje liczby od 1 do n.
 */
public class Zadanie5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbę");
        int n = input.nextInt();

        int suma;
        suma = (n*(n+1))/2;
        while (suma<n){
            suma += suma;
        }
        System.out.println(suma);
    }
}
