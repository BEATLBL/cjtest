package com.mytest.test;

import java.util.ArrayList;
import java.util.List;

public class TestString {
	public static void main(String[] args) {
		
		// 1. 计算一个字符串中字母出现次数，升序/降序 输出
		
//		String str ="2342asfghgyu56asdasda";
//		
//		TreeMap<String, Integer> resMap = new TreeMap<String, Integer>();
//		for(int i=0; i<str.length();i++){
//			String key = String.valueOf(str.charAt(i));
//			if(!resMap.containsKey(key)){
//				resMap.put(key, 1);
//			}else{
//				int value = resMap.get(key);
//				resMap.put(key, value+1);
//			}
//		}
//		
//		// descending 降序
//		for(String key: resMap.descendingMap().keySet()){
//			System.out.println("key:"+key+",value:"+ resMap.get(key) );
//		}
		
		// 2. 字符类型转译
//		System.out.println(Integer.valueOf('0')+1);  // 49
//		System.out.println(Integer.valueOf("0")+1);  // 1
//		System.out.println(2+'0');
//		
//		int a= 0; char b='0';
//		System.out.println(0+'1');
		
		// 3. 静态模块必须调用静态模块
		
		 //new TestString().test(args);
//		test(args);	 // java.lang.ArrayIndexOutOfBoundsException
		
//		List  l = new ArrayList();
//		System.out.println(l);

	}
	
//	public static void test(String[] arr){
//		System.out.println(arr);
//		System.out.println(arr[1]);
//	}
}
