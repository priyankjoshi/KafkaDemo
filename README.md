# KafkaDemo
SpringBoot and Kafka Integration

#Gradle Information
plugins {
	id 'org.springframework.boot' version '2.1.4.RELEASE'
	id 'java'
}

apply plugin: 'io.spring.dependency-management'

group = 'com.example.kafka'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '1.8'

repositories {
	mavenCentral()
}

dependencies {
	implementation 'org.springframework.boot:spring-boot-starter-web'
	implementation 'org.springframework.boot:spring-boot-starter'
	implementation 'org.springframework.kafka:spring-kafka'
	testImplementation 'org.springframework.boot:spring-boot-starter-test'
	testImplementation 'org.springframework.kafka:spring-kafka-test'
}


#application.properties
server.port:9090

