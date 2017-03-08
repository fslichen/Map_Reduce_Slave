package evolution.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import evolution.util.MapUtil;

@Service
public class AnyService {
	public Map<String, Double> mapReduce(List<String> data) {
		Map<String, Double> counts = new HashMap<>();
		for (String singleData : data) {
			MapUtil.updateCount(singleData, counts);
		}
		return counts;
	}
}
