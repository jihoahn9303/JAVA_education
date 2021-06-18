package lec04.OOP06;

public class DynamicArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicArray dArray = new DynamicArray();
		dArray.dynamicMethod("Grape", "WaterMelon", "Apple", "Orange");
		
		dArray.dynamicMethod(new String[] {"Samsung", "SK", "Hyundai", "LG"});
	}

}
