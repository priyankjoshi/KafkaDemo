/**
 * 
 */
package com.example.kafka.KafkaDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Admin
 *
 */
@RestController
@RequestMapping(value="/kafkaSolution/")
public class ApacheKafkaWebController {
	
	@Autowired
	KafkaSender kafkaSender;
	
	@GetMapping(value = "/producer")
	public String producer(@RequestParam("message") String message) {
		kafkaSender.send(message);
		return "Message was sent to the kafka topic successfully";
	}

}
