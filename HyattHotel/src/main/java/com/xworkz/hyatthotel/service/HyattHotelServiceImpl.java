package com.xworkz.hyatthotel.service;

import java.util.List;

import com.xworkz.hyatthotel.dto.HyattEmployeDto;
import com.xworkz.hyatthotel.repo.HyattHotelRepo;
import com.xworkz.hyatthotel.repo.HyattHotelRepoImpl;

public class HyattHotelServiceImpl implements HyattHotelService {

	HyattHotelRepo repo = new HyattHotelRepoImpl();

	@Override
	public boolean save(HyattEmployeDto dto) {
		if (dto != null) {
			if (dto.getName() != null && dto.getName().length() > 4)
				;
			if (dto.getEmail() != null && dto.getEmail().length() > 10) {
				if (dto.getNumber() != 0 && dto.getNumber() > 100090909) {
					if (dto.getAge() != 0 && dto.getAge() > 20) {
						if (dto.getSalary() != 0 && dto.getSalary() > 5000) {
							System.out.println("The dto's are valid");
							return repo.save(dto);
						}
						System.out.println("Salary added is valid");
						return false;
					}
					System.out.println("The age is not valid");
					return false;
				}
				System.out.println("The given number is not valid");
				return false;
			}
			System.out.println("The given email is not valid");
			return false;
		}
		System.out.println("The dto is not valid");
		return false;
	}

	@Override
	public boolean updateNameById(int id, String name) {
		if (id > 0) {
			if (name != null) {
				System.out.println("Dtos are valid(update)");
				return repo.updateNameById(id, name);
			}
		}
		return false;
	}
	
	@Override
	public boolean deleteById(int id) {
		if(id>0) {
			repo.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public List<HyattEmployeDto> readAll() {
		return repo.readAll();
	}

	@Override
	public HyattEmployeDto findByName(String name) {
		if(name!=null) {
			return repo.findByName(name);			
		}
		return null;
	}

	@Override
	public HyattEmployeDto findById(int id) {
		if(id>0) {
			return repo.findById(id);
		}
		return null;
	}

	

}
