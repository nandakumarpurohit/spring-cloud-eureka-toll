package eureka.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class DashboardController {
	
	@RequestMapping("/dashboard")
	public String GetTollRate(@RequestParam int stationId, Model m) {
		
		RestTemplate rest = new RestTemplate();
		TollRate tr = rest.getForObject("http://localhost:8085/tollrate/" + stationId, TollRate.class);
		System.out.println("stationId: " + stationId);
		m.addAttribute("rate", tr.getCurrentRate());
		return "dashboard";
	}
}
