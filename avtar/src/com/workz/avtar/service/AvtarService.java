package com.workz.avtar.service;

import com.workz.avtar.dto.AvtarDto;

public interface AvtarService {
	
	public boolean validateAndSave(AvtarDto dto);
	public boolean update(AvtarDto dto, int id);

}
