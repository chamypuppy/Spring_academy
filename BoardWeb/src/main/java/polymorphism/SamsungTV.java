package polymorphism;

public class SamsungTV implements TV{
	// 생성자
	public SamsungTV() {
		System.out.println("=> SamsungTV 객체 생성");
	}
	
	/*
	// 생성자 이후에 호출되는 메서드
	public void initMethod() {
		System.out.println("- 객체 초기화 작업 처리 -");
	}
	
	// 객체 소멸 전에 호출되는 메서드
	public void destroyMethod() {
		System.out.println("- 객체 소멸 전에 처리할 로직 -");
	}
	*/
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV --- 젼원을 켠다.");
	}
	
	@Override
	public void powerOff() {
		System.out.println("SamsungTV --- 전원을 끈다.");
		
	}
	
	@Override
	public void volumeUp() {
		System.out.println("SamsungTV --- 소리를 올린다.");
	}
	
	@Override
	public void volumeDown() {
		System.out.println("SamsungTV --- 소리를 내린다.");
	}
}

