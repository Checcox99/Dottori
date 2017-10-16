package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import Model.Gestione;
import Model.Dottore;
import View.Finestra;

public class Contr implements ActionListener{
	
	private Finestra f;
	private Gestione g;
	private Dottore d;
	private DefaultListModel m;
	private ArrayList<String> num;
	
	public Contr(Finestra f, Gestione g) {
		this.f = f;
		this.g = g;
		this.m = f.getModel();
		
		this.f.getBtnOrdina().addActionListener(this);
		this.f.getBtnRegistra().addActionListener(this);
		this.f.getBtnStampa().addActionListener(this);
		this.f.getTglbtnCerca().addActionListener(this);
		this.f.getComboBox().addActionListener(this);
		this.f.getComboBox_1().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		
		if(f.getBtnRegistra()==evt.getSource()){
			boolean flag = true;
			String Nome="",Cognome="",Spec="",Sesso="";
			num = new ArrayList<String>();
			String app = (String) f.getComboBox().getSelectedItem();
			
			try {
				if(f.gettNome().getText().length()==0 || !f.gettNome().getText().chars().allMatch(Character::isLetter)) {
					JOptionPane.showMessageDialog(null,"IL NOME DEVE ESSERE VALIDO","ERRORE",0);
					flag=false;
				}else
				Nome = f.gettNome().getText();
			}catch(Exception e) {
			}
			
			try {
				if(f.gettCognome().getText().length()==0 || !f.gettCognome().getText().chars().allMatch(Character::isLetter)) {
					JOptionPane.showMessageDialog(null,"IL COGNOME DEVE ESSERE VALIDO","ERRORE",0);
					flag=false;
				}else
				Cognome = f.gettCognome().getText();
			}catch(Exception e) {
			}
			
			try {
				if(f.gettSpec().getText().length()==0 || !f.gettSpec().getText().chars().allMatch(Character::isLetter)) {
					JOptionPane.showMessageDialog(null,"LA SPECIALIZZAZIONE DEVE ESSERE VALIDA","ERRORE",0);
					flag=false;
				}else
					Spec = f.gettSpec().getText();
			}catch(Exception e) {
			}
			
			Sesso = (f.getRdbtnMaschio().isSelected()) ? "Maschio" : "";
			Sesso = (f.getRdbtnFemmina().isSelected()) ? "Femmina" : "";
			Sesso = (f.getRdbtnAltro().isSelected()) ? "Altro" : "";
			
			if(Integer.parseInt(app)==1){
				if(f.gettPre1().getText().length()!=3 || f.gettNum1().getText().length()!=7 || !f.gettPre1().getText().chars().allMatch(Character::isDigit) || !f.gettNum1().getText().chars().allMatch(Character::isDigit)) {
					JOptionPane.showMessageDialog(null,"IL PRIMO NUMERO DEVE ESSERE VALIDO","ERRORE",0);
					flag=false;
				}else
					num.add("" + f.gettPre1().getText() + f.gettNum1().getText());
			}
			if(Integer.parseInt(app)==2){
				if(f.gettPre2().getText().length()!=3 || f.gettNum2().getText().length()!=7 || !f.gettPre2().getText().chars().allMatch(Character::isDigit) || !f.gettNum2().getText().chars().allMatch(Character::isDigit)) {
					JOptionPane.showMessageDialog(null,"IL PRIMO NUMERO DEVE ESSERE VALIDO","ERRORE",0);
					flag=false;
				}else
				num.add("" + f.gettPre2().getText() + f.gettNum2().getText());
			}
			if(Integer.parseInt(app)==3){
				if(f.gettPre3().getText().length()!=3 || f.gettNum3().getText().length()!=7 || !f.gettPre3().getText().chars().allMatch(Character::isDigit) || !f.gettNum3().getText().chars().allMatch(Character::isDigit)) {
					JOptionPane.showMessageDialog(null,"IL PRIMO NUMERO DEVE ESSERE VALIDO","ERRORE",0);
					flag=false;
				}else
				num.add("" + f.gettPre3().getText() + f.gettNum3().getText());
			}
			
			if(flag==true)
				g.getVett().add(new Dottore(Nome,Cognome,Spec,Sesso,num));
		}
		
		if(f.getBtnStampa()==evt.getSource()){
			m.clear();
			if(f.getTglbtnCerca().isSelected()){
				
				String temp = (String) f.getComboBox_1().getSelectedItem();
				char app = temp.charAt(2);
				char app2 = Character.toLowerCase(app);
				
				for(int i=0;i<g.getVett().size();i++){
					if(g.getVett().get(i).getCognome().indexOf(app)==0 || g.getVett().get(i).getCognome().indexOf(app2)==0)
					m.addElement(g.getVett().get(i).toString());
				}
			}else{
				for(int i=0;i<g.getVett().size();i++){
					m.addElement(g.getVett().get(i).toString());
				}
			}
		}
		
		if(f.getBtnOrdina()==evt.getSource()){
			Collections.sort(g.getVett(), new Comparator<Dottore>() {
		        @Override
		        public int compare(Dottore app1, Dottore app2)
		        {

		            return  app1.getCognome().compareTo(app2.getCognome());
		        }
		    });
		}
		
		if(f.getTglbtnCerca()==evt.getSource()){
			if(f.getTglbtnCerca().isSelected())
				f.getComboBox_1().setEnabled(true);
			else
				f.getComboBox_1().setEnabled(false);
		}
		
		if(f.getComboBox()==evt.getSource()){
			String app = (String) f.getComboBox().getSelectedItem();
			if(Integer.parseInt(app)==0){
				f.gettPre1().setEnabled(false);
				f.gettNum1().setEnabled(false);
				f.gettPre2().setEnabled(false);
				f.gettNum2().setEnabled(false);
				f.gettPre3().setEnabled(false);
				f.gettNum3().setEnabled(false);
			}if(Integer.parseInt(app)==1){ 
				f.gettPre1().setEnabled(true);
				f.gettNum1().setEnabled(true);
				f.gettPre2().setEnabled(false);
				f.gettNum2().setEnabled(false);
				f.gettPre3().setEnabled(false);
				f.gettNum3().setEnabled(false);
			}if(Integer.parseInt(app)==2){ 
				f.gettPre1().setEnabled(true); 
				f.gettNum1().setEnabled(true); 
				f.gettPre2().setEnabled(true); 
				f.gettNum2().setEnabled(true);
				f.gettPre3().setEnabled(false);
				f.gettNum3().setEnabled(false);
			}if(Integer.parseInt(app)==3){ 
				f.gettPre1().setEnabled(true); 
				f.gettNum1().setEnabled(true); 
				f.gettPre2().setEnabled(true); 
				f.gettNum2().setEnabled(true); 
				f.gettPre3().setEnabled(true); 
				f.gettNum3().setEnabled(true); 
			}
		}
	}

}
