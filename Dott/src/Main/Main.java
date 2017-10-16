package Main;

import Controller.Contr;
import Model.Gestione;
import Model.Dottore;
import View.Finestra;

public class Main {

	public static void main(String[] args) {
		
		Gestione g=new Gestione();
		Finestra f=new Finestra();
		Contr c=new Contr(f,g);
		f.setVisible(true);
	}

}