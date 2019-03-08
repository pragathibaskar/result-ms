package com.cg.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.db.IResult;
import com.cg.modal.Result;



@RestController
public class controller {
	@Autowired
	private IResult res;
	
	@GetMapping("/")
	String info() {
		return "simple microservice";
	}
	
	@GetMapping("/{id}")
	   Optional<Result> getById(@PathVariable("id") Long id)
	   {
		return res.findById(id);
		   
	   }
	@GetMapping("/get")
	   List<Result> getDetails()
	   {
		return  res.findAll();
		   
	   }
	@PostMapping("/post")
	Result recieve(@RequestBody Result s)
	{
	  res.saveAndFlush(s);
	  return s;
		
	}
	

	
}
