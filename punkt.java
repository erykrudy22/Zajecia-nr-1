package punkcik;

public class punkt {
	private int masa;
	public punkt (int m) //konstruktor z parametrem//
	{
		if(m<=0) System.out.println("Masa musi byc dodatnia");
		else
		masa=m;
	}
	public punkt () //konstruktor domyslny//
	{
		masa=0;
	}
	public void ustawmase(int m) //akcesor// 
	{
        masa=m;
    }
	
	public int dajmase()
	{
	return masa;
	}
	
	public void OpisPunktu() // metoda wyswietlajaca napis Punkt materialny//
	{
		System.out.println("Punkt materialny");
	}
	public void MomentBezwladnosciGlowny() //metoda liczaca moment bezwladnosci glowny//
	{
		int MomentBezwladnosciGlowny = 0;
		System.out.println("Moment bezwladnosci glowny wynosi " + MomentBezwladnosciGlowny);
	}
	public void MomentBezwladnosciSteiner(int odleglosc) //metoda liczaca moment bezwladnosci wzgledem innej osi//
	{
		int MomentBezwladnosciSteiner=masa*odleglosc*odleglosc;
		System.out.println("Moment bezwladnosci wzgledem innej osi wynosi " + MomentBezwladnosciSteiner);
	}
}
