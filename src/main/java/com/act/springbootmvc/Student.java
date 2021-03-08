package com.act.springbootmvc;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;
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

    @NotNull(message = "can not be empty")
    @Min(value = 1, message = "must be greater than or equal to one")
    @Max(value = 10, message = "must be less than or equal to ten")
    private Integer freePasses;

    @NotNull(message = "can not be empty")
    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode;

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
