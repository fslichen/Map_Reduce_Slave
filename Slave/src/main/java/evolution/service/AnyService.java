package evolution.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import evolution.util.MapUtil;

@Service
public class AnyService {
	public Map<String, Double> partialSummarize(List<String> partialData) {
		Map<String, Double> partialSummary = new HashMap<>();
		for (String singleData : partialData) {
			MapUtil.updateCount(singleData, partialSummary);
		}
		return partialSummary;
	}
}
