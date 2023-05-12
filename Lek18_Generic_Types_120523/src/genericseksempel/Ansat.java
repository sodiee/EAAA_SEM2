package genericseksempel;

public class Ansat {
	private String navn;
	private int timeloen;
	public Ansat(String navn, int timeloen) {
		super();
		this.navn = navn;
		this.timeloen = timeloen;
	}
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public int getTimeloen() {
		return timeloen;
	}
	public void setTimeloen(int timeloen) {
		this.timeloen = timeloen;
	}
}
