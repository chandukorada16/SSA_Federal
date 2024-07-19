package in.acruent.data;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class SsnData {
	
private final Map<String,String> map=new HashMap<>();
	
	public SsnData() {
		map.put("135158","New Jersey");
		map.put("001003", "Rhode Island");
		map.put("987654", "New York");
		map.put("343434","California");
		map.put("268302", "Ohio");

	}
	public String getStateBySsn(String ssn) {
		
		return map.getOrDefault(ssn, "Not Found");
	}


}
