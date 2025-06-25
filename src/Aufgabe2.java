import java.util.ArrayList;
import java.util.Scanner;


public class Aufgabe2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> studenten = new ArrayList<>();

        System.out.println("Wie viele studenten möchten sie eingeben");

        int anzahl = scanner.nextInt();

        scanner.nextLine(); // yəni nextint-dən sonra buffer təmizlənir

        for (int i = 0; i < anzahl; i++) {


            System.out.println("Name des studenten #" + (i+1) + ": " );

            String name = scanner.nextLine();

            studenten.add(name); // siyahıya əlavə olunur

        }

        System.out.println("/nStudentenListe");

        for(String student : studenten);

        System.out.println("- " + studenten);


    }


}

