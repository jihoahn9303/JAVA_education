package lec07.collectionset03.first;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {

		Set<Integer> setInt = new HashSet<Integer>();
		setInt.add(1);
		setInt.add(2);
		setInt.add(3);
		setInt.add(4);
		setInt.add(5);
		
		Set<String> setString = new HashSet<String>();
		setString.add("�ѱ�");
		setString.add("�߱�");
		setString.add("�̱�");
		
		System.out.println("�����͸� ����մϴ�.");
		System.out.println(setInt.toString());
		System.out.println(setString.toString());
		
		int intSize = setInt.size();
		int strSize = setString.size();
		
		System.out.println("int ũ�� : " + intSize);
		System.out.println("str ũ�� : " + strSize);
		
		System.out.println(setInt.toString());
		boolean remove = setInt.remove(2);
		System.out.println(setInt.toString());
		
		System.out.println("����� ��");
		System.out.println(setInt.toString());
		setInt.clear();
		System.out.println("���� ��");
		System.out.println(setInt.toString());
		
		setInt.add(1);
		setInt.add(2);
		setInt.add(3);
		setInt.add(4);
		setInt.add(5);
		
		boolean contains = setInt.contains(1);
		System.out.println("contains : " + contains);
		
		Set duplicateSet = new HashSet();
		duplicateSet.addAll(setInt);
		System.out.println("�ϰ� ����Դϴ�.");
		System.out.println(setInt.toString());
		System.out.println(duplicateSet.toString());
		
		boolean boolContainsAll = setInt.containsAll(duplicateSet);
		System.out.println("��� �����ϴ°�? : " + boolContainsAll);
		
		Set setRemove = new HashSet();
		setRemove.add(1);
		setRemove.add(2);
		setRemove.add(3);
		
		System.out.println("�����͸� ���մϴ�.");
		System.out.println(setInt.toString());
		System.out.println(setRemove.toString());
		System.out.println("setInt�� removeAll�� �����մϴ�.");
		
		boolean isRemoveAll = setInt.removeAll(setRemove);
		System.out.println("removeAll�� ����Ǿ����ϱ�? : " + isRemoveAll);
		System.out.println(setInt.toString());
		
		System.out.println("\n\n");
		
		setInt = new HashSet<Integer>();
		setInt.add(1);
		setInt.add(2);
		setInt.add(3);
		setInt.add(4);
		setInt.add(5);
		
		System.out.println("retainAll ���� ������ Ȯ��");
		System.out.println(setInt.toString());
		System.out.println(setRemove.toString());
		
		setInt.retainAll(setRemove);
		System.out.println("setInt�� Ȯ���մϴ�.");
		System.out.println(setInt.toString());
		
		System.out.println("iterator�� �۵��մϴ�.");
		Iterator<String> iterator = setString.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}
	}

}
