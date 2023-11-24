package praktikum4;
import java.util.Scanner;

public class TesTabungan {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int saldo, tariktunai;
		
		System.out.print("Masukan saldo : ");
		saldo = input.nextInt();
		Tabungan atm = new Tabungan(saldo);
		System.out.println("Saldo Anda : "+atm.saldo);
		
		System.out.print("Masukan nominal tarik tunai : ");
		tariktunai = input.nextInt();
		atm.ambiluang(tariktunai);
		
		atm.ambiluang(tariktunai);
		System.out.println("jumlah saldo yang di ambbil : "+tariktunai);
		
		System.out.print("Saldo saat iini : "+atm.saldo);
	}
}
