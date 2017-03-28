package punkcik;

import punkcik.punkt;

public class main {
	
		public static void main(String[] args)
		{
			punkt p1 = new punkt(); //stworzenie obiektu za pomoca konstruktora domyslnego//
			punkt p2 = new punkt(5); //stworzenie obiektu za pomoca konstruktora z parametrem//
			System.out.println("Masa punktu p1 wynosi " + p1.dajmase());
			System.out.print("Dla punktu p1 ");  
			p1. MomentBezwladnosciGlowny();
			System.out.print("Dla punktu p1 "); 
			p1.MomentBezwladnosciSteiner(2);
			System.out.println("Masa punktu p2 wynosi " + p2.dajmase());
			System.out.print("Dla punktu p2 ");  
			p2. MomentBezwladnosciGlowny();
			System.out.print("Dla punktu p2  ");
			p2.MomentBezwladnosciSteiner(2);
			p1.ustawmase(3);
			System.out.println("Po zmianie masa punktu p1 wynosi " + p1.dajmase());
			System.out.print("Po zmianie dla punktu p1 ");  
			p1. MomentBezwladnosciGlowny();
			System.out.print("Po zmianie dla punktu p1 "); 
			p1.MomentBezwladnosciSteiner(2);
			punkt obiekty[]= new punkt[6]; //tablica zawierajaca obiektamy//
			for (int i=0 ; i<=5;i++) //petla for tworzaca obiekty i wyswietlajaca o nich informacje//
			{
				obiekty[i] = new punkt (i+4);
				System.out.println("Masa punktu p"+(i+3) + " wynosi "  + obiekty[i].dajmase());
				System.out.print("Dla punktu p"+(i+3) + " ");  
				obiekty[i]. MomentBezwladnosciGlowny();
				System.out.print("Dla punktu p"+(i+3) + " "); 
				obiekty[i].MomentBezwladnosciSteiner(2);
			}
			
		}
	}

