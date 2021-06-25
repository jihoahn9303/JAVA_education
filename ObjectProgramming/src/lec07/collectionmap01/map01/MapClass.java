package lec07.collectionmap01.map01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


// 대표적으로는, HashMap을 사용한다. (검색 속도가 O(l))
// 다만, 입력 데이터의 순서를 보장해야 하는 경우, TreeMap, LinkedHashMap 자료형을 사용한다.
// 참고자료 1 : https://hee96-story.tistory.com/48 (Hash, HashMap, HashTable)
// 참고자료 2 : https://soft.plusblog.co.kr/70 (HashMap vs TreeMap vs LinkedHashMap)

public class MapClass {

	public static void main(String[] args) {
		
		Map<String, Object> sampleMap = new HashMap<String, Object>();
		
		sampleMap.put("과일", "바나나");
		sampleMap.put("곡물", "쌀");
		sampleMap.put("견과", "호두");
		sampleMap.put("채소", "토마토");
		sampleMap.put("우육", "토시살");
		sampleMap.put("돈육", "삼겹살");
		sampleMap.put("계육", "다리살");

		System.out.println(sampleMap.toString());
		
		Object chicken = sampleMap.get("계육");
		System.out.println(chicken);
		
		boolean isChicken = sampleMap.containsKey("계육");
		boolean isFreshLeg = sampleMap.containsValue("다리살");
		
		System.out.println("isChicken : " + isChicken);
		System.out.println("isFreshLeg : " + isFreshLeg);
		
		Set<Map.Entry<String, Object>> entries = sampleMap.entrySet();
		iteratorUsingForEach(sampleMap);
		
		Set<String> keySetstrings = sampleMap.keySet();
		boolean isEmpty = sampleMap.isEmpty();
		Collection<Object> values = sampleMap.values();
		int size = sampleMap.size();
		
		System.out.println("entries : " + entries);
		System.out.println("keySetstrings : " + keySetstrings);
		System.out.println("isEmpty : " + isEmpty);
		System.out.println("values : " + values);
		System.out.println("size : " + size);
		
		System.out.println("============================================");
		
		Map<String, Object> copyMap = new HashMap<String, Object>();
		boolean empty = copyMap.isEmpty();
		
		System.out.println("copyMap is empty : " + empty);
		
		copyMap.putAll(sampleMap);
		boolean equals = sampleMap.equals(copyMap);
		
		System.out.println("같은가? : " + equals);
		
	}
	
//	entrySet()의 사용법
	static void iteratorUsingForEach(Map map){
		System.out.println("============================================");
        Set<Map.Entry<String, Object>> entries = map.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("============================================");
    }

}
