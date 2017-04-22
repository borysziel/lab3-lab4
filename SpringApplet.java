package lab3;
import javax.swing.JApplet;

import java.awt.*;
import javax.swing.*;
import java.util.Timer;
public class SpringApplet extends JApplet{
//	 Prywatne pole do przechowywania obiektu klasy SimEngine. 
//	 Prywatne pole do przechowywania obiektu klasy SimTask. 
//	 Prywatne pole do przechowywania obiektu klasy Timer. 
	private SimEngine obiekt1;
	private SimTask obiekt2;
	private Timer obiekt3;
//	 Przeci¹¿ona, publiczna, bezparametrowa metoda init(): 
//		 a) utworzenie nowego obiektu klasy SimEngine za pomoc¹ 
//			konstruktora z parametrami i przypisanie go do pola
//		 b) utworzenie nowego obiektu klasy SimTask za pomoc¹ konstruktora
//			z parametrami i przypisanie go do pola 
//		 c) utworzenie nowego obiektu klasy Timer i przypisanie go do pola 
//		 d) uruchomienie timera przez wywo³anie jego metody scheduleAtFixedRate()
//			z odpowiednimi parametrami. 
	public void init()
	{
//		Vektor2D first = new Vektor2D(3 ,3);
//		Vektor2D second= new Vektor2D(3 ,3);//tworzymy 2 obiekty klasy wekter z parametrami
//		
//	Vektor2D suma = new Vektor2D(); //tworzymy nowy obiekt aby do niego przypisac , szukany obiekt
//	suma=first.first_object(second);//ktory jest suma wektorow
//	
//	
//	Vektor2D ró¿nica = new Vektor2D(); //to samo tylko ró¿nica
//	ró¿nica=first.second_object(second);
//	
//	Vektor2D norm = new Vektor2D();//normalizowanie wektora "first" 
//	norm=first.normalizacja();//i przypisanie do nowego obiektu
//	
//	Vektor2D norm2 = new Vektor2D();//normalizowanie wektora "second" 
//	norm2=second.normalizacja();//i przypisanie do nowego obiektu
//	
//	double length ;
//	length=first.Lengthofvektor();//wyliczanie dlugosci "first" i zapisanie do nowej zmiennej
//
//	
//	double length2 ;
//	length2=second.Lengthofvektor();//wyliczanie dlugosci "second" i zapisanie do nowej zmiennej
//	
//	Vektor2D mno¿enie = new Vektor2D();
//	mno¿enie=first.third_object(10);//przemnozenie wektora "first" przez sta³¹ 
//	
//	Vektor2D mno¿enie2 = new Vektor2D();
//	mno¿enie2=second.third_object(10);//przemnozenie wektora "second" przez sta³¹ 
//	
//	System.out.println("Wartoœæ wektora  first : " + first.x + " " +first.y);
//	System.out.println("Wartoœæ wektora  second : " + second.x + " " +second.y);
//	System.out.println("Suma wektorów : " + suma.x + " " +suma.y);
//	System.out.println("Ró¿nica wektorów : " + ró¿nica.x + " " +ró¿nica.y);
//	System.out.println("Mno¿enie wektorów : " + mno¿enie.x + " " +mno¿enie.y);
//	System.out.println("Mno¿enie wektorów : " + mno¿enie2.x + " " +mno¿enie2.y);
//	System.out.println("Normalizacja wektora first : " + norm.x + " " +norm.y);
//	System.out.println("Normalizacaj wektora second : " + norm2.x + " " +norm2.y);
//	System.out.println("D³ugoœæ wektora first: " + length);
//	System.out.println("D³ugoœæ wektora second: " + length);
//	//wypisanie wszystkich wartosci 
	Vektor2D polozenie2=new Vektor2D(300,100);
	Vektor2D predkosc = new Vektor2D(0,0);
	Vektor2D polozenie= new Vektor2D(300,50);
			
	obiekt1 = new SimEngine(10, 10 , 2 , 
			100,  polozenie, predkosc,   polozenie2,10);
	 obiekt2 = new SimTask(obiekt1 , this , 0.06);
	 obiekt3 = new Timer();
	obiekt3.scheduleAtFixedRate(obiekt2, 0, 30);
	
	}
//	 Przeci¹¿ona, publiczna, metoda paint() z parametrem typu Graphics: 
//		 a) wyczyszczenie powierzchni appletu 
//		 b) narysowanie linii reprezentuj¹cej sprê¿ynê 
//		 c) narysowanie owalu reprezentuj¹cego masê
	public void paint(Graphics g)
	{

		g.clearRect(0,0,getWidth(),getHeight());
		
		g.drawLine((int) obiekt1.getpolozenie().x, (int) obiekt1.getpolozenie().y, (int) obiekt1.getpolozenie2().x, (int) obiekt1.getpolozenie2().y);
		g.drawLine((int) obiekt1.getpolozenie().x-30, (int) obiekt1.getpolozenie().y, (int) obiekt1.getpolozenie().x+30, (int) obiekt1.getpolozenie().y); 
		g.drawOval((int) obiekt1.getpolozenie2().x - 15, (int) obiekt1.getpolozenie2().y, 30, 30); 
	}
}
