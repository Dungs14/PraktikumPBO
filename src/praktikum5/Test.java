package praktikum5;
import java.util.Scanner;

public class Test {
	public static void main(String []args) {
		String nama, warna;
		int berat;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan nama Kucingmu : ");
		nama = input.next();
		
		System.out.print("Masukan Warna : ");
		warna = input.next();
		
		System.out.print("Masukan berat : ");
		berat = input.nextInt();
		
		
		Cat Kucingsaya = new Cat();
		Kucingsaya.identitas(nama, warna, berat);
		System.out.println(Kucingsaya.ambilNama()+" sikucing, "
				+ " warnanyad "+Kucingsaya.ambilwarna()
				+" beratnya "+Kucingsaya.ambilberat()+" kg. ");
		Kucingsaya.eat();
	}
}
