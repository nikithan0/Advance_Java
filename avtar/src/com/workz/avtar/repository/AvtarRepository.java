package com.workz.avtar.repository;

import com.workz.avtar.dto.AvtarDto;

public interface AvtarRepository {
	
	public boolean save(AvtarDto dto);
	
	public boolean update(AvtarDto dto, int id);

}
