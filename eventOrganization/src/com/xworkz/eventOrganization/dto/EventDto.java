package com.xworkz.eventOrganization.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class EventDto {
	
	private int id;
	private String event_name;
	private String organizedBy;
	private String conductedBy;
	private String location;
	private String date;
	private String time;
	private String special_guest;
	private int expected_peoples;
	private int total_peoples;
	private int eventPrice;
	private String emailId;
	private long phoneNumber;
	private int totalEvents;
	private String duration;

}
