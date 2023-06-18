package kg.musabaev.kuberdemoimage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class KuberDemoImageApplication {

	public static void main(String[] args) {
		SpringApplication.run(KuberDemoImageApplication.class, args);
	}

	@GetMapping("/hello")
	ResponseEntity<String> sayHello() throws UnknownHostException {
		return ResponseEntity.ok("<h1>Version 2: Hello from the %s!</h1>".formatted(InetAddress.getLocalHost().getHostName()));
	}
}
