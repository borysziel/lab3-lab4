package lab3;
import java.util.TimerTask;
public class SimTask extends TimerTask {
//	 Prywatne pole do przechowywania obiektu klasy SimEngine
//	 Prywatne pole do przechowywania obiektu klasy SpringApplet
//	 Prywatne pole do przechowywania odst�pu czasowego pomi�dzy 
//	 kolejnymi krokami symulacji (w sekundach). 
	
	private SimEngine obiekt1;
	private SpringApplet obiekt2;
	private double odstepczasu;

		
		
//	 Konstruktor z parametrami pozwalaj�cy na przypisanie do p�l klasy 
//	 obiektu klasy SimEngine, obiektu klasy SpringApplet 
//	 i odst�pu czasowego pomi�dzy kolejnymi krokami symulacji
		public SimTask(SimEngine obiekt1, SpringApplet springApplet, double odstepczasu){
			
			this.obiekt1=obiekt1;
			this.obiekt2=springApplet;
			this.odstepczasu=odstepczasu;
			
		}
		
//		 Przeci��ona, publiczna, bezparametrowa metoda run():
//			a) uruchomienie obliczenia kolejnego kroku symulacji 
//			b) od�wie�enie wy�wietlania powierzchni appletu (wywo�anie metody repaint()). 
		
		public void run(){
			
		obiekt1.przebieg(odstepczasu);
		obiekt2.repaint();
			
			
		}
		
	
}
