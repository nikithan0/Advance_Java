package com.xworkz.electronicsproject.util;

import java.util.Comparator;

import com.xworkz.electronicsproject.dto.ElectronicsDto;

public class WarrantyComparator implements Comparator<ElectronicsDto>{

	@Override
	public int compare(ElectronicsDto o1, ElectronicsDto o2) {
		if(o1.getWarranty()<o2.getWarranty()) {
			return 1;
		}else {
		return -1;
		}
	}

}
