package mallsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MallSearchApplication {
    public static void main(String[] args) {
        System.out.println("Mall Search is running...");
        SpringApplication.run(MallSearchApplication.class, args);
        System.out.println("Mall Search is terminated...");
    }
}
