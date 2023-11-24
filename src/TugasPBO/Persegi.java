package TugasPBO;

public class Persegi {
	private double Sisi;
	
	public double getSisi() {
		return Sisi;
	}
	public void	setSisi(double Sisi) {
		this.Sisi = Sisi;
	}
	public double HitungKeliling() {
		return 4*Sisi;
	}public double HitungLuas() {
		return Sisi*Sisi;
	}

}
