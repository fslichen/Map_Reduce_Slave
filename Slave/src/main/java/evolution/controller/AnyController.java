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
	
	@PostMapping("/partialSummarize")
	public Map<String, Double> partialSummarize(@RequestBody List<String> partialData) {
		Map<String, Double> dataCount = anyService.partialSummarize(partialData);
		log.info("The data count is {}.", dataCount);
		return dataCount;
	}
}
