package lec07.collectionlist02.second;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

	public static void main(String[] args) {

		List<String> aList = new ArrayList<String>();
		
		aList.add("�Ｚ����");
		aList.add("SK���̴н�");
		aList.add("�����ڵ���");
		aList.add("LG����");
		
		for (int i = 0; i < aList.size(); i++) {
			System.out.println(aList.get(i));
		}
		
		System.out.println(aList.toString());
		aList.remove(1);
		System.out.println(aList.toString());
		aList.remove("LG����");
		System.out.println(aList.toString());
	}

}
