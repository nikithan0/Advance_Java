package com.xworkz.cars.service;

import java.util.List;

import com.xworkz.cars.dto.CarsDto;
import com.xworkz.cars.repository.CarsRepo;
import com.xworkz.cars.repository.CarsRepoImpl;

public class CarsServiceImpl implements CarsService {

	CarsRepo repo = new CarsRepoImpl();

	@Override
	public boolean save(CarsDto dto) {
		if (dto != null) {
			if (dto.getId() > 0) {
				if (dto.getName() != null && dto.getName().length() > 2) {
					if (dto.getSeatingCapacity() > 3) {
						System.out.println("Dto's are valid");
						return repo.save(dto);
					}
					System.out.println("Seat is less");
					return false;
				}
				System.out.println("Name is not valid");
				return false;
			}
			System.out.println("Given id is not valid");
			return false;
		}
		System.out.println("Given dto's are not saved");
		return false;
	}

	@Override
	public CarsDto findById(int id) {
		if(id!=0) {
			return repo.findById(id);
		}
		return null;
	}

	@Override
	public CarsDto findByName(String name) {
		if(name!=null) {
			return repo.findByName(name);
		}
		return null;
	}

	@Override
	public boolean updateById(int id, String name) {
		if(id>0) {
			if(name!=null) {
				return repo.updateById(id, name);
			}
		}
		return false;
	}
	
	@Override
	public boolean updateByNameId(int id, String name, String color) {
		if(id>0) {
			if(name!=null) {
				if(color!=null) {
					return repo.updateByNameId(id,name,color);
				}
			}
		}
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		if(id>0) {
			return repo.deleteById(id);
		}
		return false;
	}


	@Override
	public List<CarsDto> readAll() {
		return repo.readAll();
	}

	
}
