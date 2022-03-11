package com.j.org;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Collection {
	public static void main(String[] args) {
		ArrayList<Object> l = new ArrayList<Object>();
		l.add("Never tell");
		l.add("anyone your plans");
		l.add("show them");
		l.add("your result instead");
		System.out.println("List:"+ l);
		ListIterator<Object> li = l.listIterator();
		System.out.println("****************");
		while (li.hasNext()) {
			Object object = (Object) li.next();
			System.out.println(object);
		}
		System.out.println("****************");
		while (li.hasPrevious()) {
			Object obj = (Object) li.previous();
			System.out.println(obj);
		}
		System.out.println("****************");
		Iterator<Object>i = l.iterator();
		while (i.hasNext()) {
			Object ob = (Object) i.next();
			System.out.println(ob);
			
		}
	}

}
