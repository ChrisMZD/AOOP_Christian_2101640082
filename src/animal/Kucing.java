package animal;

public class Kucing extends Hewan{
	public Kucing() {}
	public Kucing(String name, float lifeSpan){
		super();
	}
	
	//Interface
	@Override
	public void move() {
		System.out.println("Move with Legs");
	}
	
	//Abstract Class
	@Override
	public void breathWith() {
		System.out.println("Breath with lungs");
	}
	@Override
	public void type() {
		System.out.println("Anggora");
	}
	@Override
	public void howToBirth() {
		System.out.println("Vivipar");
	}
}
