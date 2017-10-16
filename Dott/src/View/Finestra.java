package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JToggleButton;

public class Finestra extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JButton btnRegistra;
	private JLabel lblCognome;
	private JTextField tCognome;
	private JLabel label;
	private JTextField tNome;
	private JLabel lblSpecializzazione;
	private JTextField tSpec;
	private JLabel lblSesso;
	private JRadioButton rdbtnMaschio;
	private JRadioButton rdbtnFemmina;
	private JRadioButton rdbtnAltro;
	private JLabel lblNumeriTelefono;
	private JComboBox comboBox;
	private JTextField tPre1;
	private JLabel label_1;
	private JTextField tNum1;
	private JTextField tPre2;
	private JLabel label_2;
	private JTextField tNum2;
	private JTextField tPre3;
	private JLabel label_3;
	private JTextField tNum3;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnStampa;
	private JScrollPane scrollPane;
	private JList list;
	private JButton btnOrdina;
	private JToggleButton tglbtnCerca;
	private JComboBox comboBox_1;
	DefaultListModel model = new DefaultListModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finestra frame = new Finestra();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Finestra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		panel = new JPanel();
		tabbedPane.addTab("INSERISCI", null, panel, null);
		panel.setLayout(null);
		
		btnRegistra = new JButton("REGISTRA");
		btnRegistra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnRegistra.setBounds(470, 11, 89, 244);
		panel.add(btnRegistra);
		
		lblCognome = new JLabel("Cognome e Nome");
		lblCognome.setFont(new Font("Arial", Font.BOLD, 14));
		lblCognome.setBounds(10, 11, 130, 25);
		panel.add(lblCognome);
		
		tCognome = new JTextField();
		tCognome.setBounds(155, 12, 130, 25);
		panel.add(tCognome);
		tCognome.setColumns(10);
		
		label = new JLabel("-");
		label.setFont(new Font("Arial", Font.BOLD, 14));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(295, 11, 25, 25);
		panel.add(label);
		
		tNome = new JTextField();
		tNome.setBounds(330, 12, 130, 25);
		panel.add(tNome);
		tNome.setColumns(10);
		
		lblSpecializzazione = new JLabel("Specializzazione");
		lblSpecializzazione.setFont(new Font("Arial", Font.BOLD, 14));
		lblSpecializzazione.setBounds(10, 47, 130, 25);
		panel.add(lblSpecializzazione);
		
		tSpec = new JTextField();
		tSpec.setBounds(155, 48, 305, 25);
		panel.add(tSpec);
		tSpec.setColumns(10);
		
		lblSesso = new JLabel("Sesso");
		lblSesso.setFont(new Font("Arial", Font.BOLD, 14));
		lblSesso.setBounds(10, 83, 130, 25);
		panel.add(lblSesso);
		
		rdbtnMaschio = new JRadioButton("Maschio");
		buttonGroup.add(rdbtnMaschio);
		rdbtnMaschio.setBounds(155, 84, 100, 25);
		panel.add(rdbtnMaschio);
		
		rdbtnFemmina = new JRadioButton("Femmina");
		buttonGroup.add(rdbtnFemmina);
		rdbtnFemmina.setBounds(257, 84, 100, 25);
		panel.add(rdbtnFemmina);
		
		rdbtnAltro = new JRadioButton("Altro");
		rdbtnAltro.setSelected(true);
		buttonGroup.add(rdbtnAltro);
		rdbtnAltro.setBounds(359, 84, 100, 25);
		panel.add(rdbtnAltro);
		
		lblNumeriTelefono = new JLabel("Numeri Telefono");
		lblNumeriTelefono.setFont(new Font("Arial", Font.BOLD, 14));
		lblNumeriTelefono.setBounds(10, 119, 130, 25);
		panel.add(lblNumeriTelefono);
		
		comboBox = new JComboBox();
		comboBox.setMaximumRowCount(4);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3"}));
		comboBox.setBounds(155, 122, 305, 25);
		panel.add(comboBox);
		
		tPre1 = new JTextField();
		tPre1.setEnabled(false);
		tPre1.setBounds(155, 158, 70, 25);
		panel.add(tPre1);
		tPre1.setColumns(10);
		
		label_1 = new JLabel("/");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Arial", Font.BOLD, 14));
		label_1.setBounds(235, 158, 25, 25);
		panel.add(label_1);
		
		tNum1 = new JTextField();
		tNum1.setEnabled(false);
		tNum1.setBounds(270, 158, 190, 25);
		panel.add(tNum1);
		tNum1.setColumns(10);
		
		tPre2 = new JTextField();
		tPre2.setEnabled(false);
		tPre2.setColumns(10);
		tPre2.setBounds(155, 194, 70, 25);
		panel.add(tPre2);
		
		label_2 = new JLabel("/");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Arial", Font.BOLD, 14));
		label_2.setBounds(235, 194, 25, 25);
		panel.add(label_2);
		
		tNum2 = new JTextField();
		tNum2.setEnabled(false);
		tNum2.setColumns(10);
		tNum2.setBounds(270, 194, 190, 25);
		panel.add(tNum2);
		
		tPre3 = new JTextField();
		tPre3.setEnabled(false);
		tPre3.setColumns(10);
		tPre3.setBounds(155, 230, 70, 25);
		panel.add(tPre3);
		
		label_3 = new JLabel("/");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Arial", Font.BOLD, 14));
		label_3.setBounds(235, 230, 25, 25);
		panel.add(label_3);
		
		tNum3 = new JTextField();
		tNum3.setEnabled(false);
		tNum3.setColumns(10);
		tNum3.setBounds(270, 230, 190, 25);
		panel.add(tNum3);
		
		panel_1 = new JPanel();
		tabbedPane.addTab("STAMPA", null, panel_1, null);
		panel_1.setLayout(null);
		
		btnStampa = new JButton("STAMPA");
		btnStampa.setBounds(470, 11, 89, 245);
		panel_1.add(btnStampa);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 250, 245);
		panel_1.add(scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
		list.setModel(model);
		
		btnOrdina = new JButton("ORDINA");
		btnOrdina.setBounds(270, 11, 190, 108);
		panel_1.add(btnOrdina);
		
		tglbtnCerca = new JToggleButton("CERCA PER INIZIALE");
		tglbtnCerca.setBounds(270, 130, 190, 60);
		panel_1.add(tglbtnCerca);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setEnabled(false);
		comboBox_1.setMaximumRowCount(26);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"  A", "  B", "  C", "  D", "  E", "  F", "  G", "  H", "  I", "  J", "  K", "  L", "  M", "  N", "  O", "  P", "  Q", "  R", "  S", "  T", "  U", "  V", "  W", "  X", "  Y", "  Z"}));
		comboBox_1.setBounds(270, 201, 190, 55);
		panel_1.add(comboBox_1);
	}
	
	public DefaultListModel getModel() {
		return model;
	}

	public void setModel(DefaultListModel model) {
		this.model = model;
	}

	public JButton getBtnRegistra() {
		return btnRegistra;
	}

	public void setBtnRegistra(JButton btnRegistra) {
		this.btnRegistra = btnRegistra;
	}

	public JTextField gettCognome() {
		return tCognome;
	}

	public void settCognome(JTextField tCognome) {
		this.tCognome = tCognome;
	}

	public JTextField gettNome() {
		return tNome;
	}

	public void settNome(JTextField tNome) {
		this.tNome = tNome;
	}

	public JTextField gettSpec() {
		return tSpec;
	}

	public void settSpec(JTextField tSpec) {
		this.tSpec = tSpec;
	}

	public JRadioButton getRdbtnMaschio() {
		return rdbtnMaschio;
	}

	public void setRdbtnMaschio(JRadioButton rdbtnMaschio) {
		this.rdbtnMaschio = rdbtnMaschio;
	}

	public JRadioButton getRdbtnFemmina() {
		return rdbtnFemmina;
	}

	public void setRdbtnFemmina(JRadioButton rdbtnFemmina) {
		this.rdbtnFemmina = rdbtnFemmina;
	}

	public JRadioButton getRdbtnAltro() {
		return rdbtnAltro;
	}

	public void setRdbtnAltro(JRadioButton rdbtnAltro) {
		this.rdbtnAltro = rdbtnAltro;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}

	public JTextField gettPre1() {
		return tPre1;
	}

	public void settPre1(JTextField tPre1) {
		this.tPre1 = tPre1;
	}

	public JTextField gettNum1() {
		return tNum1;
	}

	public void settNum1(JTextField tNum1) {
		this.tNum1 = tNum1;
	}

	public JTextField gettPre2() {
		return tPre2;
	}

	public void settPre2(JTextField tPre2) {
		this.tPre2 = tPre2;
	}

	public JTextField gettNum2() {
		return tNum2;
	}

	public void settNum2(JTextField tNum2) {
		this.tNum2 = tNum2;
	}

	public JTextField gettPre3() {
		return tPre3;
	}

	public void settPre3(JTextField tPre3) {
		this.tPre3 = tPre3;
	}

	public JTextField gettNum3() {
		return tNum3;
	}

	public void settNum3(JTextField tNum3) {
		this.tNum3 = tNum3;
	}

	public JButton getBtnStampa() {
		return btnStampa;
	}

	public void setBtnStampa(JButton btnStampa) {
		this.btnStampa = btnStampa;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	public JList getList() {
		return list;
	}

	public void setList(JList list) {
		this.list = list;
	}

	public JButton getBtnOrdina() {
		return btnOrdina;
	}

	public void setBtnOrdina(JButton btnOrdina) {
		this.btnOrdina = btnOrdina;
	}

	public JToggleButton getTglbtnCerca() {
		return tglbtnCerca;
	}

	public void setTglbtnCerca(JToggleButton tglbtnCerca) {
		this.tglbtnCerca = tglbtnCerca;
	}

	public JComboBox getComboBox_1() {
		return comboBox_1;
	}

	public void setComboBox_1(JComboBox comboBox_1) {
		this.comboBox_1 = comboBox_1;
	}

	public ButtonGroup getButtonGroup() {
		return buttonGroup;
	}
}
