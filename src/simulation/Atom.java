package simulation;

public class Atom {
	String name;
	int protons;
	int neutrons;
	int electrons;
	
	public Atom(String n, int p, int neut, int e) {
		name = n;
		protons = p;
		neutrons = neut;
		electrons = e;
	}
	
	public int getElectronCoords() {
		if(electrons <= 2) { //if 1s subshell
			return 30;
		}
		return 2; //placeholder values to appease eclipse
	}
	
	public String getInfo() {
		return name + "\n----------\nProtons: " + protons + "\nNeutrons: " + neutrons + "\nElectrons: " + electrons;
	}
	
}