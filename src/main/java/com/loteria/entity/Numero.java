package com.loteria.entity;
import java.util.Date;
import java.util.TreeSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany; 


@Entity
public class Numero  {
    
@Id
@GeneratedValue 
private Long id;
private TreeSet<Integer>  random;
private String email;
private Date data  ; 


public Long getId() {
	return id;
}
public Date getData() {
	return data;
}
public void setData(Date data) {
	this.data = data;
}
public void setId(Long id) {
	this.id = id;
}
public TreeSet<Integer> getRandom() {
	return random;
}
public void setRandom(TreeSet<Integer> random) {
	this.random = random;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}