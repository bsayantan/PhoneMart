package com.example.assignment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
//@AllArgsConstructor
@NoArgsConstructor
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String phoneId;
	private String phoneName;
	private int price;
	private double phoneRating;
	
	
	


	@Override
	public String toString() {
		return "Phone [id=" + id + ", phoneId=" + phoneId + ", phoneName=" + phoneName + ", price=" + price
				+ ", phoneRating=" + phoneRating + "]";
	}
	


}
