package lec07.collectionlist02.third;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

	public static void main(String[] args) {

		List<Integer> aList = new ArrayList<Integer>();
		aList.add(1);
		aList.add(2);
		aList.add(3);
		aList.add(4);
		aList.add(5);
		
		boolean contains = aList.contains(1);
		System.out.println("1�� �����ϰ� �ִ°�? : " + contains);
		
		List<Integer> integers = aList.subList(0, 2);
		System.out.println("index 0���� 2�̸����� ���� : " + integers);
		
		List<Integer> bList = new ArrayList<Integer>();
		bList.add(7);
		bList.add(8);
		bList.add(9);
		
		aList.addAll(bList);
		System.out.println(aList.toString());
		
		System.out.println();
		
		boolean b = aList.containsAll(bList);
		System.out.println("�ϰ� ���� ���� : " + b);
		
		System.out.println("�ϰ� ����");
		aList.removeAll(bList);
		
		System.out.println(aList.toString());
		
		System.out.println("����");
		aList.addAll(bList);
		System.out.println(aList.toString());
		
		System.out.println("���� �ڷ�");
		aList.retainAll(bList);
		System.out.println(aList.toString());
	}

}
