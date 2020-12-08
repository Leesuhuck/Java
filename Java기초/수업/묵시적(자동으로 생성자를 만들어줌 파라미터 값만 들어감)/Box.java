package maKe;

public class Box {
// 묵시적 생성자 사용
// 클래스 내에 가로 세로 높이를 입력 받을수 있게 정의
// 메인 메소드 크래스를 따로 생성
// 가로 20 세로 80 높이 10
// 출력은 박스의 ~ 부피는 '부피' 입니다.
	
	
		public static void main(String args[]) {
			BoxValue BoxBox = new BoxValue();
			System.out.println("박스의 "+"가로 "+BoxBox.horizontal+" 세로 "+BoxBox.Vertical+" 높이"+BoxBox.Height+"의 부피는 "+
			BoxBox.Height*BoxBox.horizontal*BoxBox.Vertical+" 입니다.");
		}
}


