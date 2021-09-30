package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx2 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap();// k key v value의 데이터 타입

		// 요소 추가 : .put 키 값
		map.put("id_0123", "홍길동");
		map.put("id_0124", "김길동");
		map.put("id_0125", "최길동");
		map.put("id_0126", "박길동");

		// 키 값만 모두 가져오기
		Set<String> key = map.keySet();

		// List,Set,Map 에 담겨진 데이터들을 표준화된 방법으로 가져올 수 있도록 제공
		Iterator<String> iter = key.iterator();

		while (iter.hasNext()) {
//			System.out.println(iter.next());
			String userID = iter.next();
			String value = map.get(userID);
			System.out.println(userID + " : " + value);
		}

		System.out.println();

		// Map.Entry 객체 사용
		Set<Entry<String, String>> entrySet = map.entrySet();
		Iterator<Entry<String, String>> iter2 = entrySet.iterator();

		while (iter2.hasNext()) {
			Entry<String, String> entry = iter2.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
