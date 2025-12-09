package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Teacher;
import com.example.demo.service.TeacherService;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class TeacherController {
	
	@Autowired
	private TeacherService ts;
	
	@PostMapping("add")
	public void add(@RequestBody Teacher t) {
		//TODO: process POST request
		
		ts.add(t);
	}
	
	@GetMapping("display")
	public List<Teacher> diplay() {
		return ts.display();
	}
	
	@DeleteMapping("delete={id}")
	public void delete(@PathVariable Integer id) {
		ts.delete(id);
		
	}
	
	@PutMapping("update/{id}")
	public void update (@PathVariable Integer id, @RequestBody Teacher t) {
		//TODO: process PUT request
		
		ts.update(t, id);
	}
	
	
	

}
