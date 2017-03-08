package evolution.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import evolution.service.AnyService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class AnyController {
	@Autowired
	private AnyService anyService;
	
	@PostMapping("/mapReduce")
	public Map<String, Double> mapReduce(@RequestBody List<String> partialData) {
		Map<String, Double> counts = anyService.mapReduce(partialData);
		log.info("The map-reduce result is {}.", counts);
		return counts;
	}
}
