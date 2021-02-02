package lab04_pop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Zestawienia 
{
	public void sredniaUcznia(String imie, String nazwisko)
	{
		Scanner s = null;
		try
		{
			File plik = new File("Oceny.txt");
			s = new Scanner(plik);
		}
		catch(FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null, "B³ad przy odczycie pliku");
		}
		
		double licznik = 0;
		double suma = 0;
		double srednia = 1;
		while(s.hasNextLine())
		{
			String linia = s.nextLine();
			String tekst[] = null;
			tekst = linia.split(":");
			if(tekst[0].equals(imie) && tekst[1].equals(nazwisko))
			{
				double skladnik = 0;
				skladnik = Double.parseDouble(tekst[4]);
				suma += skladnik;
				licznik++;
			}
		}
		srednia = suma/licznik;
		s.close();
		JOptionPane.showMessageDialog(null, "Srednia ucznia "+imie+" "+nazwisko+" wynosi: "+srednia);
	}
	
	public void sredniaKlasy()
	{
		Scanner s = null;
		try
		{
			File plik = new File("Oceny.txt");
			s = new Scanner(plik);
		}
		catch(FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null, "B³ad przy odczycie pliku");
		}
		
		double licznik =0;
		double suma = 0;
		double srednia = 0;
		while(s.hasNextLine())
		{
			String linia = s.nextLine();
			String tekst[] = null;
			tekst = linia.split(":");
			double skladnik = 0;
			skladnik = Double.parseDouble(tekst[4]);
			suma += skladnik;
			licznik++;
		}
		srednia = suma/licznik;
		JOptionPane.showMessageDialog(null,"Srednia klasy wynosi: "+srednia);
	}
}
