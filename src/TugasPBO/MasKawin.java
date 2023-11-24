package TugasPBO;

//Kelompok :- Dava Pratama(221106042987)
//			- Fahreza Aldi Wildan(221106042853)
//Kelas : 	Reguler A
//Program 49. Biaya Emas Kawin

public class MasKawin {
	private double harga;
	private double berat;
	
	public double getHarga() {
		return harga;
	}
	public void setHarga(double harga) {
		this.harga = harga;
	}
	public double getBerat() {
		return berat;
	}
	public void setBerat(double berat) {
		this.berat = berat;
	}
	public double hitungHargaEmas(double harga,double berat) {
		this.berat = berat;
		this.harga = harga;
		
		return harga * berat;
	}
	
	public static void main(String[]args) {
		MasKawin Dava = new MasKawin();
		Dava.setBerat(15.7);
		Dava.setHarga(570000);
		System.out.println("Jadi Harganya adalah	:Rp."+Dava.hitungHargaEmas(Dava.getBerat(),Dava.getHarga()));
	}

}
