package hanQTestFour;

public class ReturnMethod {

	public static void main(String[] args) {

		DoBridge.doPrint.consoleOut("한큐");
		//정리?
		/*
		 * 일단은 out이라는 영역안에 콘솔창을 띄우는 println실행문이 들어있고
		 * 그 명령어를 프로그래머가 사용하기 위해 System이라는 큰 영역안에는 out을 불러올수있는
		 * 프로그래머가 접근할수있는 메모리영역으로 보냅니다.
		 * 그래서 System.out.println()은 System이 호출되면 그 안에 접근할수있는 out을 접근할수있고
		 * 그후 out에  콘솔창을 띄우는 실행문인 println을 호출할수있게 됩니다.
		 */
		
	}
}