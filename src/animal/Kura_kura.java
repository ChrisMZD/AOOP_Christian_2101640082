package animal;

public class Kura_kura extends Hewan{

	public Kura_kura() {}
	public Kura_kura(String name, float lifeSpan){
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
		System.out.println("Breath with Lungs");
	}
	@Override
	public void type() {
		System.out.println("Adult");
	}
	@Override
	public void howToBirth() {
		System.out.println("Ovipar");
	}
}
