package com.xworkz.amazon.service;

import java.util.List;

import com.xworkz.amazon.dto.AmazonDto;
import com.xworkz.amazon.repository.AmazonRepo;
import com.xworkz.amazon.repository.AmazonRepoImpl;

public class AmazonServiceImpl implements AmazonService {

	AmazonRepo repo = new AmazonRepoImpl();
	
	@Override
	public boolean save(AmazonDto dto) {
		if(dto!=null) {
			if(dto.getName()!=null && dto.getName().length()>3) {
				if(dto.getAge()>15) {
					if(dto.getEmailAddress()!=null && dto.getEmailAddress().length()>7) {
						if(dto.getLocation()!=null) {
							System.out.println("Dto's are valid and saved");
							return repo.save(dto);
						}
						System.out.println("Dto is not saved");
						return false;
					}
					System.out.println("Email is not valid");
					return false;
				}
				System.out.println("The given age is not valid");
				return false;
			}
			System.out.println("Name is not valid");
			return false;
		}
		System.out.println("Dto is not valid");
		return false;
	}

	@Override
	public AmazonDto findById(int id) {
		if(id>0) {
			return repo.findById(id);
		}
		return null;
	}

	@Override
	public AmazonDto findByName(String name) {
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
	public boolean updateByNameId(int id, String name, String location) {
		if(id>0) {
			if(name!=null) {
				if(location!=null){
					repo.updateByNameId(id, name, location);
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
	public List<AmazonDto> readAll() {	
		return repo.readAll();
	}

}
