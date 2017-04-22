package lab3;

public class Vektor2D {

	public double x,y; //definicja p�l wsp�rz�dnych jako publiczne
public Vektor2D()//konstruktor domyslny
{
	
}
public Vektor2D(double x ,double y)//konstruktor z parametrami
{
	this.x=x;
	this.y=y;
}
//Metoda  z  parametrem zwracaj�ca nowy  obiekt klasy  Vector2D,
//b�d�cy  sum� wektora,  dla kt�rego zosta�a wywo�ana i wektora podanego jako parametr
public Vektor2D first_object(Vektor2D z)
{
	Vektor2D wektor = new Vektor2D(x+z.x,y+z.y);
	return wektor;
}
//Metoda  z  parametrem zwracaj�ca nowy  obiekt klasy  Vector2D,
//b�d�cy  r�nic� wektora,  dla kt�rego zosta�a wywo�ana i wektora podanego jako parametr
public Vektor2D second_object(Vektor2D z)
{
	Vektor2D wektor2 = new Vektor2D(x-z.x,y-z.y);
	return wektor2;
}
//Metoda  z  parametrem zwracaj�ca nowy  obiekt klasy  Vector2D,
//b�d�cy  iloczynem wektora,  dla kt�rego zosta�a wywo�ana i sta�ej
public Vektor2D third_object(double z)
{
	Vektor2D wektor3 = new Vektor2D(x*z,y*z);
	return wektor3;
}
//metoda daj�ca d�ugo�� wektora
public double Lengthofvektor()
{
	return Math.sqrt(x*x+y*y);
	
}
//metoda bez parametr�w tworz�ca obiekt i zwracaj�ca 
//wektor znormalizowany
public Vektor2D normalizacja()
{	double x2=x/Math.sqrt(x*x+y*y);
	double y2=y/Math.sqrt(x*x+y*y);
	Vektor2D wektor4 = new Vektor2D(x2,y2);
	return wektor4;
}
}
