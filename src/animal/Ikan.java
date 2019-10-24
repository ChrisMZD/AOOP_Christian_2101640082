package animal;

public class Ikan extends Hewan{
	
	private String howToBirth;

	public Ikan(){}
	public Ikan(String name, float lifeSpan,String birth) {
		super();
		this.howToBirth = birth;
	}
	
	//Interface
	@Override
	public void move() {
		System.out.println("Move with Swimming");
	}
	
	//Abstract Class
	@Override
	public void howToBirth() {
		System.out.println("Ovipar");
	}
	@Override
	public void breathWith() {
		System.out.println("Breath with Gill");
		
	}
	@Override
	public void type() {
		System.out.println("Catfish");
	}
	
	
	//Setter and Getter
	public String getHowToBirth() {
		return howToBirth;
	}
	public void setHowToBirth(String howToBirth) {
		this.howToBirth = howToBirth;
	}	
}
