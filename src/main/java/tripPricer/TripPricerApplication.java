package tripPricer;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TripPricerApplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		SpringApplication.run(TripPricerApplication.class, args);
	}

}
