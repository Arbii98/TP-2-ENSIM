package POO.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import POO.Model.Geo;
import POO.Model.Meteo;

@Controller
public class MeteoController {
	
	@PostMapping ("/meteo")
	public String getMeteo ( @RequestParam("address") String adresse, Model model )
	{
		//Verifier la bonne réception de l'adresse
		System.out.println(adresse);
		
		//Appeler l'API geolocalisation
		String uri = "https://api-adresse.data.gouv.fr/search/?q="+adresse;
		RestTemplate restTemplate = new RestTemplate();
		Geo result = restTemplate.getForObject(uri, Geo.class);
		System.out.println("RESULT GEO :"+result.toString());
		
		//Appeler l'API meteo
		String insee = result.features.get(0).properties.citycode;
		String urimeteo = "https://api.meteo-concept.com/api/forecast/daily?token=c211cedd38c0c4434e5fe0291f3517c1b8cd414477c4ae218e14b99f2fc91011&insee="+insee;
		Meteo resultMeteo = restTemplate.getForObject(urimeteo, Meteo.class);
		System.out.println("RESULT FORECAST : "+resultMeteo.toString());
		
		model.addAttribute("GPS",result.toString());
		model.addAttribute("Meteo",resultMeteo.toString());
		return "meteo";
	}

}
