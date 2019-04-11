package com.example.kafka.KafkaDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {
	@Autowired
	private KafkaTemplate<String, String>  kafkaTemplate;
	
	String kafka_topic ="Java-topic";
	
	public void send(String message) {
		kafkaTemplate.send(kafka_topic,message);
	}
	
	
}
