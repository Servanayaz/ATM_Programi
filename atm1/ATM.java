package atm1;

import java.util.Scanner;

public class ATM {

    public void calis(Hesap hesap) {
        LogIn login = new LogIn();
        Scanner scan = new Scanner(System.in);
        System.out.println("Bankamiza Hosgeldiniz...");
        System.out.println("**************************");
        System.out.println("Kullanici Girisi");
        System.out.println("**************************");

        int hak = 3;
        while (true) {
            if (login.logIn(hesap)) {
                System.out.println("Giris Basarili...");
                break;
            } else {
                System.out.println("Giris Basarisiz");
                hak -= 1;
                System.out.println("Kalan Giris Hakki : " + hak);
            }
            if (hak == 0) {
                System.out.println("Giris Hakkiniz Bitti");
                return;
            }
        }

        System.out.println("**************************");
        String islemler = "1-Bakiye Goruntule\n" + "2-Para Yatirma\n" + "3-Para Cekme\n" + "Cikis Icin 'q' Basiniz";
        System.out.println(islemler);

        while (true) {
            System.out.println("Islem Seciniz : ");
            String islem = scan.nextLine();

            if (islem.equals("q")) {
                break;
            } else if (islem.equals("1")) {
                System.out.println("Bakiyeniz : " + hesap.getBakiye());
            } else if (islem.equals("2")) {
                System.out.println("Yatirma istediginiz tutar : ");
                int tutar = scan.nextInt();
                scan.nextLine();

                hesap.paraYatir(tutar);
            } else if (islem.equals("3")) {
                System.out.println("Cekemk istediginiz tutari giriniz...");
                int tutar = scan.nextInt();
                scan.nextLine();
                hesap.paraCek(tutar);
            } else {
                System.out.println("Gecersiz islem!");
            }
        }

    }
}
