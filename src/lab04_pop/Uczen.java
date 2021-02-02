package lab04_pop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Uczen
{
	
	public void dodajUcznia(String imie, String nazwisko) 
	{
		PrintWriter zapis = null;
		try
		{
			zapis = new PrintWriter(new FileWriter("Uczniowie.txt",true));
		}
		catch(FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null, "B³ad przy odczycie pliku");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		zapis.println();
		zapis.print(imie+":"+nazwisko);
		zapis.close();
		JOptionPane.showMessageDialog(null, "Modyfikacja zakonczona pomyslnie.\n Uczen zostal dodany do klasy.");
	}
	
	public void usunUcznia(String imie, String nazwisko) 
	{
		Scanner s1 = null;
		Scanner s2 = null;
		PrintWriter zapis1 = null;
		PrintWriter zapis2 = null;
		
		try
		{
			File plik1 = new File("Uczniowie.txt");
			s1 = new Scanner(plik1);
			zapis1 = new PrintWriter("Pomocniczy.txt");
			zapis2 = new PrintWriter(new FileWriter("Pomocniczy.txt",true));
		}
		catch(FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null, "B³ad przy odczycie pliku");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		int licznik = 0;
		int czyIstnieje = 0;
		while(s1.hasNextLine())
		{
			String linia = s1.nextLine();
			String tekst[] = null;
			tekst = linia.split(":");
			if(imie.equals(tekst[0]) && nazwisko.equals(tekst[1]))
			{
				czyIstnieje++;
				continue;
			}
			else
			{
				if(licznik == 0)
				{
					zapis1.print(tekst[0]+":"+tekst[1]);
				}
				else
				{
					zapis2.println();
					zapis2.print(tekst[0]+":"+tekst[1]);
				}
			}
			licznik++;
		}
		if(czyIstnieje==0)
		{
			JOptionPane.showMessageDialog(null, "Podany uczen nie jest czlonkiem klasy");
		}
		zapis1.close();
		zapis2.close();
		s1.close();
		
		PrintWriter zapis3 = null;
		PrintWriter zapis4 = null;
		try
		{
			File plik2 = new File("Pomocniczy.txt");
			s2 = new Scanner(plik2);
			zapis3 = new PrintWriter("Uczniowie.txt");
			zapis4 = new PrintWriter(new FileWriter("Uczniowie.txt",true));
		}
		catch(FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null, "B³ad przy odczycie pliku");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		licznik = 0;
		while(s2.hasNextLine())
		{
			String linia = s2.nextLine();
			String tekst[] = null;
			tekst = linia.split(":");
			if(licznik==0)
			{
				zapis3.print(tekst[0]+":"+tekst[1]);
			}
			else
			{
				zapis4.println();
				zapis4.print(tekst[0]+":"+tekst[1]);
			}
			licznik++;
		}
		zapis3.close();
		zapis4.close();
		s2.close();
		if(czyIstnieje!=0)
		{
			JOptionPane.showMessageDialog(null, "Modyfikacja zakonczona pomyslnie.\n Uczen zostal usuniety klasy.");
		}
	}
	
}
