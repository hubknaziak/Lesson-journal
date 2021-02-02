package lab04_pop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OcenyFrame {

	public JFrame frmDziennikLekcyjny;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_4;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public OcenyFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDziennikLekcyjny = new JFrame();
		frmDziennikLekcyjny.setTitle("Dziennik lekcyjny");
		frmDziennikLekcyjny.setBounds(100, 100, 458, 345);
		frmDziennikLekcyjny.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmDziennikLekcyjny.getContentPane().setLayout(null);
		
		JLabel lblWprowadzDane = new JLabel("Wprowadz dane:");
		lblWprowadzDane.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWprowadzDane.setBounds(166, 5, 148, 22);
		frmDziennikLekcyjny.getContentPane().add(lblWprowadzDane);
		
		JLabel lblImie = new JLabel("Imie:");
		lblImie.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblImie.setBounds(43, 41, 46, 14);
		frmDziennikLekcyjny.getContentPane().add(lblImie);
		
		JLabel lblNazwisko = new JLabel("Nazwisko:");
		lblNazwisko.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNazwisko.setBounds(43, 81, 68, 14);
		frmDziennikLekcyjny.getContentPane().add(lblNazwisko);
		
		JLabel lblPrzedmiot = new JLabel("Przedmiot:");
		lblPrzedmiot.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPrzedmiot.setBounds(43, 122, 68, 14);
		frmDziennikLekcyjny.getContentPane().add(lblPrzedmiot);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblData.setBounds(43, 164, 68, 14);
		frmDziennikLekcyjny.getContentPane().add(lblData);
		
		JLabel lblOcena = new JLabel("Ocena:");
		lblOcena.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblOcena.setBounds(43, 207, 46, 14);
		frmDziennikLekcyjny.getContentPane().add(lblOcena);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(139, 38, 215, 20);
		frmDziennikLekcyjny.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setBounds(139, 78, 215, 20);
		frmDziennikLekcyjny.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setBounds(139, 119, 215, 20);
		frmDziennikLekcyjny.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_3.setBounds(139, 161, 215, 20);
		frmDziennikLekcyjny.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_4.setBounds(139, 204, 86, 20);
		frmDziennikLekcyjny.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnModyfikuj = new JButton("Dodaj");
		btnModyfikuj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String imie = textField.getText();
				String nazwisko = textField_1.getText();
				String przedmiot = textField_2.getText();
				String data = textField_3.getText();
				String ocena = textField_4.getText();
				if(e.getSource()==btnModyfikuj)
				{
					Oceny oceny = new Oceny();
					oceny.dodajOcene(imie, nazwisko, przedmiot, data, ocena);
				}
			}
		});
		btnModyfikuj.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnModyfikuj.setBounds(79, 248, 112, 31);
		frmDziennikLekcyjny.getContentPane().add(btnModyfikuj);
		
		JButton btnNewButton = new JButton("Usun");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String imie = textField.getText();
				String nazwisko = textField_1.getText();
				String przedmiot = textField_2.getText();
				String data = textField_3.getText();
				String ocena = textField_4.getText();
				if(e.getSource()==btnNewButton)
				{
					Oceny oceny = new Oceny();
					oceny.anulujOcene(imie, nazwisko, przedmiot, data, ocena);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(280, 248, 112, 31);
		frmDziennikLekcyjny.getContentPane().add(btnNewButton);
	}

}
