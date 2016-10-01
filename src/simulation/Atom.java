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
	
	public String getInfo() {
		return name + "\n----------\nProtons: " + protons + "\nNeutrons: " + neutrons + "\nElectrons: " + electrons;
	}
	
}