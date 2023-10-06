package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 초기 파일 상태 = SamsungTV.java, LgTV.java, TVUser.java
< TV를 바꿨을 때의 문제점 >
1. 대부분의 소스 코드를 고쳐야 한다. = 결합도가 높은 프로그램
 * Sol1. 자바의 기능인 '상속' 기능 사용 
   (TV.java 파일 생성)
2. 여전히 소스코드의 일부를 고쳐야 함. > 티비 브랜드명
 * Sol2. 상속 + 팩토리 디자인패턴 활용 = 결합도가 낮은 프로그램
   (BeanFactory.java 파일 생성)

 * Sol3. 본격적인 Spring 사용 = 상속 + 팩토리 디자인 패턴 + xml 설정
						      스프링 컨테이너를 통해 해결
  (applicationContext.xml 파일 생성)
 */

public class TVUser {
	public static void main(String[] args) {
		/*
		// SOl2. 방법 > Run config머시기에서 args를 입력해주어야 함
		BeanFactory factory = new BeanFactory();
		TV tv = (TV) factory.getBean(args[0]); // 소스 코드를 하나도 변경하지 않음
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		*/
		
		// SOL3. 
		// 1) 만들어놓은 applicationContext.xml을 불러오기 위한 코드
		// 	  Spring 컨테이너를 구동하여  xml 파일을 읽어온다
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2) xml에서 생성된 빈을 찾아서 실행 = lookup
		TV tv = (TV)factory.getBean("tv"); // bean id="tv" ckwdma
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		// 3) Spring 컨테이너 닫기
		factory.close();
		
	}
}
