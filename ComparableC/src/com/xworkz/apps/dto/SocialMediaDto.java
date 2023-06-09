package com.xworkz.apps.dto;

public class SocialMediaDto implements Comparable<SocialMediaDto> {

	private String name;
	private String founder;
	private int launchYear;
	private float ratings;
	
	public SocialMediaDto() {
		super();
	}

	public SocialMediaDto(String name, String founder, int launchYear, float ratings) {
		super();
		this.name = name;
		this.founder = founder;
		this.launchYear = launchYear;
		this.ratings = ratings;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public int getLaunchYear() {
		return launchYear;
	}

	public void setLaunchYear(int launchYear) {
		this.launchYear = launchYear;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "SocialMediaDto [name=" + name + ", founder=" + founder + ", launchYear=" + launchYear + ", ratings="
				+ ratings + "]";
	}

	@Override
	public int compareTo(SocialMediaDto a) {
		if(launchYear>a.getLaunchYear()) {
			return 1;
		}
		else {
		return -1;
		}
	};
	
	
	
	
	

}
