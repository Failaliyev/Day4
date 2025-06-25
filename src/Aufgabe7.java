// Sadə Menü sistemi (switch-case)


// Mövzu: switch, case, default, break


// Məqsəd: İstifadəçiyə seçim menyusu ver, switch-case ilə əməliyyatları yerinə yetir.


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


//switch — bir dəyişənin müxtəlif qiymətlərini yoxlayıb, uyğun hissəni işlədən bir idarəetmə strukturudur.

//case — switch içində yoxlanacaq mümkün variantları göstərir.
//Yəni: "Əgər gun == 1dirsə, bunu et..."

// break — uyğun case tapıldıqdan sonra döngünü dayandırır və switch-dən çıxır.
//Əgər break olmasa, növbəti case-lər də işləyər (buna "fall-through" deyilir).


// default — heç bir case uyğun gəlmədikdə işləyən hissədir.
//Eynilə else kimi düşünmək olar.

// Nəticə cədvəli:
//Element	İzahı
//switch	Müxtəlif variantlara görə şərt yoxlaması aparır
//case	Müəyyən dəyər üçün uyğun kod blokunu işə salır
//break	case işlədikdən sonra switch-dən çıxmağı təmin edir
//default	Heç bir case uyğun gəlmədikdə işləyən "sonuncu" seçim