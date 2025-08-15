package com.xworkz.busdepot.service;

import com.xworkz.busdepot.dto.BusDetailsDTO;

import java.util.List;

public interface UserDetailsService {
     boolean savePersonDetails(BusDetailsDTO busDetailsDTO);

     List<BusDetailsDTO> getAllData();
}
