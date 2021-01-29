package pojoDI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

	@Bean
	public Nintendo nintendo() {
		return new Nintendo();
	}
	
	@Bean
	public GamePlayer gamePlayer() {
		return new GamePlayer(nintendo(),animalCrossing());
	}
	
	@Bean
	public AnimalCrossing animalCrossing() {
		return new AnimalCrossing();
	}
}

/*
 * @Configuration 을 클래스위에 적어주면
 * 난 DI컨테이너에 설정파일이야 라고 스프링 프레임워크에 알려주는 역할을 한다.
 * @Bean 이 붙어있는것들은 DI컨테이너 안에서 객체로 생성이 됩니다.
 * nintendo() 메서드명이 Bean에 이름입니다. (결국 그게 객체란 소리다.)
 */
