package com.act.springbootmvc;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.LinkedHashMap;

@Getter
@Setter
public class Student {
    private String firstName;
    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private String[] operatingSystems;

    private LinkedHashMap<String, String> countryOptions;

    public Student(){
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("MX","Mexico");
        countryOptions.put("CAN","Canada");
        countryOptions.put("BRA","Brazil");
        countryOptions.put("FRA","France");
        countryOptions.put("DEU","Germany");
        countryOptions.put("INR","India");
        countryOptions.put("US","United States");
    }
}
