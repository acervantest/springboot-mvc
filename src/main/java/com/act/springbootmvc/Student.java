package com.act.springbootmvc;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.LinkedHashMap;

@Getter
@Setter
public class Student {
    private String firstName;
    @NotNull(message = "can not be empty")
    @Size(min = 1, message = "is required")
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private String[] operatingSystems;

    @Min(value = 1, message = "must be greater than or equal to one")
    @Max(value = 10, message = "must be less than or equal to ten")
    private int freePasses;

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
