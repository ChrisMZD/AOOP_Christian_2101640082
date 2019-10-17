package animal;

public class Ikan extends Hewan{

	public Ikan() {
		super("tes");
	}
	@Override
	public void bernafas() {
		System.out.println("Bernafas dengan insang");
		
	}
	@Override
	public void jenis() {
		System.out.println("Ikan Mas");
		
	}
	
}
