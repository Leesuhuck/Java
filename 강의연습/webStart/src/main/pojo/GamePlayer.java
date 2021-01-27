package pojo;

public class GamePlayer {

	Nintendo nintendo = new Nintendo();
	
	AnimalCrossing animalCrossing = new AnimalCrossing();
	
	public void startM() {
		
		System.out.println("start");

		nintendo.powerOn();
		
		animalCrossing.gameStart();
		
	}
	
}
