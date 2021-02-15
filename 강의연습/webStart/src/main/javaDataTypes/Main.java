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

	private static String[] setStrList 						= {"초코쿠키", "딸기쿠키", "바나나쿠키"};
	private static String[] setMapProducts 					= {"초코", "딸기", "바나나"};
	private static int[] setMapPrice 						= {2000, 3000, 6000};
	private static int[] intListPrive 						= {100, 1000, 10000};
	private static int[] intMapSetMapProducts				= {200, 3000, 40000};
	private static String[] intMapSetMapValue 				= {"200원", "3000원", "40000원"};
	private static int[] intTwoMapSetMapProducts 			= {1, 30, 300};
	private static String[] intTwoMapSetMapValue 			= {"1원", "30원", "300원"};
	private static float[] floatListMapValue 				= {(float)1.2, (float)2.4};
	private static String[] floatMapValue 					= {"일점 이 라 읽습니다.", "이점 사 라 읽습니다."};
	private static float[] floatTwoMapProducts 				= {(float)3.6, (float)4.8};
	private static String[] floatTwoMapValue 				= {"삼점 육 이라 읽습니다.", "사점 팔 이라 읽습니다."};
	private static String[] smoothieListProducts 			= {"초코스무디", "딸기스무디", "레몬무디"};
	private static String[] smoothieMapProducts 			= {"초코스무디", "딸기스무디", "바나나스무디"};
	private static int[] smoothieMapPrive 					= {0, 0, 0};
	private static String[] smoothieAdditionalMapProducts 	= {"포도스무디", "키위스무디"};
	private static int[] smoothieAdditionalMapPrice 		= {0, 0};

	public static void main(String[] args) {

		// List Map add Array Hash AO(getter setter) 다른 리스트다 응용해서 30개 만들기
		
		smoothieMapPrive[0] 			= 2000;
		smoothieMapPrive[1] 			= 3000;
		smoothieMapPrive[2] 			= 6000;
		smoothieAdditionalMapPrice[0] 	= 7000;
		smoothieAdditionalMapPrice[1] 	= 8500;
		
		List<String> strList = new ArrayList<>();
		
		for (int i = 0; i < setStrList.length; i++) {
			strList.add(setStrList[i]);
			
		}
		
		System.out.println(strList);
		
		for (int i = setStrList.length-1; i > 0; i--) {
			
			if (setStrList[i].equals("딸기쿠키")) {
				
				strList.remove(setStrList[i]);
				
			}
		}
		
		System.out.println(strList);
		
		Map<String, Object> map = new HashMap<>();
		
		for (int i = 0; i < setMapProducts.length; i++) {
			
			map.put(setMapProducts[i], setMapPrice[i]);
			
		}
		
		System.out.println(map);
		
		// setMapProducts의 인덱스 값들이 여러값들로 섞여있을시로 가정하여 초코 6000, 바나나 3000, 딸기 2000으로 변경해보겠습니다.
		for (int i = 0; i < setMapProducts.length; i++) {
			
			for (int j = 0; j < setMapPrice.length; j++) {
				
				if (setMapProducts[i].equals("초코")) {
					
					if (setMapPrice[j] == 6000) {
						
						map.put(setMapProducts[i], setMapPrice[j]);
						
					}
				}
				
				else if (setMapProducts[i].equals("딸기")) {
					
					if (setMapPrice[j] == 2000) {
						
						map.put(setMapProducts[i], setMapPrice[j]);
						
					}

				}
				
				else if (setMapProducts[i].equals("바나나")) {
					
					if (setMapPrice[j] == 3000) {
						
						map.put(setMapProducts[i], setMapPrice[j]);
						
					}
					
				}
			}
		}
		
		System.out.println(map);
		
		List<Map<String, Object>> listStrMap = new ArrayList<>();
		
		listStrMap.add(map);
		
		System.out.println(listStrMap);
		
		map.remove("딸기",3000);
		
		System.out.println(listStrMap);
		
		List<Map<Integer, Object>> listIntMap = new ArrayList<>();
		
		List<Integer> intList = new ArrayList<>();

		intListPrive[1] = 500;
		
		for (int i = 0; i < intListPrive.length; i++) {

			intList.add(intListPrive[i]);
			
		}
		
		System.out.println(intList);
		
		intList.remove(0);
		
		Map<Integer, Object> intMap		= new HashMap<>();
		
		Map<Integer, Object> intTwoMap 	= new HashMap<>();
		
		for (int i = 0; i < (intMapSetMapProducts.length); i++) {
			
			intMap.put(intMapSetMapProducts[i], intMapSetMapValue[i]);
			
		}
		
		System.out.println(intMap);
		
		for (int i = 0; i < intTwoMapSetMapProducts.length; i++) {
			
			intTwoMap.put(intTwoMapSetMapProducts[i], intTwoMapSetMapValue[i]);
			
		}
		
		System.out.println(intTwoMap);
		
		listIntMap.add(intMap);
		
		listIntMap.add(intTwoMap);
		
		System.out.println(listIntMap);
		
		List<Float> floatList = new ArrayList<>();
		
		for (int i = 0; i < floatListMapValue.length; i++) {
			
			floatList.add(floatListMapValue[i]);
			
		}
		
		System.out.println(floatList);
		
		Map<Float, Object> floatMap = new HashMap<>();
		
		for (int i = 0; i < floatListMapValue.length; i++) {
			
			floatMap.put(floatListMapValue[i], floatMapValue[i]);
			
		}
		
		System.out.println(floatMap);
		
		Map<Float, Object> floatTwoMap = new HashMap<>();
		
		for (int i = 0; i < floatTwoMapProducts.length; i++) {
			
			floatTwoMap.put(floatTwoMapProducts[i], floatTwoMapValue[i]);
			
		}
		
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
		TestVo cougieType 		= new TestVo();
		TestVo money 			= new TestVo();
		TestVo sosu 			= new TestVo();
		
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
		
		for (int i = 0; i < smoothieListProducts.length; i++) {
			
			smoothieList.add(smoothieListProducts[i]);
			
		}
		
		System.out.println(smoothieList);
		
		// 메뉴개선 : 딸기 스무디 메뉴에서 제외
		for (int i = smoothieListProducts.length-1; i >= 0; i--) {
			
			if (smoothieListProducts[i].equals("딸기스무디")) {
				
				smoothieList.remove(smoothieListProducts[i]);
				
			}
		}
		
		System.out.println(smoothieList);
		
		Map<String, Object> smoothieMap = new HashMap<>();
		
		for (int i = 0; i < smoothieMapProducts.length; i++) {
			
			smoothieMap.put(smoothieMapProducts[i], smoothieMapPrive[i]);
			
		}
		System.out.println(smoothieMap);
		
		// 가격표 개선 : 초코 스무디 제외
		for (int i = smoothieMapProducts.length-1; i >= 0; i--) {
			
			if (smoothieMapProducts[i].equals("초코스무디")) {
				
				if (smoothieMapPrive[i] == 2000) {
					
					smoothieMap.remove(smoothieListProducts[i],smoothieMapPrive[i]);
					
				}
				
				
			}
		}
		System.out.println(smoothieMap);
		
		// 스무디 가격표 리스트화 하기
		List<Map<String, Object>> smoothieListMap = new ArrayList<>();
		
		smoothieListMap.add(smoothieMap);
		
		System.out.println(smoothieListMap);
		
		// 가격표중 포도랑 키위맛 새로운 맵에추가하기
		Map<String, Object> smoothieAdditionalMap = new HashMap<>();
		
		for (int i = 0; i < smoothieAdditionalMapProducts.length; i++) {
			
			smoothieAdditionalMap.put(smoothieAdditionalMapProducts[i], smoothieAdditionalMapPrice[i]);
			
		}
		
		System.out.println(smoothieAdditionalMap);
		
		smoothieListMap.add(smoothieAdditionalMap);
		
		System.out.println(smoothieListMap);
		
		// 초코스무디 4000원으로 가격인상
		for (int i = 0; i < smoothieMapProducts.length; i++) {
			
			for (int j = 0; j < smoothieMapPrive.length; j++) {
				
				if (smoothieMapProducts[i].equals("초코스무디")) {
					
					if (smoothieMapPrive[j] == 2000) {
						
						smoothieMap.remove("초코스무디", smoothieMapPrive[j]);
						smoothieMap.put(smoothieMapProducts[i], 4000);
						
					}
				}
			}
		}
		
		System.out.println(smoothieMap);
		
		System.out.println(smoothieListMap);
		
		// 추가된 맵을 기존 맵에 추가하고 추가된 맵 삭제하기
		for (int i = 0; i < smoothieAdditionalMapProducts.length; i++) {
			
			smoothieMap.put(smoothieAdditionalMapProducts[i], smoothieAdditionalMapPrice[i]);
			
		}
		System.out.println(smoothieListMap);
		
		smoothieListMap.remove(1);
		
		System.out.println(smoothieListMap);
		
	}

}


