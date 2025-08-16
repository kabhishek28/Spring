package com.xworkz.busdepot.service;

import com.xworkz.busdepot.dto.BusDetailsDTO;
import com.xworkz.busdepot.dto.IdDTO;

import java.util.List;

public interface UserDetailsService {
     boolean savePersonDetails(BusDetailsDTO busDetailsDTO);

     List<BusDetailsDTO> getAllData();

     BusDetailsDTO getById(int id);

     String upDatePhoneNumber(IdDTO idDTO);

     String deleteDataById(IdDTO idDTO);

}
