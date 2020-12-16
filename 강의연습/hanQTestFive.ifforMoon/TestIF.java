package hanQTestFive.ifforMoon;

public class TestIF {
	
	public static void main(String[] args) {
		
		int a = 11;
		
		
		//괄호안 : 제어식, 부울표현식, 조건문, 조건식
		// true false를 논리값 리터럴
		// < : 관계연산자 관계연산자는 한칸씩 띄운다.
		// == : 같냐?
		// <= : 크거나 같냐?
		// >= : 작거나 같냐?
		// != : 다르지않냐?
		// 위 조건식중 하나라도 true면 그 뒤에있는 조건문들은 다 실행이 안된다.
		if (a != 11) {
			// 부울표현식이 True일때 실행한다.
			// if else if else 문 또는 다중 if문 부름
			System.out.println("if");
		} else if (a <= 12){
			
			System.out.println("else if");
			
		} else {
			
			System.out.println("else");
		}
	}
}
