package org.restful.messages.HelloThere.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.restful.messages.HelloThere.database.DatabaseClass;
import org.restful.messages.HelloThere.model.Profile;

public class ProfileService {
private Map<String, Profile> profiles = DatabaseClass.getProfiles();
	
	public ProfileService(){
		profiles.put("pstoyanov", new Profile(1L, "pstoyanov", "Petar", "Stoyanov"));
	}
	
	public List<Profile> getAllProfiles(){
		return new ArrayList<Profile>(profiles.values());
	}
	
	public Profile getProfile(String profileName){
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile){
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile){
		// Tuk ne se filtrira kakto trqbva. Trqbva da se proveri dali syshtestvuva veche takyc profil v Map
		if(profile.getProfileName().isEmpty()){
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile removeProfile(String profileName){
		return profiles.remove(profileName);
	}
}
