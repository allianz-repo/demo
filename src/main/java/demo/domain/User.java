package demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
@Entity
public class User {
	
	public User() {}
	
	public User(String email, String firstname, String surname, int age) {
		
		this.email = email;
		this.surname = surname;
		this.firstName = firstname;
		this.age = age;
	}
	
	@Id
	private String email;
	@NotNull(message="firstname.notnull")
	private String firstName;
	private String surname;
	private int age;
	
	public String getFirstName() {
		
		return firstName;
	}
	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
	}
	public String getSurname() {
		
		return surname;
	}
	public void setSurname(String surname) {
		
		this.surname = surname;
	}
	public int getAge() {
		
		return age;
	}
	public void setAge(int age) {
		
		this.age = age;
	}
	public String getEmail() {
		
		return email;
	}
	public void setEmail(String email) {
		
		this.email = email;
	}
}