package com.example.demo;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

//import com.example.demo.model.petdata;
import com.example.demo.dao.petRepo;

@Controller
public class mycontroller
{

	@Autowired
	petRepo repo;

	@RequestMapping("/home")
	public String home()
	{
		return "index";
	}

	@GetMapping("getPets")
	public String getPets(Model m)
	{
		m.addAttribute("result", repo.findAll());

		return "showPet";
	}

	@GetMapping("getPet")
	public String getPet(@RequestParam int id, Model m)
	{
		m.addAttribute("result", repo.getById(id));

		return "showPet";
	}


}