package lec04.OOP07.callByReference;

public class CallByReferenceTest {

	public static int primitiveMethod(int value) {
		return value += 1;
	}
	
	public static void main(String[] args) {
//		call by value
		int value = 0;
		System.out.println("value = " + value);
		
		int returnValue = primitiveMethod(value);
		
		System.out.println("value = " + value);
		System.out.println("returnValue = " + returnValue);
		
//		call by reference
		AClass aClass = new AClass();
		aClass.setValue(1);
		System.out.println("aClass 변수의 value : " + aClass.getValue());
		
		callByReferenceMethod(aClass);
		
		System.out.println("aClass의 파라미터를 이용한 변경 시 value : " + aClass.getValue());
	}
	
	public static class AClass {
		private int value = 0;
		
		public int getValue() {
			return value;
		}
		
		public void setValue(int value) {
			this.value = value;
		}
	}
	
	public static void callByReferenceMethod(AClass aClass) {
		aClass.setValue(aClass.getValue() + 1);	
		
	}
}
