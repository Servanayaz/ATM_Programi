package atm1;

public class Hesap {

    private String kullanici_adi;
    private String parola;
    private double bakiye;

    public Hesap(String kullanici_adi, String parola, double bakiye) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public void paraYatir(int tutar) {
        this.bakiye += tutar;
        System.out.println("Yeni bakiyeniz : " + bakiye);
    }

    public void paraCek(int tutar) {
        if (bakiye - tutar < 0) {
            System.out.println("Yeterli bakiye yok...");
        } else {
            this.bakiye -= tutar;
            System.out.println("Yeni bakiyeniz : " + bakiye);
        }
    }
}
