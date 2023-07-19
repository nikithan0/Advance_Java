package com.xworkz.laptop.service;

import java.util.List;

import com.xworkz.laptop.dto.LaptopDto;
import com.xworkz.laptop.repository.LaptopRepo;
import com.xworkz.laptop.repository.LaptopRepoImpl;

public class LaptopServiceImpl implements LaptopService {

	LaptopRepo repo = new LaptopRepoImpl();

	@Override
	public boolean save(LaptopDto dto) {
		if (dto != null) {
			if (dto.getId() > 0) {
				if (dto.getName() != null && dto.getName().length() >= 2) {
					if (dto.getPrice() > 5000) {
						repo.save(dto);
						System.out.println("The price is valid");

						return true;
					}
					System.out.println("The price is not valid");
					return false;
				}
				System.out.println("The name is not valid give a valid name");
				return false;
			}
			System.out.println("The id is not valid");
			return false;
		}
		System.out.println("The dto is null");
		return false;
	}

	@Override
	public LaptopDto findById(int id) {
		if (id > 0) {
			return repo.findById(id);
		}
		return null;
	}

	@Override
	public List<LaptopDto> readAll() {
		return repo.readAll();
	}

	@Override
	public boolean update(LaptopDto dto) {
		if (dto != null) {
			System.out.println("Dto is valid");
			repo.update(dto);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(LaptopDto dto) {
		if (dto != null) {
			System.out.println("Dto is valid");
			repo.delete(dto);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		if (id > 0) {
			LaptopDto dto = findById(id);
			repo.delete(dto);
			return true;

		}
		return false;
	}

}
