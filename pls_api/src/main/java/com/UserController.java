package com;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {
	@RequestMapping(value="/api/login", method = {RequestMethod.POST})
	public LoginOutput login(@RequestBody LoginInput lgi) {
		LoginOutput lgo = new LoginOutput("OK!");
		return lgo;
	}
}
