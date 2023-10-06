package polymorphism;

public interface TV {
	// 인터페이스는
	// 추상 메서드랑 static 상수만 갖는다. 
	// 그래서 따로 static 기재 안해도 된다
	void powerOn();
	void powerOff();
	void volumeUp();
	void volumeDown();
}
