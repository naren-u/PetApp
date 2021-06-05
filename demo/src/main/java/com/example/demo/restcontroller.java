package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.petdata;
import com.example.demo.dao.petRepo;

import com.example.demo.model.locdata;
import com.example.demo.dao.locRepo;


import java.util.List;

@RestController
public class restcontroller 
{
    @Autowired
    petRepo repo;
    @Autowired
    locRepo repo1;

    @GetMapping ("getPetsdata")
    public List<petdata> getPetsdata()
    {
        List<petdata> pet = repo.findAll();
        return pet;
    }

    @GetMapping ("getPetdetails/{id}")
    public petdata getPetdetails(@PathVariable("id") int id)
    {
        petdata petDetails = repo.findById(id).orElse(new petdata(0," "," "," "," "," "));
        return petDetails;
    }

    @PostMapping("locdata")
    public locdata addloc(locdata loc)
    {
        System.out.println(loc);
        repo1.save(loc);
        return loc;
    }
}
