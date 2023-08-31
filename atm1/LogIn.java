package atm1;

import java.util.Scanner;

public class LogIn {

    public boolean logIn(Hesap hesap) {
        Scanner scan = new Scanner(System.in);
        String k_adi, parola;

        System.out.println("Kullanici adinizi giriniz : ");
        k_adi = scan.nextLine();

        System.out.println("Parolanizi giriniz : ");
        parola = scan.nextLine();

        if (hesap.getKullanici_adi().equals(k_adi) && hesap.getParola().equals(parola)) {
            return true;
        } else {
            return false;
        }
    }
}
