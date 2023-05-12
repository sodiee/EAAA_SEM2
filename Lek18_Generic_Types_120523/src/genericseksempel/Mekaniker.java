package genericseksempel;

public class Mekaniker extends Ansat {
	private String aarUddannet;
	public Mekaniker(String navn, int timeloen, String aarUddannet) {
		super(navn, timeloen);
		this.aarUddannet= aarUddannet;
		
	}
	public String getAarUddannet() {
		return aarUddannet;
	}
	public void setAarUddannet(String aarUddannet) {
		this.aarUddannet = aarUddannet;
	}

}
