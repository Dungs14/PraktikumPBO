package TugasPBO;

public class PersegiPanjang {
	private double Panjang;
	private double Lebar;
	
	public double getPanjang() {
		return Panjang;
	}
	public void setPanjang(double Panjang) {
		this.Panjang = Panjang;
	}
	public double getLebar() {
		return Lebar;
	}
	public void setLebar(double Lebar) {
		this.Lebar = Lebar;
	}
	public double HitungKeliling() {
		return 2 *(Panjang) + 2 *(Lebar);
	}
	public double HitungLuas() {
		return Panjang * Lebar;
	}

}
