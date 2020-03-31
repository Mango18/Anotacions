package com.example.AnotacionesModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UserProfile {
   @Id
   private Integer id;
   private int age;
   private String gender;
   private String favoriteColor;
   
   
   
   
   
   
   @OneToOne
   private User user;
   
   
   
   
   
   
   
   
   
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getFavoriteColor() {
	return favoriteColor;
}
public void setFavoriteColor(String favoriteColor) {
	this.favoriteColor = favoriteColor;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
   
}
