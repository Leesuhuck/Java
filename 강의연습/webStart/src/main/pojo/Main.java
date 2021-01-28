package pojo;

public class Main {

	public static void main(String[] args) {
		
		GamePlayer gamePlayer = new GamePlayer(new Nintendo(),new AnimalCrossing());
		
		/*
		 * GamePlayer gamePlayer = new GamePlayer();
		 * 인스턴스 조차 생성할수 없는 상태
		 * GamePlayer gamePlayer = new GamePlayer(new Nintendo(),new AnimalCrossing());
		 * 게임플레이어 클래스는 닌텐도 클래스와 애니멀클로싱 클래스에 의존한다.
		 */
		
		gamePlayer.startM();
	
	}

}
