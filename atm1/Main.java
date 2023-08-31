package atm1;

public class Main {

    public static void main(String[] args) {
        ATM atm = new ATM();
        Hesap hesap = new Hesap("Servan", "12345", 2500);
        atm.calis(hesap);
        System.out.println("Sistemden cikiliyor...");
    }

}
