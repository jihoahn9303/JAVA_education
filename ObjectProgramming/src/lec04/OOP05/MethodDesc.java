package lec04.OOP05;

public class MethodDesc {

	void printInfo() {
		System.out.println("Hello, world.");
	}
	
	void printInfo(String goodsName) {
		
	}
	
	int calculateSum(int quantity, int price) {
		int totalPrice = quantity + price;
		return totalPrice;
	}
	
	int addMaterial(int newInput) {
		int remainValue = 0;
		remainValue = newInput + remainValue;
		return remainValue;
	}
}
