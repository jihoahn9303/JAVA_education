package lec04.OOP15;

public class KIA extends CarParent {

	public void howManyWheel() {
		System.out.println(super.wheelCount);
	}
	
	public void howManyDoor() {
		System.out.println(super.doorCount);
	}
}
