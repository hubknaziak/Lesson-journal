package lab04_pop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Srednia {

	public JFrame frmDziennikLekcyjny;
	public JTextField textField;
	public JTextField textField_1;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public Srednia() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDziennikLekcyjny = new JFrame();
		frmDziennikLekcyjny.setTitle("Dziennik lekcyjny");
		frmDziennikLekcyjny.setBounds(100, 100, 374, 277);
		frmDziennikLekcyjny.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmDziennikLekcyjny.getContentPane().setLayout(null);
		
		JLabel lblWprowadzDane = new JLabel("Wprowadz dane:");
		lblWprowadzDane.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWprowadzDane.setBounds(129, 11, 129, 17);
		frmDziennikLekcyjny.getContentPane().add(lblWprowadzDane);
		
		JLabel lblImie = new JLabel("Imie:");
		lblImie.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblImie.setBounds(45, 71, 46, 14);
		frmDziennikLekcyjny.getContentPane().add(lblImie);
		
		JLabel lblNazwisko = new JLabel("Nazwisko:");
		lblNazwisko.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNazwisko.setBounds(45, 136, 66, 14);
		frmDziennikLekcyjny.getContentPane().add(lblNazwisko);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(118, 68, 166, 20);
		frmDziennikLekcyjny.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setBounds(118, 133, 166, 20);
		frmDziennikLekcyjny.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSrednia = new JButton("Srednia");
		btnSrednia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String imie = textField.getText();
				String nazwisko = textField_1.getText();
				if(e.getSource()==btnSrednia)
				{
					Zestawienia zestawienia = new Zestawienia();
					zestawienia.sredniaUcznia(imie, nazwisko);
				}
			}
		});
		btnSrednia.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSrednia.setBounds(138, 184, 89, 23);
		frmDziennikLekcyjny.getContentPane().add(btnSrednia);
	}

}
