package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// HashMap 클래스의 map 객체 생성
		Map<String, Integer> map = new HashMap<>();
		
		// 자료 추가
		map.put("네이버", 400000);
		map.put("카카오", 150000);
		map.put("앤씨소프트", 600000);
		map.put("네이버", 450000);
		
		// 총 객체수
		System.out.println("총 객체수 : " + map.size());
		
		// 객체 출력
		System.out.println(map);
		
		// 특정한 1개 검색 - key를 통해서 value를 가져옴
		System.out.println("카카오 : " + map.get("카카오"));
		
		// 전체 출력
//		Set<String> keySet = map.keySet();
//		Iterator<String> ir = keySet.iterator();
		
		Iterator<String> ir = map.keySet().iterator();
		
		while(ir.hasNext())
		{
			String key = ir.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
	}

}
