package lab04_pop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Uczniowie {

	public JFrame frmDziennikLekcyjny;
	public JTextField textField;
	public JTextField textField_1;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Uczniowie() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	 void initialize() {
		frmDziennikLekcyjny = new JFrame();
		frmDziennikLekcyjny.setTitle("Dziennik lekcyjny");
		frmDziennikLekcyjny.setBounds(100, 100, 450, 300);
		frmDziennikLekcyjny.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmDziennikLekcyjny.getContentPane().setLayout(null);
		
		JLabel lblWprowadzImieI = new JLabel("Wprowadz dane ucznia");
		lblWprowadzImieI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWprowadzImieI.setAutoscrolls(true);
		lblWprowadzImieI.setBounds(150, 11, 217, 20);
		frmDziennikLekcyjny.getContentPane().add(lblWprowadzImieI);
		
		JLabel lblImie = new JLabel("Imie:");
		lblImie.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblImie.setBounds(43, 73, 46, 14);
		frmDziennikLekcyjny.getContentPane().add(lblImie);
		
		JLabel lblNazwisko = new JLabel("Nazwisko:");
		lblNazwisko.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNazwisko.setBounds(43, 128, 65, 14);
		frmDziennikLekcyjny.getContentPane().add(lblNazwisko);
		
		textField = new JTextField();
		textField.setBounds(137, 71, 198, 20);
		frmDziennikLekcyjny.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 126, 198, 20);
		frmDziennikLekcyjny.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnModyfikuj = new JButton("Dodaj");
		btnModyfikuj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String imie = textField.getText();
				String nazwisko = textField_1.getText();
				if(e.getSource()==btnModyfikuj)
				{
					Uczen uczen = new Uczen();
					uczen.dodajUcznia(imie, nazwisko);
				}
				
			}
		});
		btnModyfikuj.setBounds(73, 196, 120, 23);
		frmDziennikLekcyjny.getContentPane().add(btnModyfikuj);
		
		JButton btnUsun = new JButton("Usun");
		btnUsun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String imie = textField.getText();
				String nazwisko = textField_1.getText();
				if(e.getSource()==btnUsun)
				{
					Uczen uczen = new Uczen();
					uczen.usunUcznia(imie, nazwisko);
				}
			}
		});
		btnUsun.setBounds(257, 196, 120, 23);
		frmDziennikLekcyjny.getContentPane().add(btnUsun);
	}
}
