package animal;

public class Anjing extends Hewan{
	
	private String suaraGonggong;
	
	public Anjing() {}
	public Anjing(String name, float lifeSpan, String suaraGonggong) {
		super();
		this.suaraGonggong = suaraGonggong;
	}
	
	//Interface
	@Override
	public void move() {
		System.out.println("Move with Legs");
	}
	
	//Abstract Class
	@Override
	public void howToBirth() {
		System.out.println("Vivipar");
	}
	@Override
	public void breathWith() {
		System.out.println("Breath with lungs");
	}
	
	@Override
	public void type() {
		System.out.println("Pomeranian");
	}
	
	//Setter and Getter
	public String getSuaraGonggong() {
		return suaraGonggong;
	}
	public void setSuaraGonggong(String suaraGonggong) {
		this.suaraGonggong = suaraGonggong;
	}
}