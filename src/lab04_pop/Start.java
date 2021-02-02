package lab04_pop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start {

	private JFrame frmDziennik;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frmDziennik.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDziennik = new JFrame();
		frmDziennik.setTitle("Dziennik lekcyjny");
		frmDziennik.setBounds(100, 100, 498, 348);
		frmDziennik.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDziennik.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Wybierz jedna z ponizszych czynnosci:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(131, 11, 248, 48);
		frmDziennik.getContentPane().add(lblNewLabel);
		
		JLabel lblZarzdzajListUczniw = new JLabel("Zarzadzaj lista uczniow:");
		lblZarzdzajListUczniw.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblZarzdzajListUczniw.setBounds(32, 82, 125, 23);
		frmDziennik.getContentPane().add(lblZarzdzajListUczniw);
		
		JButton btnDodajUcznia = new JButton("Dodaj lub usun ucznia");
		btnDodajUcznia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(arg0.getSource()==btnDodajUcznia)
				{
					Uczniowie uczniowie = new Uczniowie();
					uczniowie.frmDziennikLekcyjny.setVisible(true);
				}
				
			}
		});
		btnDodajUcznia.setAutoscrolls(true);
		btnDodajUcznia.setBounds(185, 82, 280, 23);
		frmDziennik.getContentPane().add(btnDodajUcznia);
		
		JLabel lblZarzdajOcenami = new JLabel("Zarzadaj ocenami:");
		lblZarzdajOcenami.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblZarzdajOcenami.setBounds(32, 136, 114, 14);
		frmDziennik.getContentPane().add(lblZarzdajOcenami);
		
		JButton btnDodajOcen = new JButton("Dodaj lub usun ocene");
		btnDodajOcen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==btnDodajOcen)
				{
					OcenyFrame oceny = new OcenyFrame();
					oceny.frmDziennikLekcyjny.setVisible(true);
				}
			}
		});
		btnDodajOcen.setBounds(185, 133, 280, 23);
		frmDziennik.getContentPane().add(btnDodajOcen);
		
		JLabel lblZarzdajFrekwencj = new JLabel("Zarzadaj frekwencja:");
		lblZarzdajFrekwencj.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblZarzdajFrekwencj.setBounds(32, 188, 114, 14);
		frmDziennik.getContentPane().add(lblZarzdajFrekwencj);
		
		JButton btnPrzyznajObecnoW = new JButton("Obecnosc");
		btnPrzyznajObecnoW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==btnPrzyznajObecnoW)
				{
					FrekwencjaFrame frekwencja = new FrekwencjaFrame();
					frekwencja.frmDziennikLekcyjny.setVisible(true);
				}
			}
		});
		btnPrzyznajObecnoW.setBounds(185, 185, 125, 23);
		frmDziennik.getContentPane().add(btnPrzyznajObecnoW);
		
		JLabel lblGenerujZestawienie = new JLabel("Generuj zestawienie:");
		lblGenerujZestawienie.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblGenerujZestawienie.setBounds(32, 240, 114, 14);
		frmDziennik.getContentPane().add(lblGenerujZestawienie);
		
		JButton btnredniaUcznia = new JButton("Srednia ucznia");
		btnredniaUcznia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==btnredniaUcznia)
				{
					Srednia srednia = new Srednia();
					srednia.frmDziennikLekcyjny.setVisible(true);
				}
			}
		});
		btnredniaUcznia.setBounds(185, 236, 125, 23);
		frmDziennik.getContentPane().add(btnredniaUcznia);
		
		JButton btnredniaKlasy = new JButton("Srednia klasy");
		btnredniaKlasy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==btnredniaKlasy)
				{
					Zestawienia zestawienia = new Zestawienia();
					zestawienia.sredniaKlasy();
				}
			}
		});
		btnredniaKlasy.setBounds(340, 236, 125, 23);
		frmDziennik.getContentPane().add(btnredniaKlasy);
		
		JButton btnNewButton = new JButton("Uspr.");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(arg0.getSource()==btnNewButton)
				{
					UsprFrame usprawiedliwienie = new UsprFrame();
					usprawiedliwienie.frame.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(340, 185, 125, 23);
		frmDziennik.getContentPane().add(btnNewButton);
	}
}
