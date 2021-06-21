package lec06.interface03.first;

/*
 * 인터페이스와 추상 메소드의 차이
 * 1. 구현 시, 사용하는 keyword : implements vs extends
 * 2. 존재 목적 : 구현 객체의 동작을 통일시키기 위함 vs 주어진 기능을 그대로 사용하거나 확장하기 위함
 * 3. 구현 대상의 수 : 여러 개의 인터페이스 동시 구현 가능 vs 단 하나의 클래스만 상속 가능(다중 상속 x)
 */
public interface SampleInterface {

	// 추상 메소드와 마찬가지로, 인터페이스도 상속받는 클래스가 내부에 선언한 추상 메소드를 구현하도록 강제한다.
	public void interfaceMethod();
	public abstract void abstractMethod();
	
	public String OS_NAME = "windows10";
	public final static String DOWNLOAD_PATH = "C:/";
	
	public class sampleFirst {
		public int sampleCount = 3;
	}
	
	public static class sampleStaticClass {
		public static int staticSampleCount = 1;
	}
	
	public interface innerInterface {
		public void showMsg();
	}
	
	public enum D {CREATE, READ, UPDATE, DELETE}
	
	// 인터페이스 내부에서는 default 키워드를 사용하여 일반 메소드의 구현이 가능하다.
	public default void defaultMethod() {
		System.out.println("기본 메소드입니다. JAVA 1.8 이후부터 사용 가능합니다.");
	}
	
	public static void staticVoidMethod() {
		System.out.println("static 메소드도 사용이 가능합니다. 이 역시 1.8부터 사용이 가능합니다.");
	}
	
	private void privateMethod() {
		System.out.println("interface 내부의 private 메소드입니다. JAVA 11 이후부터 사용 가능합니다.");
	}
	
	default void callPrivateMethodInDefaultMethod() {
		privateMethod();
	}
}
