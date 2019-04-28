package com.verizon.mobile.comparator;

import java.util.Comparator;

import com.verizon.mobile.pojo.Mobile;

public class MobileNameComparator implements Comparator<Mobile> {

	public int compare(Mobile m1, Mobile m2) {
		// TODO Auto-generated method stub
		
		return m1.getName().compareTo(m2.getName());
	}

}
