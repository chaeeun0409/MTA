package ¹®Á¦_01;

import java.util.ArrayList;

public class test_29 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("ddd");
		a.add("aaa");
		a.add("ccc");
		a.add("bbb");
		a.add("eee");
		
		process(a);
		
		
		}
	public static void process(ArrayList<String> invoices) {
		for(int i = 0; i<invoices.size(); i=i+1 ) {
			String invoice = invoices.get(i);
			invoices.remove(i);
			System.out.println(invoices);
		}
	}
}
