package com.xworkz.eventOrganization.service;

import com.xworkz.eventOrganization.dto.EventDto;
import com.xworkz.eventOrganization.repository.EventRepoImpl;
import com.xworkz.eventOrganization.repository.EventRepository;

public class EventServiceImpl implements EventService {
	
	EventRepository repo = new EventRepoImpl();

	public boolean validateAndSave(EventDto dto) {
		if (dto != null) {
			if (dto.getId() != 0 && dto.getId() > 0) {
				if (dto.getConductedBy() != null && dto.getConductedBy().length() > 2) {
					if (dto.getLocation() != null && dto.getLocation().length() > 3) {
						if (dto.getPhoneNumber() != 0 && dto.getPhoneNumber() > 10) {
							if (dto.getEmailId() != null && dto.getEmailId().length() > 6) {
								repo.save(dto);
								System.out.println("The dto is saved");
								return true;
							}
							System.out.println("The is not valid");
							return false;
						}
						System.out.println("The given number is not validate");
						return false;
					}
					System.out.println("Given location is not valid");
					return false;
				}
				System.out.println("Name conduted is not valid");
				return false;
			}
			System.out.println("Id is not valid");
			return false;
		}
		System.out.println("dto is null");
		return false;
	}

	@Override
	public boolean updateById(int expected_peoples) {
		if(expected_peoples!=0) {
			repo.updateById(expected_peoples);
			System.out.println("Expected peoples updated");
			return true;
		}
		return false;
	}

	@Override
	public boolean updateByName(String event_name) {
		if(event_name!=null) {
			System.out.println("Name updated succesfully");
			repo.updateByName(event_name);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateEmail(String emailId) {
		if(emailId!=null) {			
			repo.updateEmail(emailId);
			System.out.println("Email updated");
			return true;
			
		}
		return false;
	}

	@Override
	public boolean updateByDto(EventDto dto, int id) {
		if(dto!=null) {
			if(id>0) {
				repo.updateByDto(dto, id);
				System.out.println("Dto updated");
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updating(String organizedBy, String conduBy, String location, String date, String time) {
		if(organizedBy!=null) {
			if(conduBy!=null) {
				if(location!=null) {
					if(date!=null) {
						if(time!=null) {
							repo.updating(organizedBy, conduBy, location, date, time);
							System.out.println("5 fields updated");
							return true;
						}
						System.out.println("5 fields not updated");
						return false;
					}
				}
			}
		}
		return false;
	}

}
