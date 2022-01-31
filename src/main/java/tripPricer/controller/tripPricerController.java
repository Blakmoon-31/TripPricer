package tripPricer.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tripPricer.Provider;
import tripPricer.TripPricer;

@RestController
public class tripPricerController {

	private TripPricer tripPricer = new TripPricer();

	@GetMapping("/providers")
	public List<Provider> getTripDeals(@RequestParam String apiKey, @RequestParam UUID attraction,
			@RequestParam int adults, @RequestParam int children, @RequestParam int duration,
			@RequestParam int cumulatativeRewardPoints) {

		List<Provider> providers = tripPricer.getPrice(apiKey, attraction, adults, children, duration,
				cumulatativeRewardPoints);

		return providers;
	}

}
