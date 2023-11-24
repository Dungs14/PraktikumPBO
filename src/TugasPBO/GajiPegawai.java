package TugasPBO;
import java.util.Scanner;

//Kelompok :- Dava Pratama(221106042987)
//			- Fahreza Aldi Wildan(221106042853)
//Kelas : 	Reguler A
//Program 43. Gaji Pegawai

public class GajiPegawai {
	private String nama;
	private String alamat;
	private int uangTransport;
	private int uangTunjangan;
	private int gajiPokok;
	private int totalGaji;
	
	
	public String getNama(){
		return nama;
	}	
	public void setnama(String nama) {
		this.nama =  nama;
	}
	public String getAlamat(){
		return alamat;
	}
	public void setalamat(String alamat) {
		this.alamat = alamat;
	}
	public int getuangTunjangan() {
		return uangTunjangan;
	}
	public void setuangTunjangan(int uangTunjangan) {
		this.uangTunjangan = uangTunjangan;
	}
	public int getuangTransport() {
		return uangTransport;
	}
	public void setuangTransport(int uangTransport){
		this.uangTransport = uangTransport;
	}
	public int getgajiPokok() {
		return gajiPokok;
	}
	public void setgajiPokok(int gajiPokok) {
		this.gajiPokok = gajiPokok;
	}
	public int gettotalGaji() {
		return totalGaji;
	}
	public void settotalGaji(int totalGaji) {
		this.totalGaji = totalGaji;
	}
	
	
	
	public int totalGaji(int uangTunjangan,int uangTransport,int gajiPokok) {
		this.totalGaji = this.uangTunjangan + this.uangTransport + this.gajiPokok;
		return this.totalGaji;
		
	}
	
	public void tampilData(String nama,String alamat,int uangTransport,int uangTunjangan,int gajiPokok,int totalGaji) {
		System.out.println("##DATA GAJI KARYAWAN PT.KAKATU##"+"\n"+
														"-------");
		System.out.println("Nama Karyawan	        :"+this.nama);
		System.out.println("Alamat			:"+this.alamat);
		System.out.println("Uang Tunjangan          :Rp." + this.uangTunjangan);
		System.out.println("Uang Transport          :Rp." + this.uangTransport);
		System.out.println("Gaji Pokok		:Rp." + this.gajiPokok);
		System.out.println("Total Gaji		:Rp." + totalGaji(this.uangTunjangan,this.uangTransport,this.gajiPokok));
		
 	
	}
	
	
	
	 public static void main(String[] args) {
	        GajiPegawai pegawai = new GajiPegawai();

	        pegawai.setnama("Dava & Fahreza");
	        pegawai.setalamat("Cibinong");
	        pegawai.setuangTransport(250000);
	        pegawai.setuangTunjangan(300000);
	        pegawai.setgajiPokok(4500000);

	        pegawai.tampilData(
	                pegawai.getNama(),
	                pegawai.getAlamat(),
	                pegawai.getuangTransport(),
	                pegawai.getuangTunjangan(),
	                pegawai.getgajiPokok(),
	                pegawai.gettotalGaji()
	                
	                );



	    }
	
}