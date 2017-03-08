package evolution.controller;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Future;

import org.apache.http.HttpResponse;
import org.junit.Test;

import evolution.util.Sender;

public class AnyControllerTest {
	@Test
	public void testPartialSummarize() {
		Future<HttpResponse> response = Sender.post("http://localhost:8080/partialSummarize", Arrays.asList("apple", "pear", "apple"));
		Map<String, Integer> map = Sender.getMap(response, String.class, Integer.class);
		System.out.println(map);
	}
}
