package com.andile.VotingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andile.VotingSystem.entities.Citizen;
@Repository
public interface CitizenRepo extends JpaRepository<Citizen, Integer>{

	public Citizen findByName(String name);

}
