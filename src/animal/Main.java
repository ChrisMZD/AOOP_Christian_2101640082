package animal;

import java.util.Scanner;

public class Main {
	
	private static final Scanner scan = new Scanner(System.in);
	
	public Main() {
		String name = scan.nextLine();
		int lifeSpan = scan.nextInt();
		scan.nextLine();
		Hewan kucing = new Kucing(name, lifeSpan);
		kucing.setNama(name);
		kucing.setMasaHidup(10);
		System.out.println(kucing.getNama());
		System.out.println(kucing.getMasaHidup());
		
	}
	public static void main(String[] args) {
		new Main();
	}
}
