package abstrakPBO;


	abstract class Tester{
	    abstract void deskripsi();

	    
	    void cuci() {
	        System.out.println(" Manfaat sayur?.");
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


