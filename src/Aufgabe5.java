//Mövzu: if, Scanner, double, formull istifadə


//  Məqsəd: İstifadəçi hansı istiqamətdə çevirmək istədiyini seçsin. Dəyəri daxil edib nəticəni görsün.


import java.util.Scanner;

public class Aufgabe5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Wähle die Umwandlung");

        System.out.println("1 - Celsius zu Fahrenheit");

        System.out.println("2 - Fahrenheit zu Celsius");

        int wahl = scanner.nextInt();

        if (wahl ==1) {


            System.out.println("Bitte celsius eingeben: ");

            double c = scanner.nextDouble();
            double f = (c * 9/5) + 32;
            System.out.println("Ergebnis: " + f + " °F");


        } else if ( wahl == 2) {


            System.out.println("Bitte Fahrenheit eingeben");

            double f = scanner.nextDouble();

            double c = (f - 32 ) * 5/9;

            System.out.println("Ergebnis" + c + " °C");



        } else  {

            System.out.println("Ungültige auswahl");
        }


    }



}
