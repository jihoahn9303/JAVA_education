package lec04.OOP01.createEntity.entityarray;

import java.util.ArrayList;
import java.util.List;

import lec04.OOP01.createEntity.House;

public class EntityArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House[] houseArray = new House[3];
		houseArray[0] = new House();
		houseArray[1] = new House();
		houseArray[2] = new House();
		
		houseArray[0].airconOn();
		houseArray[1].airconOff();
		
		System.out.println("0��° ������ : " + houseArray[0].airconStat);
		System.out.println("1��° ������ : " + houseArray[1].airconStat);
		
//		�Ϲ������δ�, ��ü �迭 ��� �Ʒ��� ���� ����
		/*
		 List<House> houseList = new ArrayList<House>();
		 houseList.add(new House());
		 houseList.add(new House());
		 houseList.add(new House());
		 */
		
		
	}

}
