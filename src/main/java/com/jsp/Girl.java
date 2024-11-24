package com.jsp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Girl {
	
	@Id
	private int id;
	private String name;
	private String instaid;
	
	//getters() and setters()
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInstaid() {
		return instaid;
	}
	public void setInstaid(String instaid) {
		this.instaid = instaid;
	}
	
	

}
