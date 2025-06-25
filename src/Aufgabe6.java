// İstifadəçi Girişi – Şifrə ilə yoxlama (while və .equals())


// Mövzu: String.equals(), while döngüsü, giriş sistemi

// Məqsəd: İstifadəçidən istifadəçi adı və şifrə soruş, düzgün daxil edənədək təkrar soruş.


import java.util.Scanner;



public class Aufgabe6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String richtigerBenutzer = "admin";
        String richtigesPasswort = "java123";

        String benutzer, passwort;

        do {
            System.out.print("Benutzername: ");
            benutzer = scanner.nextLine();

            System.out.print("Passwort: ");
            passwort = scanner.nextLine();

            if (!benutzer.equals(richtigerBenutzer) || !passwort.equals(richtigesPasswort)) {
                System.out.println("Falsche Zugangsdaten! Bitte erneut versuchen.\n");
            }
        } while (!benutzer.equals(richtigerBenutzer) || !passwort.equals(richtigesPasswort));

        System.out.println("Zugang erlaubt. Willkommen!");
    }
}


// a==b sən eyni otaqdasan (yəni obyektin ünvanı)

// a.equals(b) (sənin içində yazılan sözün eynidir, yənin mətnin özü) sadəcə müqayisə edir.