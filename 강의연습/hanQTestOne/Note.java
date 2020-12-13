package hanQTestOne;

public class Note {
	
	Note() {

	}

	public static void main (String[] args) {

		int derHaGiCall 	= Pen.derHaGi(1, 2),
				
		bbeGiCall 			= Pen.beeGi(4, 3);

		// 인스턴스화 할때 참조변수에 참조변수명은 클래스명을 그대로 따서 앞자리만 소문자로 하는게 암묵적인 룰이다.
		Note note 			= new Note();
		
		
		String maMuRiCall 	= note.maMuRi();
		
		Pen pen 			= new Pen(); //인스턴스화
		

		System.out.println(derHaGiCall + bbeGiCall + pen.startStr()); //인스턴스 메소드를 활용해서 
	}

	public String maMuRi() {

		return " 입니다.";
	}
}
