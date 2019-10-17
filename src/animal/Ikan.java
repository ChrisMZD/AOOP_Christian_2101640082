package animal;

public class Ikan extends Hewan{
	
	private String howToBirth;

	public Ikan(){}
	public Ikan(String name, float lifeSpan,String birth) {
		super();
		this.howToBirth = birth;
	}
	@Override
	public void bernafas() {
		System.out.println("Bernafas dengan insang");
		
	}
	@Override
	public void jenis() {
		System.out.println("Ikan Mas");
	}
	public String getHowToBirth() {
		return howToBirth;
	}
	public void setHowToBirth(String howToBirth) {
		this.howToBirth = howToBirth;
	}	
}
