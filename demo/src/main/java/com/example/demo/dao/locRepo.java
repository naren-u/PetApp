package com.example.demo.dao;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.locdata;

public interface locRepo extends JpaRepository<locdata, String>
{
  
}