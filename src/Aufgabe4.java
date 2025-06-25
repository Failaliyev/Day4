// E-poçtun düzgünlüyünü yoxlayan proqram


//Mövzu: String metodu contains(), endsWith() və şərt yoxlaması

//Məqsəd: İstifadəçinin daxil etdiyi e-mail ünvanının .com ilə bitib-bitmədiyini və “@” simvolu olub-olmadığını yoxla.


import java.util.Scanner;

public class Aufgabe4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte deine E-Mail-Adresse eingeben: ");
        String email = scanner.nextLine();

        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("E-Mail ist gültig ✅");
        } else {
            System.out.println("Ungültige E-Mail-Adresse X");
        }
    }
}


// endWith və contains() izahı:


// contains () "Mətnin içində var?" yoxlamasıdır


//endWith "Bu sonluqla bitir"
