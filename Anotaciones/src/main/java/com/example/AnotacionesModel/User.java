package com.example.AnotacionesModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {
   @Id
   private Integer id;
   private String email;
   private String name;
   private String password;
   
   
   
   
   
   
   
   @OneToOne(mappedBy="user")
   private UserProfile profile;
   
   
   

   
   
   
   
   
   
   
   
   
   
   
   
   
   
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public UserProfile getProfile() {
	return profile;
}
public void setProfile(UserProfile profile) {
	this.profile = profile;
}
}