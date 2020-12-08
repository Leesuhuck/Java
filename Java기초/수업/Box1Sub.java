class Box1Sub {
	// 속성 정의 단계
	// 명시적 생성자는 클래스와 이름이 같아야한다.
	// 명시적 생성자는 반환을 하지 않는다.
	
	private int number1;
	int number2;
	int number3;
	private int num;
	
	// 생성자 정의 단계
	public Box1Sub(int horizontal, int Vertical, int Height) {
		number1 = horizontal;
		number2 = Vertical;
		number3 = Height;
	}
	// 기능 정의 단계
	
	public void setNum(int n) {
		num = n;
	}
	
	int getValue() {
		return number1*number2*number3;
	}
}