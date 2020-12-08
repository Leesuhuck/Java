public class Box1{
	
	//명시적 생성자
	
	public static void main(String[] args) {
		
		
		Box1Sub num = new Box1Sub(10,20,80);
		
		System.out.println("박스 부피 = "+num.getValue());

		num.setNum(2);
	}

}