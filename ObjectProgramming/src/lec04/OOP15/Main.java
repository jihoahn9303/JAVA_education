package lec04.OOP15;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Hyundai hyundai = new Hyundai();
		KIA kia = new KIA();
		
		hyundai.howManyDoor();
		hyundai.howManyWheel();
		
		kia.howManyWheel();
		kia.howManyDoor();
	}

}
