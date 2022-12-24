package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MainController {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(path="/api/demo")
	public OutMessage hello() {
		OutMessage omsg = new OutMessage("動作しています！");
		return omsg;
	}
	
	@RequestMapping(value="/api/add", method = {RequestMethod.POST})
	public OutMessage addNewUser (@RequestBody AddData ad) {
		User n = new User();
		n.setName(ad.getName());
		n.setEnail(ad.getEmail());
		userRepository.save(n);
		OutMessage omsg = new OutMessage("保存しました！");
		return omsg;
	}
	
	@GetMapping(path="/api/getall")
	public @ResponseBody Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}
}
