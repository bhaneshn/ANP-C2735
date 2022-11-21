package org.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

public class A {
	
	public static void main(String[] args)

	{

	List list1 = new ArrayList ( );

	List <Object> list2 = list1;

	list1.add(10);

	list1.add(11);

	list1.add("mona") ;

	list1.add(true);

	System.out.println(list1);

	System.out.println(list2);

	}

		}
