package lab04_pop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrekwencjaFrame {

	public JFrame frmDziennikLekcyjny;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public FrekwencjaFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDziennikLekcyjny = new JFrame();
		frmDziennikLekcyjny.setTitle("Dziennik lekcyjny");
		frmDziennikLekcyjny.setBounds(100, 100, 450, 300);
		frmDziennikLekcyjny.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmDziennikLekcyjny.getContentPane().setLayout(null);
		
		JLabel lblWprowadzDane = new JLabel("Wprowadz dane:");
		lblWprowadzDane.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWprowadzDane.setBounds(157, 11, 132, 17);
		frmDziennikLekcyjny.getContentPane().add(lblWprowadzDane);
		
		JLabel lblImie = new JLabel("Imie:");
		lblImie.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblImie.setBounds(43, 57, 46, 14);
		frmDziennikLekcyjny.getContentPane().add(lblImie);
		
		JLabel lblNazwisko = new JLabel("Nazwisko:");
		lblNazwisko.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNazwisko.setBounds(43, 96, 68, 14);
		frmDziennikLekcyjny.getContentPane().add(lblNazwisko);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblData.setBounds(43, 136, 46, 14);
		frmDziennikLekcyjny.getContentPane().add(lblData);
		
		JLabel lblCzyObecny = new JLabel("Czy obecny:");
		lblCzyObecny.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCzyObecny.setBounds(43, 177, 78, 14);
		frmDziennikLekcyjny.getContentPane().add(lblCzyObecny);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(157, 55, 210, 20);
		frmDziennikLekcyjny.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setBounds(157, 94, 210, 20);
		frmDziennikLekcyjny.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setBounds(157, 134, 210, 20);
		frmDziennikLekcyjny.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JRadioButton rdbtnTak = new JRadioButton("Tak");
		rdbtnTak.setSelected(true);
		buttonGroup.add(rdbtnTak);
		rdbtnTak.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnTak.setBounds(157, 174, 109, 23);
		frmDziennikLekcyjny.getContentPane().add(rdbtnTak);
		
		JRadioButton rdbtnNie = new JRadioButton("Nie");
		buttonGroup.add(rdbtnNie);
		rdbtnNie.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNie.setBounds(268, 174, 109, 23);
		frmDziennikLekcyjny.getContentPane().add(rdbtnNie);
		
		JButton btnModyfikuj = new JButton("Modyfikuj");
		btnModyfikuj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String imie = textField.getText();
				String nazwisko = textField_1.getText();
				String data = textField_2.getText();
				boolean obecnosc = rdbtnTak.isSelected();
				if(e.getSource()==btnModyfikuj)
				{
					Frekwencja frekwencja = new Frekwencja();
					frekwencja.przyznajObecnosc(imie, nazwisko, data, obecnosc);
				}
			}
		});
		btnModyfikuj.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnModyfikuj.setBounds(165, 227, 89, 23);
		frmDziennikLekcyjny.getContentPane().add(btnModyfikuj);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
