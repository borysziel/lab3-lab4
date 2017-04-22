package lab3;

public class Vektor2D {

	public double x,y; //definicja pól wspó³rzêdnych jako publiczne
public Vektor2D()//konstruktor domyslny
{
	
}
public Vektor2D(double x ,double y)//konstruktor z parametrami
{
	this.x=x;
	this.y=y;
}
//Metoda  z  parametrem zwracaj¹ca nowy  obiekt klasy  Vector2D,
//bêd¹cy  sum¹ wektora,  dla którego zosta³a wywo³ana i wektora podanego jako parametr
public Vektor2D first_object(Vektor2D z)
{
	Vektor2D wektor = new Vektor2D(x+z.x,y+z.y);
	return wektor;
}
//Metoda  z  parametrem zwracaj¹ca nowy  obiekt klasy  Vector2D,
//bêd¹cy  ró¿nic¹ wektora,  dla którego zosta³a wywo³ana i wektora podanego jako parametr
public Vektor2D second_object(Vektor2D z)
{
	Vektor2D wektor2 = new Vektor2D(x-z.x,y-z.y);
	return wektor2;
}
//Metoda  z  parametrem zwracaj¹ca nowy  obiekt klasy  Vector2D,
//bêd¹cy  iloczynem wektora,  dla którego zosta³a wywo³ana i sta³ej
public Vektor2D third_object(double z)
{
	Vektor2D wektor3 = new Vektor2D(x*z,y*z);
	return wektor3;
}
//metoda daj¹ca d³ugoœæ wektora
public double Lengthofvektor()
{
	return Math.sqrt(x*x+y*y);
	
}
//metoda bez parametrów tworz¹ca obiekt i zwracaj¹ca 
//wektor znormalizowany
public Vektor2D normalizacja()
{	double x2=x/Math.sqrt(x*x+y*y);
	double y2=y/Math.sqrt(x*x+y*y);
	Vektor2D wektor4 = new Vektor2D(x2,y2);
	return wektor4;
}
}
