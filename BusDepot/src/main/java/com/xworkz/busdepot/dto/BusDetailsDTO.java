package com.xworkz.busdepot.dto;


import lombok.*;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.NamedQuery;

@Data

public class BusDetailsDTO {
    private String personName;
    private String personEmail;
    private long personPhoneNumber;
    private int personAge;
    private String personCity;
    private String personState;

}
