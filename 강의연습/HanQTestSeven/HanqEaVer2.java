package hanQTestSeven;

public abstract class HanqEaVer2 extends HanqEa {
	/*
	 * 추상클래스 안에 또 추상클래스를 상속시켜 부모안에 자식을 만들면
	 * 그 부모 또한 구현할때 자식 추상클래스에 모든걸 구현하는게 아닌
	 * 하나도 구현안해도되고 하나만 구현해도되고 자유롭게 구현할수있다.
	 */
	@Override
	public void semina() {
		System.out.println("세미나 없어요");
		
	}
}
