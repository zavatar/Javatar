package spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * App
 * Created by Meng on 2015/6/1.
 */
@Slf4j
@SpringBootApplication
@EnableScheduling
public class App {

	public static void main(String[] args) {
		log.info("SpringApplication Start Running ...");
		SpringApplication.run(App.class, args);
	}

}
