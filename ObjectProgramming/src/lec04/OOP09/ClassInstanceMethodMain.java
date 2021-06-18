package lec04.OOP09;

public class ClassInstanceMethodMain {
	public int i = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stSum = ClassInstanceMethod.staticSum(1, 2);
		int stAv = ClassInstanceMethod.staticAverage(4, 8);
		System.out.println("stSum : " + stSum);
		System.out.println("stAv : " + stAv);
		
		ClassInstanceMethod cim = new ClassInstanceMethod();
		int etSum = cim.entitySum(2, 3);
		int etAv = cim.entityAverage(6, 10);
		System.out.println("etSum : " + etSum);
		System.out.println("etAv : " + etAv);
		
//		int test = i + 1;
	}

}
