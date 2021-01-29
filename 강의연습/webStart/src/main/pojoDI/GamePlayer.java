package pojoDI;

public class GamePlayer {

	Nintendo nintendo = null;
	
	AnimalCrossing animalCrossing = null;
	/*
	 * 메인에서 게임플레이어에 생성자를 호출하세요
	 * 생성자를 통해서 닌텐도와 애니멀크로싱에 객체를 받은 다음에
	 * 그 받은 객체를 게임플레이어 클래스 안에서 활용하세요
	 * 그 다음 같은 결과물이 나오게 해주세요
	 */
	
	public GamePlayer(Nintendo nin, AnimalCrossing aniCro) {
		nintendo 		= nin;
		animalCrossing 	= aniCro;
	}
	
	/*
	 * 게임플레이어 클래스가 필요로 하는 닌텐도 클래스와  에니멀크러쉬 클래스를 게임플레이어
	 * 클래스 외부에서 생성을 한 후 그런 다음에 내부에서 받아가지고 사용가능하게 만든다는 과정을
	 * 의존성을 주입한다 라고 한다. 다른말로 인젝션한다 라고 합니다.
	 * new 라는 예약어를 통해서 인젝션을 하고있다.
	 * 근데 이거를 자동으로 해주는게 있다 바로 그게 DI컨테이너다.
	 * DI라는건 디펜던시 인젝션 이라는 뜻이다. (Dependency injection)
	 * 의존성중이라는 뜻이다. 스프링에 DI 컨테이너다. 개발자 대신에 객체를 생성하고 의존성을 관리하는 역할을
	 * 한다. 개발자는 단지 DI컨테이너에 설정파일 만들어준다.
	 * 우리가 지금까지 한걸 예제로 든걸 설명하면
	 * 게임플레이어,닌텐도,에니멀크러쉬에 클래스에 관한 정보를 넣고 그 클래스들에 이종관계를 거기에서 정의한다
	 * 그러면 스프링에 DI컨테이너가 알아서 New연산자로 인스턴스 생성을 진행하고 그럼 우리는 DI컨테이너에서 필요한
	 * 객체를 꺼내다 쓰면 된다. 
	 * DI컨테이너는 객체라 부르지않고 bean/콩 이라고 부릅니다.
	 * 이 bean은 스프링에서 다루는 객체입니다.
	 */
	
	public void startM() {
		
		System.out.println("start");
		
		nintendo.powerOn();
		
		animalCrossing.gameStart();
		
	}
	
}
