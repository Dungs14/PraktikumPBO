package abstrakPBO;

public class Wortel extends Sayur {
   
    void deskripsi() {
        System.out.println("Wortel adalah sayuran berwarna orange yang kaya akan vitamin A.");
        
    }


    public static void main(String[] args) {
        Bayam bayam = new Bayam();
        Wortel wortel = new Wortel();

        bayam.cuci();
        bayam.deskripsi();

        wortel.cuci();
        wortel.deskripsi();
    }
}