package com.raju.it;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Book {
	@Id
	private int BookId;
	private String Bookname;
	private double bookPrice;

}
