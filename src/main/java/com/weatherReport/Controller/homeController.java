package com.weatherReport.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import util.util;

@Controller
public class homeController {

//    @Value("foo.key")
    static String key = "be1dc95aff55a3a50133a2738d7b98b6";


    @RequestMapping(value="/" , method = RequestMethod.GET)
    public String welcomePage(){
        return "home";
    }
    @RequestMapping(value = "/city" , method = RequestMethod.GET , produces = "application/json")
    public String weatherByCity(@RequestParam String city , ModelMap model){
        if(city.length()==0){
            model.put("isError" , true);
            model.put("errorMessage", "Please fill city name!");
            return "home";
        }
        try {
            RestTemplate app = new RestTemplate();
            String uri = "http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid="+key;
            String JSONResponse = app.getForObject(uri , String.class);
            weather w = util.jsonToObj(JSONResponse,weather.class);
            model.put("show",true);
            model.put("temp",String.valueOf(w.getMain().getTemp()).substring(0,4)+" C");
            model.put("pressure",w.getMain().getPressure());
            model.put("humidity",w.getMain().getHumidity());
            model.put("name",w.getName());
            return "home";
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        model.put("isError" , true);
        model.put("errorMessage", "internal Server error!");
        return "home";
    }

    @RequestMapping(value = "/coordinate" , method = RequestMethod.GET , produces = "application/json")
    public String weatherByCoordinate(@RequestParam String lat , @RequestParam String lon ,ModelMap model){
        String errorMessage="Please provide ";
        if(lat.length()==0){
            errorMessage+="Latitude";
        }
        if(lon.length()==0){
            if(errorMessage.length()>15) errorMessage+=" & ";
            errorMessage+=" Longitude";
        }
        if(errorMessage.length()>15){
            model.put("isError",true);
            model.put("errorMessage" , errorMessage+".");
            return "home";
        }
        try {
            RestTemplate app = new RestTemplate();
            String uri = "http://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+lon+"&appid="+key;
            String JSONResponse = app.getForObject(uri , String.class);
            System.out.println(JSONResponse);
            weather w = util.jsonToObj(JSONResponse,weather.class);
            model.put("show",true);
            model.put("temp",String.valueOf(w.getMain().getTemp()).substring(0,4)+" C");
            model.put("pressure",w.getMain().getPressure());
            model.put("humidity",w.getMain().getHumidity());
            model.put("name",w.getName());
            return "home";
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        model.put("isError" , true);
        model.put("errorMessage", "internal Server error!");
        return "home";
    }
}

