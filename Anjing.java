package animal;

public class Anjing extends Hewan{
	
	private String suaraGonggong;
	
	public Anjing() {
		super("tes");
	}
	@Override
	public void bernafas() {
		System.out.println("Bernafas dengan paru-paru");
	}
	@Override
	public void jenis() {
		System.out.println("Pomeranian");
	}
	
	public String getSuaraGonggong() {
		return suaraGonggong;
	}
	public void setSuaraGonggong(String suaraGonggong) {
		this.suaraGonggong = suaraGonggong;
	}
}
