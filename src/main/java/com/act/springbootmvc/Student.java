package com.act.springbootmvc;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashMap;

@Getter
@Setter
public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;

    private LinkedHashMap<String, String> countryOptions;

    public Student(){
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("MX","Mexico");
        countryOptions.put("BRA","Brazil");
        countryOptions.put("FRA","France");
        countryOptions.put("DEU","Germany");
        countryOptions.put("INR","India");
        countryOptions.put("US","United States");
    }
}
