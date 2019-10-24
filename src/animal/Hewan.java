package animal;

public abstract class Hewan implements IMoveable{
	private float lifeSpan;
	private String name;

	public abstract void breathWith();
	public abstract void type();
	public abstract void howToBirth();
	
	public Hewan(){}
	public Hewan(String name, Integer lifespan) {
		this.name = name;
		this.lifeSpan = lifespan;
	}
	public float getMasaHidup() {
		return lifeSpan;
	}
	public void setMasaHidup(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}
	public String getNama() {
		return name;
	}
	public void setNama(String nama) {
		this.name = nama;
	}
}