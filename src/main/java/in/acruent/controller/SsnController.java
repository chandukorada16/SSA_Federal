package in.acruent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.acruent.data.SsnData;

@RestController
public class SsnController {
	
	@Autowired
	private SsnData ssnData;
	
	@GetMapping("/state/{ssn}")
	public String getStateBySsn(@PathVariable String ssn) {
		return ssnData.getStateBySsn(ssn);
	}


}
