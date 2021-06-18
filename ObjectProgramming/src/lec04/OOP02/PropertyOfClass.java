package lec04.OOP02;

public class PropertyOfClass {

	// 정적 전역변수
	// 같은 클래스라면, 이 값을 공유하게 된다.
	public static int entityCount;
	
	// 전역 변수(인스턴스 변수)
	// 클래스의 각 객체별로, 고유의 값을 가지게 된다.
	public String goodsNo;
	public String goodsName;
	public String goodsPrice;
	
	// enum으로 정의할 경우, {}안에 표시한 값만 사용할 수 있다.
	public enum EnumDataType {
		INSERT, UPDATE, DELETE, NORMAL
	}	
	public EnumDataType enumDataType = EnumDataType.NORMAL;
	
	// static 초기화 block
	// 클래스를 통해, 여러 인스턴스를 생성하더라도, 딱 한번만 호출된다.
	static {
		System.out.println("Goods ::: 정적 초기화 실행");
		System.out.println("Goods entity count : " + entityCount);
		System.out.println("정적 초기화가 여러번 실행될까요?");
	}
	
	// 일반 초기화 block
	// 인스턴스를 생성할 때마다 호출되는 block, 생성자보다 먼저 호출된다
	{
		System.out.println("초기화 블럭을 실행합니다.");
		entityCount++;
		
		goodsNo = "goods" + entityCount;
		
		System.out.println("상품번호 : " + goodsNo);
	}
	
	// 생성자 함수
	public PropertyOfClass() {
		System.out.println("기본 생성자 함수를 실행합니다.");
	}
	
	public PropertyOfClass(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public PropertyOfClass(String goodsName, String goodsPrice) {
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;		
	}

	// toString : 해당 인스턴스의 전역 변수 값을 알고 싶을 때, 주로 사용한다.
	// mouse right click -> source -> generate toString
	@Override
	public String toString() {
		return "PropertyOfClass [goodsNo=" + goodsNo + ", goodsName=" + goodsName + ", goodsPrice=" + goodsPrice + "]";
	}
	
	// static inner class
	// 클래스 내부에서 클래스를 생성할 수 있다.
	// 이 때, 클래스의 모든 객체가 동일한 값을 가져야 할 경우 사용한다.
	public static class InnerClassInfo {
		public static String[] innerClassPropertiesName = new String[] {"상품번호", "상품명", "단가"};
		public static int[] innerClassPropertiesPrice = new int[] {100, 1500, 2000, 3000};		
	}
	
}
