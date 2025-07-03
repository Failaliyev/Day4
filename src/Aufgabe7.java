
import java.util.Scanner;

public class Aufgabe7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menü");

        System.out.println("1 - Profil anzeigen");

        System.out.println("2 - Einstellungen öffnen");

        System.out.println("3 - Program beenden");


        System.out.println("Wähle eine Option");


        int option = scanner.nextInt();

        switch (option) {


            case 1:

                System.out.println("Profil: Nutzername – Ilkin");

                break;


            case 2:
                System.out.println("Einstellungen: Sprache – Deutsch");

                break;
            case 3:
                System.out.println("Programm wird beendet...");
                break;
            default:
                System.out.println("Ungültige Auswahl!");


        }
    }


}

