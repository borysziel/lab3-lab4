package lab3;
import java.util.TimerTask;
public class SimTask extends TimerTask {
//	 Prywatne pole do przechowywania obiektu klasy SimEngine
//	 Prywatne pole do przechowywania obiektu klasy SpringApplet
//	 Prywatne pole do przechowywania odstêpu czasowego pomiêdzy 
//	 kolejnymi krokami symulacji (w sekundach). 
	
	private SimEngine obiekt1;
	private SpringApplet obiekt2;
	private double odstepczasu;

		
		
//	 Konstruktor z parametrami pozwalaj¹cy na przypisanie do pól klasy 
//	 obiektu klasy SimEngine, obiektu klasy SpringApplet 
//	 i odstêpu czasowego pomiêdzy kolejnymi krokami symulacji
		public SimTask(SimEngine obiekt1, SpringApplet springApplet, double odstepczasu){
			
			this.obiekt1=obiekt1;
			this.obiekt2=springApplet;
			this.odstepczasu=odstepczasu;
			
		}
		
//		 Przeci¹¿ona, publiczna, bezparametrowa metoda run():
//			a) uruchomienie obliczenia kolejnego kroku symulacji 
//			b) odœwie¿enie wyœwietlania powierzchni appletu (wywo³anie metody repaint()). 
		
		public void run(){
			
		obiekt1.przebieg(odstepczasu);
		obiekt2.repaint();
			
			
		}
		
	
}
