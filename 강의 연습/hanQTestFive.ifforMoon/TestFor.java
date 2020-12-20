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
	/*
		int a = 0;
		
		for (; a < 5; ++a) {

			
		}

		sumM(a);
	}
	
	public static void sumM(int valueM) {			
			System.out.println(valueM);

	}
	*/

	/*
	for (int i = 2; i <= 9; i++) {
			
			if (i == 4) {
				
				for (int j = 1; j < 10; j++) {
					
					System.out.println(i + " X " + j + " = " + (i * j + 1));
					
				}
				
			}else {
				
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " X " + j + " = " + i * j);
					
				}
			}
	*/

	/*
	for (int i = 2; i <= 9; i++) {
		
			for (int j = 1; j < 10; j++) {
				int value = 0;
				
				if (i == 4) {
					value = i * j +1;
				
				} else {
					value = i * j;
			}
					
			System.out.println(i + " X " + j + " = " + value);
				
		}
				
		System.out.println("\n");
	}
	*/

	for (int i = 2; i <= 9; i++) {
		
		if (i == 4) {
			
			copy(i, 1);
		} else {
			
			copy(i, 0);
		}
		
		System.out.println("\n");
	}
}

public static void copy(int i, int z) {
		
		for (int j = 1; j < 10; j++) {
			
			System.out.println(i + " X " + j + " = " + (i * j + z));	
		}
		
	}
