package lab3;

public class SimEngine {
//	Prywatne pola parametrów symulacji – masa, wspó³czynnik sprê¿ystoœci,
//	wspó³czynnik t³umienia, d³ugoœæ swobodna sprê¿yny, po³o¿enie masy,
//	prêdkoœc masy, po³o¿enie punktu zawieszenia, przyspieszenie grawitacyjne
//	– wraz z niezbêdnymi akcesorami
	private double masa,sprezystosc,tlumienie,dlugosc,g;
	private Vektor2D polozenie , polozenie2,predkosc;
	
public SimEngine(double masa, double sprezystosc, double tlumienie, 
		double dlugosc,  Vektor2D polozenie,Vektor2D predkosc,  Vektor2D polozenie2, double g)
{  // konstruktor z parametrami
		
		this.masa=masa;
		this.sprezystosc=sprezystosc;
		this.tlumienie=tlumienie;
		this.dlugosc=dlugosc;
		this.polozenie=polozenie;
		this.predkosc=predkosc;
		this.polozenie2=polozenie2;
		this.g=g;	
		
	}

	public double getM(){
		return masa;
	}

	public void setMasa(double masa){
		this.masa=masa;	
	}
	
	public double getsprezystosc(){
		return sprezystosc;
	}

	public void setsprezystosc(double sprezystosc){
		this.sprezystosc=sprezystosc;	
	}
	public double gettlumienie(){
		return tlumienie;
	}

	public void settlumienie(double tlumienie){
		this.tlumienie=tlumienie;	
	}
	public double getdlugosc(){
		return dlugosc;
	}

	public void setdlugosc(double dlugosc){
		this.dlugosc=dlugosc;	
	}
	public Vektor2D getpolozenie(){
		return polozenie;
	}

	public void setpolozenie(Vektor2D polozenie){
		this.polozenie=polozenie;	
	}
	public Vektor2D getpredkosc(){
		return predkosc;
	}

	public void setpredkosc(Vektor2D predkosc){
		this.predkosc=predkosc;	
	}
	public Vektor2D getpolozenie2(){
		return polozenie2;
	}

	public void setpolozenie2(Vektor2D polozenie2){
		this.polozenie2=polozenie2;	
	}
	
	public double getG(){
		return g;
	}

	public void setG(double g){
		this.g=g;	
	}
	
	// Metoda z parametrem - krokiem czasowym, obliczaj¹ca przebieg symulacji 
	public void przebieg(double t)
	{
		Vektor2D wypadkowa = new Vektor2D();
		Vektor2D sila_grawitacji = new Vektor2D(0,masa*g);
		Vektor2D sprezystosci = new Vektor2D();
		Vektor2D tlumienia = new Vektor2D();
		
		sprezystosci=polozenie.second_object(polozenie2).normalizacja().third_object
				(tlumienie*(polozenie2.second_object(polozenie). Lengthofvektor()-getdlugosc()));
		tlumienia = predkosc.third_object(-tlumienie);
		wypadkowa=sila_grawitacji.first_object(sprezystosci).first_object(tlumienia);
		predkosc=predkosc.first_object(wypadkowa.third_object(t/masa));
		polozenie2=polozenie2.first_object(predkosc.third_object(t));
		
	}
	 //Metoda bez parametrów resetuj¹ca symulacjê 
	public void Zeruj(){
		 predkosc.x = 0;
		 predkosc.y = 0;
	}
	
}
