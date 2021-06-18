package lec04.OOP11;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingExam overloadingExam = new OverloadingExam();
		
		int calculate = overloadingExam.calculate();
		int over1 = overloadingExam.calculate(1, 2);
		long over2 = overloadingExam.calculate(1L, 4L);
		long over3 = overloadingExam.calculateLong(4, 5);
		
		System.out.println("calculate : " + calculate);
		System.out.println("over1 : " + over1);
		System.out.println("over2 : " + over2);
		System.out.println("over3 : " + over3);
	}

}
