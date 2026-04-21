package net.aetherealtech.oxygen;

import org.springframework.boot.SpringApplication;

public class TestOxygenApplication {

	public static void main(String[] args) {
		SpringApplication.from(OxygenApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
