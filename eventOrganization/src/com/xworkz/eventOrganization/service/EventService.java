package com.xworkz.eventOrganization.service;

import com.xworkz.eventOrganization.dto.EventDto;

public interface EventService {

	public boolean validateAndSave(EventDto dto);

	public boolean updateById(int expected_peoples);

	public boolean updateByName(String event_name);

	public boolean updateEmail(String emailId);

	public boolean updateByDto(EventDto dto, int id);

	public boolean updating(String organizedBy, String conduBy, String location, String date, String time);
}
