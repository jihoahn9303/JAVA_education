package lec07.collectioniterator07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorMain {

	public static void main(String[] args) {

		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("1", "모바일사업부");
		dataMap.put("2", "가전사업부");
		dataMap.put("3", "메모리반도체사업부");
		dataMap.put("4", "시스템반도체사업부");
		dataMap.put("5", "자동차전자장비사업부");
		
		System.out.println(dataMap);
		
		Set<Map.Entry<String, Object>> entrySetData = dataMap.entrySet();
		Iterator<Map.Entry<String, Object>> iteratorData = entrySetData.iterator();
		
		while(iteratorData.hasNext()) {
			Map.Entry<String, Object> nextData = iteratorData.next();
			System.out.println("key : " + nextData.getKey() + " , " + "value : " + nextData.getValue());
		}
	}

}
