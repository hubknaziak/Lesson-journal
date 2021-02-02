package lab04_pop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Frekwencja 
{
	public void przyznajObecnosc(String imie, String nazwisko, String data, boolean obecnosc) 
	{
		PrintWriter zapis = null;
		try
		{
			zapis = new PrintWriter(new FileWriter("Frekwencja.txt",true));
		}
		catch(FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null, "B³ad przy odczycie pliku");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		if(obecnosc)
		{
			zapis.println();
			zapis.print(imie+":"+nazwisko+":"+data+":"+"true");
			zapis.close();
			JOptionPane.showMessageDialog(null, "Obecnosc przyznana pomyslnie");
		}
		else
		{
			zapis.println();
			zapis.print(imie+":"+nazwisko+":"+data+":"+"false");
			zapis.close();
			JOptionPane.showMessageDialog(null, "Nieobecnosc przyznana pomyslnie");
		}
	}
	
	public void usprawiedliwienie(String imie, String nazwisko, String data) 
	{
		Scanner s1 = null;
		Scanner s2 = null;
		PrintWriter zapis1 = null;
		PrintWriter zapis2 = null;
		
		try
		{
			File plik1 = new File("Frekwencja.txt");
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
		while(s1.hasNextLine())
		{
			String linia = s1.nextLine();
			String tekst[] = null;
			tekst = linia.split(":");
			if(imie.equals(tekst[0]) && nazwisko.equals(tekst[1]) && data.equals(tekst[2]) && tekst[3].equals("false"))
			{
				if(licznik==0)
				{
					zapis1.print(tekst[0]+":"+tekst[1]+":"+tekst[2]+":"+"true");
				}
				else
				{
					zapis2.println();
					zapis2.print(tekst[0]+":"+tekst[1]+":"+tekst[2]+":"+"true");
				}
			}
			else
			{
				if(licznik == 0)
				{
					zapis1.print(tekst[0]+":"+tekst[1]+":"+tekst[2]+":"+tekst[3]);
				}
				else
				{
					zapis2.println();
					zapis2.print(tekst[0]+":"+tekst[1]+":"+tekst[2]+":"+tekst[3]);
				}
			}
			licznik++;
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
			zapis3 = new PrintWriter("Frekwencja.txt");
			zapis4 = new PrintWriter(new FileWriter("Frekwencja.txt",true));
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
				zapis3.print(tekst[0]+":"+tekst[1]+":"+tekst[2]+":"+tekst[3]);
			}
			else
			{
				zapis4.println();
				zapis4.print(tekst[0]+":"+tekst[1]+":"+tekst[2]+":"+tekst[3]);
			}
			licznik++;
		}
		zapis3.close();
		zapis4.close();
		s2.close();
		JOptionPane.showMessageDialog(null, "Usprawiedliwienie zaakceptowane");
	}
}
