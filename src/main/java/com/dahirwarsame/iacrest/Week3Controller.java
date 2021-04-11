package com.dahirwarsame.iacrest;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Week3Controller {

    private static final String template = "Welkom, %s!";
    

    @RequestMapping(method = RequestMethod.POST, path ="/welcome")
    public String welcome (@RequestParam(value="name", defaultValue="World") String name) {
        return String.format(template, name);
    }

    @RequestMapping(method = RequestMethod.GET, path ="/current-date")
    public String current_date() {   
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        return dtf.format(now) ;
    }
}
