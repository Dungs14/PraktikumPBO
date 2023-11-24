package TugasPBO;

public class Tester {
	public static void main(String[]args) {
		Persegi Persegi = new Persegi();
		PersegiPanjang PersegiPanjang = new PersegiPanjang();
		Persegi.setSisi(5);
		
		PersegiPanjang.setPanjang(7);
		PersegiPanjang.setLebar(4);
		
		double KelilingPersegiPanjang = Persegi.HitungKeliling();
		double LuasPersegi = Persegi.HitungLuas();
		
		double kelilingPersegiPanjang = PersegiPanjang.HitungKeliling();
		double LuasPersegiPanjang = PersegiPanjang.HitungLuas();
		
		System.out.println("Persegi : ");
		System.out.println("Sisi : "+Persegi.getSisi());
		System.out.println("Keliling : "+KelilingPersegiPanjang);
		System.out.println("Luas : "+LuasPersegi);
		
		System.out.println("\nPersegi Panjang : ");
		System.out.println("Panjang : "+PersegiPanjang.getPanjang());
		System.out.println("Lebar : "+PersegiPanjang.getLebar());
		System.out.println("Keliling : "+KelilingPersegiPanjang);
		System.out.println("Luas : "+LuasPersegiPanjang);
		
		
		}
		
}
