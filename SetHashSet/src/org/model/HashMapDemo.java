package org.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;



public class HashMapDemo {
public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<String>();
	HashMap<Integer,String> hm=new HashMap<>();
	TreeMap<Integer,String> tm=new TreeMap<>();
	hm.put(1, "AAA");
	hm.put(3, "CCC");
	hm.put(2, "BBB");
	
	System.out.println(hm);
	
	hm.put(3, "DDD");
	
	System.out.println(hm);
	System.out.println();
	tm.put(1, "AAA");
	tm.put(3, "CCC");
	tm.put(2, "BBB");
	
	System.out.println(tm);
	tm.put(2, "DDD");
	System.out.println(tm);
	
	Set <Integer>keys=hm.keySet();
	Iterator<Integer> iterator=keys.iterator();
	while(iterator.hasNext()) {
		Integer k=iterator.next();
		list.add(hm.get(k));
		System.out.println(k+" : "+hm.get(k));//iterator interface with HashMap
	}
	System.out.println("From the LinkedList"+list);
	HashMap<String,Integer> hm1=new HashMap<String,Integer>();//now the key is String
	hm1.put( "Java",3);
	hm1.put( "C++",5);
	hm1.put( "Ruby",4);
	
	System.out.println(hm1);
	
	
}
}
