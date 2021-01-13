package com.health.Ehealth.security.payloads;

import java.util.Set;

import com.health.Ehealth.modal.Role;
import com.health.Ehealth.modal.User;

 
public class SignupRequest {

    private User user;
    private Set<String> role;
  
    public SignupRequest() {
    	
    }

	public SignupRequest(User user, Set<String> role) {
		super();
		this.user = user;
		this.role = role;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<String> getRole() {
		return role;
	}

	public void setRole(Set<String> role) {
		this.role = role;
	}
    
}
