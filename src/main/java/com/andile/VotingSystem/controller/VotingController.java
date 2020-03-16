package com.andile.VotingSystem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.andile.VotingSystem.entities.Candidate;
import com.andile.VotingSystem.entities.Citizen;
import com.andile.VotingSystem.repository.CandidateRepo;
import com.andile.VotingSystem.repository.CitizenRepo;

@Controller
public class VotingController {
	 @Autowired
	 CitizenRepo citizenRepo;
	 @Autowired
	 CandidateRepo candidateRepo;
	 
	 @RequestMapping("/")
	 public String getVote() {
		return "vote.html";
		 
	 }
	 @RequestMapping("/doLogin")
	 public String doLogin(@RequestParam String name, Model model) {
		 
		Citizen citizen = citizenRepo.findByName(name);
		if (!citizen.getHasVoted()) {
			List<Candidate> candidates = candidateRepo.findAll();
			model.addAttribute("candidates",candidates);
			return "performVote.html";
		} else {
			return "alreadyVoted.html";
		}
	 }

}
