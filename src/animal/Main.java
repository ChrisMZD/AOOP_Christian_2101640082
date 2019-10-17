package animal;

public class Main {
	public Main() {
		String s1 = "",s2 = "";
		float f = 0;
		Anjing a1 = new Anjing(s1, f ,s2);
		a1.setNama("Tes");
		a1.setMasaHidup(10);
		a1.setSuaraGonggong("Guk");
		System.out.println(a1);
	}
	public static void main(String[] args) {
		new Main();
	}
}
