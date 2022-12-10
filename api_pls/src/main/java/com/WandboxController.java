package com;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@CrossOrigin
public class WandboxController {
	@RequestMapping(value="/api/execcode", method = {RequestMethod.POST})
	public WandboxOutput execcode(@RequestBody WandboxInput wdin) {
		String url = "https://wandbox.org/api/compile.json";
		RestTemplate restTemplate = new RestTemplate();
		
		RequestEntity<WandboxInput> requestEntity = RequestEntity.post(url).body(wdin);
		ResponseEntity<WandboxOutput> response = restTemplate.exchange(requestEntity, WandboxOutput.class);	
		WandboxOutput data = response.getBody();
		return data;
	}
}
