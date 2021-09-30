package com.practice.com.practice.maven.eclipse;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> li=new LinkedList<String>();
li.add("This");
li.add("is");
li.add("example");
li.add(2,"an");
System.out.println(li);
li.add("Program");
System .out.println(li);

li.remove("an");
System.out.println(li);

li.set(2, "the");
System.out.println(li);

for (String Str:li)
	System.out.println(Str+ "");
	
	}

}
