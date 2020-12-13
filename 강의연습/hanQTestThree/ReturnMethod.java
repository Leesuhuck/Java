package hanQTestThree;

public class ReturnMethod {

	public static void main(String[] args) {

		OneClass oneClass 		= new OneClass();
		// 참조변수, 인스턴스 변수, 레퍼런스 변수(뭔가를 가리키는 변수)
		// new 라는 예약어를 통해 생성된 모든 클래스는 힙 영역에 떨어지게 된다.
	
		TwoClass twoClass 		= new TwoClass();
	
		OneClass oneClassCopy 	= new OneClass();
	
		oneClass 				= three(oneClass, twoClass.hanq());
	
		System.out.println(oneClass.zeroStr);
	
		System.out.println(oneClassCopy.zeroStr);
	
		oneClassCopy 			= oneClass;
	
		System.out.println(oneClassCopy.zeroStr);

	}

	private static OneClass three(OneClass oneClass, String hanq) {

		String four 			= oneClass.hanq() + hanq;
	
		oneClass.zeroStr 		= four;
	
		return oneClass;
}
	
}