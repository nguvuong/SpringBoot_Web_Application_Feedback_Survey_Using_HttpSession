package ca.sheridan.nguvuong.model;

import java.io.Serializable;

public class Participant implements Serializable {
	private String firstName;
	private String lastName;
	public Participant(){ }
	public String getFirstName() { return this.firstName; }
	public void setFirstName(String fn) {this.firstName = fn;}
	public String getLastName() {return this.lastName;}
	public void setLastName(String ln) { this.lastName = ln;}
	@Override
	public String toString(){ return (this.firstName + " " + this.lastName);}
}