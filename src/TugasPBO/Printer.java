package TugasPBO;
import java.util.Scanner;

//Kelompok :- Dava Pratama(221106042987)
//			- Fahreza Aldi Wildan(221106042853)
//Kelas : 	Reguler A
//Program 45. Cetak Nama

public class Printer {
	private int jumlahCetak;
	private String Nama;
	
	public int getjumlahCetak() {
		return jumlahCetak;
	}
	public void setjumlahCetak(int jumlahCetak) {
		this.jumlahCetak = jumlahCetak;
	}
	public String getNama() {
		return Nama;
	}
	public void setNama(String Nama) {
		this.Nama = Nama;
	}
	public void cetakNama(String Nama) {
		this.Nama = Nama;
	}
	
	
	
	public void cetak(int jumlahCetak,String Nama) {
		this.jumlahCetak = jumlahCetak;
		this.Nama = Nama;
		
		for(int i = 1; i<=jumlahCetak; i++) {
			System.out.println(i + "."+Nama);
		}
	}
	 public static void main(String[] args) {
		 Printer data = new Printer();
		 String Nama;
		 int jumlahCetak;
		 
		 
		 Scanner input = new Scanner(System.in);
		 
	        System.out.println("===== Applikasi pencetak Nama =====");
	        
	        System.out.print("Masukan Nama Anda	:");
	        data.setNama(input.next());
	        Nama = data.getNama();	
	        
	        System.out.print("Mau cetak berapa kali?	: ");
	        data.setjumlahCetak(input.nextInt());
	        jumlahCetak = data.getjumlahCetak();
	        
	        System.out.println("Nama Anda	        :"+ Nama);
	        System.out.println("Hasil cetak	        : ");
	        data.cetak(jumlahCetak,Nama);
	        
	        
	 }

}
	