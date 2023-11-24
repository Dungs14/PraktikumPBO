package TugasPBO;

//Kelompok :- Dava Pratama(221106042987)
//			- Fahreza Aldi Wildan(221106042853)
//Kelas : 	Reguler A
//Program 41. Massa Jenis

public class Kubus {
	
	private int sisi;
	
	private int massa;
	
	public void setMassa(int massa) {
		this.massa = massa;
	}
	public int getMassa() {
		return this.massa;
	}
	public void setSisi(int sisi) {
		this.sisi = sisi;
	}
	public int getSisi() {
		return this.sisi;
	}
	public int hitungVolume(int parSisi) {
		this.sisi = parSisi;
		return parSisi * parSisi * parSisi;
	}
	public int hitungMassaJenis(int parMassa,int volume) {
		volume = hitungVolume(this.getSisi());
		parMassa = this.getMassa() / volume;
		return parMassa;
	}
	
	public static void main(String[] args) {
        Kubus kubus = new Kubus();
        kubus.setSisi(5);
        kubus.setMassa(250);
        System.out.println("====== Massa Jenis Kubus ======");
        System.out.println("Sisi : " + kubus.getSisi());
        System.out.println("Massa : " + kubus.getMassa() +
                "\n\n");

        System.out.println("====== Hasil Perhitungan ======");
        System.out.println("Volume : " + kubus.hitungVolume(kubus.getSisi()));
        System.out.println("Massa jenis : " + kubus.hitungMassaJenis(kubus.hitungVolume(kubus.getSisi()), kubus.getMassa()));
    }

}
