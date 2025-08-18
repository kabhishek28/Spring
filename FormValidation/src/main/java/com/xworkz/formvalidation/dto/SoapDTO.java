package com.xworkz.formvalidation.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class SoapDTO {

    @NotNull
    @Size(min =3,max = 10,message = "soapBrand name should be b/t 3 to 10")
    private String soapBrand;


    @Size(min =3,max = 10,message = "soapBrand name should be b/t 3 to 10")
    private int soapPrice;

    @NotNull(message = "soapFragrance is null" )
    @Size(min = 4,max = 7,message = "soapFragrance name should be b/t 4 to 7")
    private String soapFragrance;


}
