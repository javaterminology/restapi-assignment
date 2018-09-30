package com.singtel.restapi;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value="/api")
public class RestApiController {
	
	Map<String,String> map;
	
	@PostConstruct
	public void initializeMap(){
		map = new HashMap<String,String>();
		map.put("Danish", "kykyliky");
		map.put("Dutch", "kukeleku");
		map.put("Finnish", "kukko kiekuu");
		map.put("French", "cocorico");
		map.put("German", "kikeriki");
		map.put("Greek", "kikiriki");
		map.put("Hebrew", "coo-koo-ri-koo");
		map.put("Hungarian", "kukuriku");
		map.put("Italian", "chicchirichi");
		map.put("Japanese", "ko-ke-kok-ko-o");
		map.put("Portuguese", "cucurucu");
		map.put("Russian", "kukareku");
		map.put("Swedish", "kuckeliku");
		map.put("Turkish", "kuk-kurri-kuuu");
		map.put("Urdu", "kuklooku");
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/soundtype")
	@ResponseBody
    public String getSound(@RequestParam("language") String language) {
        try {
           return map.get(language);
        } catch (Exception e) {
        	e.printStackTrace();
        }
        return "";
    }

}
