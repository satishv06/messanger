package org.learning.ws.messanger.model;

import java.util.Date;

public class Profile {

	private long id;
	private String firstName;
	private String lastName;
	private String profileName;
	private Date created;
	
	
	public Profile(ProfileBuilder builder) {
		super();
		this.id = builder.id;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.profileName = builder.profileName;
		this.created = builder.created;
	}
			
	public long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getProfileName() {
		return profileName;
	}

	public Date getCreated() {
		return created;
	}

	public static class ProfileBuilder{
		private long id;
		private String firstName;
		private String lastName;
		private String profileName;
		private Date created;
		
		private ProfileBuilder(long id, String profileName) {
			this.id = id;
			this.profileName = profileName;
		}
		
		public ProfileBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public ProfileBuilder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public ProfileBuilder created(Date created) {
			this.created = created;
			return this;
		}
		public Profile build() {
			return new Profile(this);
		}
	}
}
