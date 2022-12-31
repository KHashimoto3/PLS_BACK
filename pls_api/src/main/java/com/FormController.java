package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class FormController {

	@Autowired
	private FormRepository formRepository;
	
	@GetMapping(path="/api/getformlist")
	public @ResponseBody Iterable<Form> getformlist() {
		return formRepository.findAll();
	}
}
