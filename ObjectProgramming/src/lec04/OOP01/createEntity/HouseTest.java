package lec04.OOP01.createEntity;

public class HouseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House house = new House();
		House houseAnother = new House();
		
		System.out.println("������1 : " + house.airconStat);
		System.out.println("������2 : " + houseAnother.airconStat);
		
		house.airconOn();
		System.out.println("������1 : " + house.airconStat);
		System.out.println("������2 : " + houseAnother.airconStat);
		
		house.airconOff();
		System.out.println("������1 : " + house.airconStat);
		System.out.println("������2 : " + houseAnother.airconStat);
	}

}
