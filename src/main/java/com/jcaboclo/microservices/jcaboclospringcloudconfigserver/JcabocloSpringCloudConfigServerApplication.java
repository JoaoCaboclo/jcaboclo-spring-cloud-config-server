package com.jcaboclo.microservices.jcaboclospringcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class JcabocloSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JcabocloSpringCloudConfigServerApplication.class, args);
	}

}
