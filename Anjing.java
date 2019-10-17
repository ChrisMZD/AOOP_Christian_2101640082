package animal;

public class Anjing extends Hewan{
	
	private String suaraGonggong;
	
	public Anjing() {}
	public Anjing(String nama, float lifeSpan, String suaraGonggong) {
		super();
		this.suaraGonggong = suaraGonggong;
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
