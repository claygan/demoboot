package com.quest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class DemobootApplication  implements EmbeddedServletContainerCustomizer {
	@Autowired
	private Environment env;
	public static void main(String[] args) {
		SpringApplication.run(DemobootApplication.class, args);
	}
	@Override
	public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
		configurableEmbeddedServletContainer.setPort(Integer.parseInt(env.getProperty("port")));
	}
}
