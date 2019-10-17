package animal;

public abstract class Hewan {
	private int masaHidup;
	private String nama;
	public abstract void bernafas();
	public abstract void jenis();
	
	public Hewan(String nama) {
		
	}
	public int getMasaHidup() {
		return masaHidup;
	}
	public void setMasaHidup(int masaHidup) {
		this.masaHidup = masaHidup;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
}
