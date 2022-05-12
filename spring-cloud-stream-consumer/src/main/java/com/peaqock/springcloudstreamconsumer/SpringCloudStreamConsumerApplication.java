package com.peaqock.springcloudstreamconsumer;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Consumer;

@SpringBootApplication
@RequiredArgsConstructor
@RestController
public class SpringCloudStreamConsumerApplication {
	private Logger logger = LoggerFactory.getLogger(SpringCloudStreamConsumerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamConsumerApplication.class, args);
	}


	@Bean
	public Consumer<Message<Book>> newBook() {
		return message -> {
			var book = message.getPayload();
			logger.info("Payload consumed from Kafka: "+book);
		};
	}
}
