package com.andile.VotingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andile.VotingSystem.entities.Candidate;

@Repository
public interface CandidateRepo extends JpaRepository<Candidate, Integer>{

}
