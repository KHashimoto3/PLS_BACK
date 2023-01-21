package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value="/api/login", method = {RequestMethod.POST})
	public LoginOutput login(@RequestBody LoginInput lgi) {
		//該当するユーザの情報を取得
		User user = userRepository.findByName(lgi.getName());
		LoginOutput lgo = new LoginOutput("OK!"+user.getName()+"を取得しました！");
		return lgo;
	}
}
