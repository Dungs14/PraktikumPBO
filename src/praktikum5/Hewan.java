package praktikum5;

public abstract class Hewan {
	protected static String name;
	protected abstract void eat();
}

class Cat extends Hewan{
	String warna;
	int berat;
	public void identitas(String namaKucing, String warnaKucing, int beratKucing) {
		Cat.name = namaKucing;
		warna = warnaKucing;
		berat = beratKucing;
	}
	public void eat() {
		System.out.println(Cat.name + " Makan ikan ");
	}
	String ambilNama() {
		return Cat.name;
	}
	String ambilwarna() {
		return warna;
	}
	int ambilberat() {
		return berat;
	}
}
