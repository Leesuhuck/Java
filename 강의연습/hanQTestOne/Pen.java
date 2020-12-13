package hanQTestOne;

public class Pen {

	static int k = 0;

	Pen() {

		k = 1; //생성자 거쳐서 가게됨.
	}

		public static int derHaGi(int i, int j) { // 그다음 메소드가 호출됨

			return i + j + k;
		}

		public static int beeGi(int i, int j) {

			return i - j + k;
		}

		public String startStr() {

			return " 시작해볼까요?";
		}
}