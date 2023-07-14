package com.xworkz.cosmetics.service;

import com.xworkz.cosmetics.dto.CosmeticsDto;

public interface CosmeticsService {
	public boolean save(CosmeticsDto dto);
	public boolean findByFirstName(String firstName);

}
