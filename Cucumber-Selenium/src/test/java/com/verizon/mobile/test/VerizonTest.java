package com.verizon.mobile.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.verizon.mobile.comparator.MobileIdComparator;
import com.verizon.mobile.comparator.MobileNameComparator;
import com.verizon.mobile.pojo.Mobile;

public class VerizonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create an object for each mobile

		Mobile iphone3 = new Mobile(101, "Iphone", "Texas", 500);
		Mobile iphone4 = new Mobile(111, "Iphone", "New Jercy", 200);
		Mobile iphone5 = new Mobile(121, "Iphone", "Atlanta", 900);
		Mobile samsung = new Mobile(222, "Samsung", "Newyork", 100);
		Mobile android = new Mobile(333, "Android", "California", 600);
		Mobile tablet = new Mobile(444, "Tablet", "North Carolina", 700);

		// Add to list for each mobile
		List<Mobile> mobiles = new ArrayList<Mobile>();

		mobiles.add(tablet);
		mobiles.add(iphone5);
		mobiles.add(iphone4);
		mobiles.add(iphone3);
		mobiles.add(android);
		mobiles.add(samsung);
		mobiles.add(samsung);
		mobiles.add(samsung);

		// To print the mobile names by using for each loop

		for (Mobile mobile : mobiles) {
			System.out.println(mobile);
		}

		// Sorting by iD
		Collections.sort(mobiles, new MobileIdComparator());

		System.out.println("Sorting by Id: " + mobiles);

		// Sorting by Name
		Collections.sort(mobiles, new MobileNameComparator());

		System.out.println("Sorting by Names: " + mobiles);
		
		// Print the names Samsung devices
		for (Mobile mobile : mobiles) {
			
			if(mobile.getName() == "Samsung")
			System.out.println(mobile);
		}
		
		// To Avoid the duplicate in the list
		Set<Mobile> mobileset = new HashSet<Mobile>();
		
		mobileset.add(tablet);
		mobileset.add(iphone5);
		mobileset.add(iphone4);
		mobileset.add(iphone3);
		mobileset.add(android);
		mobileset.add(samsung);
		mobileset.add(samsung);
		mobileset.add(samsung);
		
		System.out.println("++++ To Avoid the duplicate using the set ++++++");
		
		for (Mobile mobile : mobileset) {
			System.out.println(mobile);
		}
		
		Map<String, List<Mobile>> mobilemap = new HashMap<String, List<Mobile>>();
		
	//	mobilemap.put(1, "mobiles");
		
		System.out.println("000000000000000000"+mobiles); 
		
		
	}

}
