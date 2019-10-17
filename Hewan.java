package animal;

public abstract class Hewan {
	protected float lifeSpan;
	protected String name;

	public abstract void bernafas();
	public abstract void jenis();
	
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
