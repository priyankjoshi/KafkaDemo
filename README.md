# KafkaDemo
SpringBoot and Kafka Integration : Use spring.initializer to create project.

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


#kafka Server Commands
Getting started with Kafka -

1 - Download kafka from https://kafka.apache.org/downloads and download the Scala 2.12 version
2 - Once the download completes, unzip  and extract the download to a local windows directory.
3 - Goto Kafka folder and start the different components -
	3.1 Start the zookeeper with the following command -.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
	3.2 Start the Kafka Server with the following command - .\bin\windows\kafka-server-start.bat .\config\server.properties
	3.3 Create a new Topic with name priyanks-topic with only one partition and one replication with the following command -
				.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Java-topic
	3.4 Create Producer - Send message to priyanks-topic - .\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic priyanks-topic
	3.5 Create Consumer which listens to the newly created topic - Recieve message from priyanks-topic -
				.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic priyanks-topic --from-beginning
