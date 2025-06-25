import java.util.Scanner;

public class Aufgabe1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Scanner obyektini yaradırıq

        System.out.println("Bitte eine zahl Eingeben");

        int zahl = scanner.nextInt();

        long ergebnis = berechneFakultaet(zahl); // metod çağrılır

        // int	–2,147,483,648 … 2,147,483,647	5, 123, 10000
        //long	–9,223,372,036,854,775,808 … 9,223,372,036,854,775,807	1_000_000_000_000

        System.out.println("Fakultät von" + zahl + "ist: " + ergebnis);


    }

    public static long berechneFakultaet (int n) {

        if(n==0 || n==1) {

            return 1; // faktoriyal 0=1

        }

        else {

            return n * berechneFakultaet(n-1); //
        }
    }

}