package lec07.collectioniterator07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorMain {

	public static void main(String[] args) {

		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("1", "����ϻ����");
		dataMap.put("2", "���������");
		dataMap.put("3", "�޸𸮹ݵ�ü�����");
		dataMap.put("4", "�ý��۹ݵ�ü�����");
		dataMap.put("5", "�ڵ��������������");
		
		System.out.println(dataMap);
		
		Set<Map.Entry<String, Object>> entrySetData = dataMap.entrySet();
		Iterator<Map.Entry<String, Object>> iteratorData = entrySetData.iterator();
		
		while(iteratorData.hasNext()) {
			Map.Entry<String, Object> nextData = iteratorData.next();
			System.out.println("key : " + nextData.getKey() + " , " + "value : " + nextData.getValue());
		}
	}

}
