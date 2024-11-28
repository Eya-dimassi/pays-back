package com.eya.pays.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eya.pays.entities.Classification;
import com.eya.pays.repos.ClassificationRepository;

@RestController
@RequestMapping("/api/class")
@CrossOrigin("*")
public class ClassificationRESTController {
	@Autowired
    ClassificationRepository classificationRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Classification> getAllClassifications()
	{
	return classificationRepository.findAll();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Classification getClassificationById(@PathVariable("id") Long id) {
	return classificationRepository.findById(id).get();
	}

}
