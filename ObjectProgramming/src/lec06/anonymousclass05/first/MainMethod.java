package lec06.anonymousclass05.first;

/*
 * 익명 클래스의 사용
 * 1. 사용 이유 : 프로그램 내부에서 한번만 객체로 만들어서 사용하는 상황이 발생하기 때문
 * 2. 주로 사용하는 곳 : Thread(Runnable), Event Listener 객체 생성, UI handling 등
 */
public class MainMethod {

	public static void main(String[] args) {

		// 익명 클래스 : 기존에 정의하였던 클래스 또는 인터페이스를 구현함과 동시에 객체 생성이 가능! 
		new Company() {
			@Override
			public String returnCompanyName() {
				return super.returnCompanyName();
			}			
		};
		
		Company comp = new Company("Korea Gas") {			
			@Override
			public String returnCompanyName() {
				return super.returnCompanyName();
			}			
		};
		
		System.out.println(comp.returnCompanyName());
		
		
		new Runnable() {			
			@Override
			public void run() {
				
			}
		};
	}

}
