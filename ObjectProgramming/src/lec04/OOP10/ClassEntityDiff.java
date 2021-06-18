package lec04.OOP10;

public class ClassEntityDiff {

	int normalValue = 10;
	static int staticValue = 20;
	
	int normalVlaue2 = staticValue;
//	static staticValue2 = normalValue;

	static void callStaticMethod() {
		System.out.println(staticValue);
//		System.out.println(normalValue);
	}
	
	void callNormalMethod() {
		System.out.println(staticValue);
		System.out.println(normalValue);
	}
	
	static void sampleStaticMethod() {
		System.out.println("static method.");
	}
	
	void sampleNormalMethod() {
		System.out.println("normal method.");
	}
	
	static void doStaticMethod() {
		sampleStaticMethod();
//		sampleNormalMethod();
	}
	
	void doNormalMethod() {
		sampleStaticMethod();
		sampleNormalMethod();
	}
}
