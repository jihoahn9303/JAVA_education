package lec04.OOP04;

public class MethodCallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumRtn = sumLogic(1, 2);
		System.out.println("sumRtn : " + sumRtn);
		
		AnotherClassUserInMethodCallTest.sayHello();
		
		AnotherClassUserInMethodCallTest acmt = new AnotherClassUserInMethodCallTest();
		acmt.sayRoger();
	}
	
	public static int sumLogic(int one, int two) {
		int sum = one + two;
		return sum;
	}
}
