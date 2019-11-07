package br.com.jonata.Iot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
public class IotDevicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(IotDevicesApplication.class, args);
	}

}
