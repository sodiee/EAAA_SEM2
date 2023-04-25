package cityarraylist;

public class City {
	private String name;
	private int inhabitants;

	public City(String name, int inhabitants) {
		this.name = name;
		this.inhabitants = inhabitants;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getInhabitants() {
		return inhabitants;
	}

	public void setInhabitants(int inhabitants) {
		this.inhabitants = inhabitants;
	}

	@Override
	public String toString() {
		return name + ": " + inhabitants;
	}

}
