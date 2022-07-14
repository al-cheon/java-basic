package basic.java.clasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class BasicJavaClasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicJavaClasicApplication.class, args);
	}

}
