package lec07.collectionmap01.map01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


// ��ǥ�����δ�, HashMap�� ����Ѵ�. (�˻� �ӵ��� O(l))
// �ٸ�, �Է� �������� ������ �����ؾ� �ϴ� ���, TreeMap, LinkedHashMap �ڷ����� ����Ѵ�.
// �����ڷ� 1 : https://hee96-story.tistory.com/48 (Hash, HashMap, HashTable)
// �����ڷ� 2 : https://soft.plusblog.co.kr/70 (HashMap vs TreeMap vs LinkedHashMap)

public class MapClass {

	public static void main(String[] args) {
		
		Map<String, Object> sampleMap = new HashMap<String, Object>();
		
		sampleMap.put("����", "�ٳ���");
		sampleMap.put("�", "��");
		sampleMap.put("�߰�", "ȣ��");
		sampleMap.put("ä��", "�丶��");
		sampleMap.put("����", "��û�");
		sampleMap.put("����", "����");
		sampleMap.put("����", "�ٸ���");

		System.out.println(sampleMap.toString());
		
		Object chicken = sampleMap.get("����");
		System.out.println(chicken);
		
		boolean isChicken = sampleMap.containsKey("����");
		boolean isFreshLeg = sampleMap.containsValue("�ٸ���");
		
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
		
		System.out.println("������? : " + equals);
		
	}
	
//	entrySet()�� ����
	static void iteratorUsingForEach(Map map){
		System.out.println("============================================");
        Set<Map.Entry<String, Object>> entries = map.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("============================================");
    }

}
