package hanQTestFive.ifforMoon;

public class TestFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int i = 0,
			j = 0;
		*/
		// 후위 i++; 
		// 전위 ++j; 
		// 단항연산자 - 증감연산자 - 전위연산자, 후위연산자
		
		//System.out.println((i++) +  " , " + (++j));
		//전위는 자신을 먼저 더하고 그 다음 수행
		//후위는 먼저 수행할것을 수행한다음 자신을 더함
		
		// int 	a = i++,
		// 		b = ++j;
		/*
		 int 	a = i--,
		 		b = --j;
		
		System.out.println(a);
		System.out.println(i);
		
		System.out.println(a+b);
		*/
		/*
		for (int i = 0; i < 5; i++) {
			//초기식, 조건식, 증감식
		
			 * 실행순서
			 * 초기식
			 * 조건식
			 * 실행문
			 * 증감식
			 
			sumM(i);
		}
		
	}

	public static void sumM(int valueM) {
		
		if (valueM==4&&valueM<5) {
			System.out.println(valueM);
		}else {
			
		}
	}		
	*/
		
		int a = 0;
		
		for (; a < 5; ++a) {

			
		}

		sumM(a);
	}
	
	public static void sumM(int valueM) {			
			System.out.println(valueM);

	}

}
