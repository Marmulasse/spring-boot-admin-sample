package com.marmulasse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping(path = "/sample")
	public String get() {
		return "coucou";
	}
}
