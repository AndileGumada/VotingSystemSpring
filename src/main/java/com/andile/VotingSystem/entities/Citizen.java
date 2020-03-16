package com.andile.VotingSystem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Table(name = "citizens")
@Entity(name = "citizens")
public class Citizen {
	
	@Id
	@Column(name = "id")
	private Long id;
	@Column(name = "citizen_name")
	private String name;
	private boolean hasVoted;
	
	
	public Citizen() {
		
	}
	public Citizen(Long id, String name,boolean hasVoted ) {
		this.hasVoted = hasVoted;
		this.id = id;
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setHasVoted(boolean hasVoted) {
		this.hasVoted = hasVoted;
	}
	public boolean getHasVoted() {
		
		return hasVoted;
	}
	
}
