package org.restful.messages.HelloThere.model;

import java.util.Date;

public class Profile {
	private long id;
	private String profileName;
	private String firstNmae;
	private String lastName;
	private Date created;
	
	public Profile(){
		
	}
	
	

	public Profile(long id, String profileName, String firstNmae,
			String lastName) {
		super();
		this.id = id;
		this.profileName = profileName;
		this.firstNmae = firstNmae;
		this.lastName = lastName;
		this.created = new Date();
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public String getFirstNmae() {
		return firstNmae;
	}

	public void setFirstNmae(String firstNmae) {
		this.firstNmae = firstNmae;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getCreate() {
		return created;
	}

	public void setCreate(Date created) {
		this.created = created;
	}
	
	
}
