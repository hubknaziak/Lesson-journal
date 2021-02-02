package lab04_pop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UsprFrame {

	public JFrame frame;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public UsprFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWprowadzDane = new JLabel("Wprowadz dane:");
		lblWprowadzDane.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWprowadzDane.setBounds(157, 11, 116, 20);
		frame.getContentPane().add(lblWprowadzDane);
		
		JLabel lblNewLabel = new JLabel("Imie:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(34, 72, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nazwisko:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(34, 122, 66, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setBounds(34, 169, 46, 14);
		frame.getContentPane().add(lblData);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(157, 70, 196, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setBounds(157, 120, 196, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setBounds(157, 166, 196, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnModyfikuj = new JButton("Modyfikuj");
		btnModyfikuj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String imie = textField.getText();
				String nazwisko = textField_1.getText();
				String data = textField_2.getText();
				if(e.getSource()==btnModyfikuj)
				{
					Frekwencja frekwencja = new Frekwencja();
					frekwencja.usprawiedliwienie(imie, nazwisko, data);
				}
			}
		});
		btnModyfikuj.setBounds(165, 215, 89, 23);
		frame.getContentPane().add(btnModyfikuj);
	}
}
