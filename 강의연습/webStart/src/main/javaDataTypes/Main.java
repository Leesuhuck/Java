package javaDataTypes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
*/
public class Main {

	public static void main(String[] args) {

		// List Map add Array Hash AO(getter setter) 다른 리스트다 응용해서 30개 만들기
		List<String> strList = new ArrayList<>();
		strList.add("초코쿠키");
		strList.add("딸기쿠키");
		strList.add("바나나쿠키");
		System.out.println(strList);
		
		strList.remove("딸기쿠키");
		System.out.println(strList);
		Map<String, Object> map = new HashMap<>();
		map.put("초코", 2000);
		map.put("딸기", 3000);
		map.put("바나나", 6000);
		System.out.println(map);
		
		List<Map<String, Object>> listStrMap = new ArrayList<>();
		
		listStrMap.add(map);
		System.out.println(listStrMap);
		
		map.remove("딸기",3000);
		System.out.println(listStrMap);
		
		List<Map<Integer, Object>> listIntMap = new ArrayList<>();
		
		List<Integer> intList = new ArrayList<>();
		
		intList.add(100);
		intList.add(1000);
		intList.add(10000);
		System.out.println(intList);
		
		intList.remove(0);
		intList.add(500);
		System.out.println(intList);
		
		Map<Integer, Object> intMap = new HashMap<>();
		
		Map<Integer, Object> intTwoMap = new HashMap<>();
		
		intMap.put(100, "100원");
		intMap.put(1000, "1000원");
		intMap.put(10000, "10000원");
		System.out.println(intMap);
		
		intTwoMap.put(1, "1원");
		intTwoMap.put(30, "30원");
		intTwoMap.put(300, "300원");
		System.out.println(intTwoMap);
		
		listIntMap.add(intMap);
		listIntMap.add(intTwoMap);
		System.out.println(listIntMap);
		
		List<Float> floatList = new ArrayList<>();
		floatList.add((float) 1.2);
		floatList.add((float) 2.4);
		System.out.println(floatList);
		
		Map<Float, Object> floatMap = new HashMap<>();
		floatMap.put((float) 1.2, "일점 이 라 읽습니다.");
		floatMap.put((float) 2.4, "이점 사 라 읽습니다.");
		System.out.println(floatMap);
		
		Map<Float, Object> floatTwoMap = new HashMap<>();
		floatTwoMap.put((float) 3.6, "삼점 육 이라 읽습니다.");
		floatTwoMap.put((float) 4.8, "사점 팔 이라 읽습니다.");
		System.out.println(floatTwoMap);
		
		List<Map<Float, Object>> listFloatMap = new ArrayList<>();
		
		listFloatMap.add(floatMap);
		listFloatMap.add(floatTwoMap);
		System.out.println(listFloatMap);
		
		List list = new ArrayList();
		list.add("Korea");
		list.add(20000);
		list.add(5.4);
		System.out.println(list);
		
		List<TestVo> listTestVo = new ArrayList<>();
		TestVo cougieType = new TestVo();
		TestVo money = new TestVo();
		TestVo sosu = new TestVo();
		
		cougieType.setCookie("초코맛쿠키");
		money.setPrice(5000);
		sosu.setMinority(7.4);
		listTestVo.add(cougieType);
		listTestVo.add(money);
		listTestVo.add(sosu);
		System.out.println(listTestVo);
		listTestVo.remove(1);
		System.out.println(listTestVo);
		
		List<String> smoothieList = new ArrayList<>();
		smoothieList.add("초코스무디");
		smoothieList.add("딸기스무디");
		smoothieList.add("바나나스무디");
		System.out.println(smoothieList);
		
		// 메뉴개선 : 딸기 스무디 메뉴에서 제외
		strList.remove("딸기스무디");
		System.out.println(smoothieList);
		
		Map<String, Object> smoothieMap = new HashMap<>();
		smoothieMap.put("초코스무디", 2000);
		smoothieMap.put("딸기스무디", 3000);
		smoothieMap.put("바나나스무디", 6000);
		System.out.println(smoothieMap);
		
		// 가격표 개선 : 딸기 스무디 제외
		smoothieMap.remove("딸기스무디", 3000);
		System.out.println(smoothieMap);
		
		// 스무디 가격표 리스트화 하기
		List<Map<String, Object>> smoothieListMap = new ArrayList<>();
		smoothieListMap.add(smoothieMap);
		System.out.println(smoothieListMap);
		
		// 가격표중 포도랑 키위맛 새로운 맵에추가하기
		Map<String, Object> smoothieAdditionalMap = new HashMap<>();
		smoothieAdditionalMap.put("포도스무디", 7000);
		smoothieAdditionalMap.put("키위스무디", 8500);
		System.out.println(smoothieAdditionalMap);
		
		smoothieListMap.add(smoothieAdditionalMap);
		System.out.println(smoothieListMap);
		
		// 초코스무디 4000원으로 가격인상
		smoothieMap.remove("초코스무디", 2000);
		System.out.println(smoothieMap);
		smoothieMap.put("초코스무디", 4000);
		System.out.println(smoothieMap);
		System.out.println(smoothieListMap);
		
		// 추가된 맵을 기존 맵에 추가하고 추가된 맵 삭제하기
		smoothieMap.put("포도스무디", 7000);
		smoothieMap.put("키위스무디", 8500);
		System.out.println(smoothieMap);
		smoothieListMap.remove(1);
		System.out.println(smoothieListMap);
		
	}

}

