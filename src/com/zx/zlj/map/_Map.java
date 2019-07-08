package com.zx.zlj.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _Map {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "zlj");
		map.put(2, "zl");
		map.put(3, "z");
		map.put(4, "z");
		for (Map.Entry<Integer,String> _map : map.entrySet()) {
			System.out.print(_map.getKey()+_map.getValue());
			System.out.println();
		}
		System.out.print(map.keySet()+" ");
		for (int i = 0 ; i < map.size() ; i++) {
			System.out.print(map.get(i)+"^^^^^^");
		}
		for (Object i : map.keySet()) {
			System.out.print(map.get(i)+"@@@@@@");
		}
	}
}
