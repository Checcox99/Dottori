package Model;

import java.util.ArrayList;

public class Gestione {
	ArrayList<Dottore> vett;

	public Gestione() {
		vett= new ArrayList<Dottore>();
	}
	
	public void inserimento(Dottore d)
	{
		vett.add(d);
	}

	public ArrayList<Dottore> getVett() {
		return vett;
	}

	public void setVett(ArrayList<Dottore> vett) {
		this.vett = vett;
	}
    
}