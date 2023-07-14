package com.xworkz.cosmetics.repositoy;

import com.xworkz.cosmetics.dto.CosmeticsDto;

public interface CosmeticsRepository {
	
	public boolean save(CosmeticsDto dto);
	
	public boolean findByFirstName(String firstName);

}
