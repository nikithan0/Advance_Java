package com.xworkz.twitter.service;

import java.util.List;

import com.xworkz.twitter.dto.TwitterDto;
import com.xworkz.twitter.repository.TwitterRepo;
import com.xworkz.twitter.repository.TwitterRepoImpl;

public class TwitterServiceImpl implements TwitterService {

	TwitterRepo repo = new TwitterRepoImpl();

	@Override
	public boolean save(TwitterDto dto) {
		if (dto != null) {
			if (dto.getName() != null & dto.getName().length() > 3) {
				if (dto.getEmail() != null & dto.getEmail().length() > 6) {
					if (dto.getPhoneNumber() != 0 & dto.getPhoneNumber() > 10) {
						if (dto.getAge() != 0 & dto.getAge() > 15) {
							if (dto.getDob() != null) {
								if (dto.getGender() != null) {
									System.out.println("Dto's are valid");
									repo.save(dto);
									return false;
								}
								System.out.println("The gender is null");
								return false;
							}
							System.out.println("The date of birth is null");
							return false;
						}
						System.out.println("The age is null and less than 15");
						return false;
					}
					System.out.println("The phone number is not valid, give valid phone number");
					return false;
				}
				System.out.println("Email is not valid , give a valid email");
				return false;
			}
			System.out.println("The name is not valid");
			return false;
		}
		System.out.println("The dto is not valid");
		return false;
	}

	@Override
	public TwitterDto findByName(String name) {
		if (name != null) {
			TwitterDto find = repo.findByName(name);
			System.out.println("Name is valid");
			return find;
		}

		return null;
	}

	@Override
	public TwitterDto updateAgeByName(String name, int age) {
		if (name != null) {
			if (age != 0) {
				TwitterDto update = repo.updateAgeByName(name, age);
				System.out.println("Dto is valid");
				return update;
			}
		}
		return null;
	}

	@Override
	public TwitterDto updateByName(String name, String email, int age) {
		if(name!=null) {
			if(email!=null) {
				if(age!=0) {
					TwitterDto update = repo.updateByName(name, email, age);
					System.out.println("Dtos are valid");
					return update;
				}
			}
		}
		
		return null;
	}

	@Override
	public List<TwitterDto> readAll() {
		return repo.readAll();
		
	}

}
