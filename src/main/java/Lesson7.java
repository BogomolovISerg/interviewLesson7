import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class Lesson7{
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Lesson7.class);
        app.setDefaultProperties(Collections.singletonMap("server.servlet.context-path", "/lesson7"));
        app.run(args);
    }
}
