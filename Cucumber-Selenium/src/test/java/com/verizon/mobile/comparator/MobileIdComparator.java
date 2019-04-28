package com.verizon.mobile.comparator;

import java.util.Comparator;

import com.verizon.mobile.pojo.Mobile;

public class MobileIdComparator implements Comparator<Mobile> {

	public int compare(Mobile m1, Mobile m2) {
		if (m1.getId() == m2.getId())
			return 0;
		else if (m1.getId() > m2.getId())
			return 1;
		else
			return -1;

	}

}