package hanQTestSeven;

// A학원에 부모는! 한큐Ea!
// 인터페이스를 상속할때는 extends를 사용하지않는다.
// implements 를 사용한다.
public class AHakWong extends HanqEa {

	/*
	 * 추상클래스를 상속받은 클래슨느 무조건 추상클래스안에있는 추상메서드 들을 무조건 
	 * 다 구현해야됩니다.
	 */
	@Override //어너테이션  알수있는점: 아 애는상속받은거를 구현하는 메소드구나 
	public void semina() {
		System.out.println("생존전략 모집합니다.");
	}

	@Override
	public void edu() {
		System.out.println("그린2기 모집합니다.");
	}

	@Override
	public void steps() {
		// TODO Auto-generated method stub
		
	}

}
