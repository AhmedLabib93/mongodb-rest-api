package mongodb.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MongodbRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodbRestApiApplication.class, args);
	}

}
