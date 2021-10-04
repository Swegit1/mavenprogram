package com.practice.com.practice.maven.eclipse;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class hashmappractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
ht.put(10, "java");
ht.put(10, "C");
ht.put(20, "C**");
ht.put(35,"vb");

System.out.println("Hashtable Example");
for (Map.Entry m:ht.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());
	
	
}
HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(40,"spoo");
hm.put(20, "Smri");
hm.put(10, "thi");
hm.put(30, "ya");
System.out.println("Hashmap Example");
for(Map.Entry e:hm.entrySet()) {
	System.out.println(e.getKey()+""+e.getValue());
	
}
	}

}
