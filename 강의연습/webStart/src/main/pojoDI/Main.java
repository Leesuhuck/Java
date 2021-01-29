package pojoDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(BeansConfig.class);
		/*
		 * 스프링의 DI 컨테이너 (ApplicationContext context)
		 * 에 전달인자가 (BeanConfig.class) 개발자들이 작성해야될 DI컨테이너 설정파일입니다.
		 * 이름을 Aaa.class라 지어도됨 자바 컨피그레이션 클래스라고도함
		 * 인터페이스는 객체를 생성할수 없기때문에 인터페이스를 임플리먼트 받은 클래스에 대신써준다.
		 */
		
		//Bean 닌텐도 객체를 가져옴
		//닌텐도라는 리턴타입중에 bean이름이 nintendo라는 이름에 애를 가져와라
		//Nintendo nintendo = context.getBean("nintendo",Nintendo.class);
		
		//강제형 변환
		/*
		 * 왜? 우리가 뒤에 적어준게 클래스타입이다. 클래스타입을 지정해주지않으면 getBean이 반환값이
		 * 오브젝트다(Object) 그렇기 떄문에 닌텐도 클래스타입에다가 넣어주기 위해서는 닌텐도 클래스타입으로
		 * 강제형 변환 시켜줘야 된다.
		 * Nintendo nintendo = (Nintendo) context.getBean("nintendo");
		 */
		
		GamePlayer gamePlayer = context.getBean(GamePlayer.class);
		
		Nintendo nintendo = context.getBean(Nintendo.class);
		
		AnimalCrossing animalCrossing = context.getBean(AnimalCrossing.class);
		
		gamePlayer.startM();
	}

}
