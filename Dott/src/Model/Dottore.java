package Model;

import java.util.ArrayList;

public class Dottore {
	
	private String Nome,Cognome,Spec,Sesso;
	private ArrayList<String> Cel;
	
	public Dottore(String nome, String cognome, String spec, String sesso, ArrayList<String> cel) {

		Nome = nome;
		Cognome = cognome;
		Spec = spec;
		Sesso = sesso;
		Cel = cel;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCognome() {
		return Cognome;
	}

	public void setCognome(String cognome) {
		Cognome = cognome;
	}

	public String getSpec() {
		return Spec;
	}

	public void setSpec(String spec) {
		Spec = spec;
	}

	public String getSesso() {
		return Sesso;
	}

	public void setSesso(String sesso) {
		Sesso = sesso;
	}

	public ArrayList<String> getCel() {
		return Cel;
	}

	public void setCel(ArrayList<String> cel) {
		Cel = cel;
	}

	@Override
	public String toString() {
		return "Dottore [Nome=" + Nome + ", Cognome=" + Cognome + ", Spec=" + Spec + ", Sesso=" + Sesso + ", Cel=" + Cel
				+ "]";
	}
	
}
