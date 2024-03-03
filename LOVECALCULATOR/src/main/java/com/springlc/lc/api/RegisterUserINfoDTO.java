package com.springlc.lc.api;

import java.util.Arrays;

public class RegisterUserINfoDTO {
	private String name="varun";
	private String userName="varun Kumar";
	private char[] password;
	private String country;
	private String[] hobbies;
	private String gender;
	
	

	private CommunicationDTO communicationdto;
	
	
 	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public RegisterUserINfoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public CommunicationDTO getCommunicationdto() {
		return communicationdto;
	}

	public void setCommunicationdto(CommunicationDTO communicationdto) {
		this.communicationdto = communicationdto;
	}

	@Override
	public String toString() {
		return "RegisterUserINfoDTO [name=" + name + ", userName=" + userName + ", password="
				+ Arrays.toString(password) + ", country=" + country + ", hobbies=" + Arrays.toString(hobbies)
				+ ", gender=" + gender + "]";
	}

	
	

	
	
	
	

}
