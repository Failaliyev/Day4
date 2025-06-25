import java.util.Random;
import java.util.Scanner;

public class Aufgabe3 {


    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int geheimZahl = random.nextInt(10) + 1; // 1-10 arası
        int versuch;

        System.out.println("Ich denke an eine Zahl zwischen 1 und 10. Rate sie!");

        do {
            System.out.print("Dein Versuch: ");
            versuch = scanner.nextInt();

            if (versuch < geheimZahl) {
                System.out.println("Zu niedrig!");
            } else if (versuch > geheimZahl) {
                System.out.println("Zu hoch!");
            } else {
                System.out.println("Richtig! Die Zahl war: " + geheimZahl);
            }

        } while (versuch != geheimZahl);
    }
}
