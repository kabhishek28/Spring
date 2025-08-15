package com.xworkz.busdepot.service;

import com.xworkz.busdepot.dto.BusDetailsDTO;
import com.xworkz.busdepot.entity.BusDetailsEntity;
import com.xworkz.busdepot.repository.UserDetailsRepositoryImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImplementation implements UserDetailsService {

    @Autowired
    UserDetailsRepositoryImplementation userDetailsRepositoryImplementation;


    @Override
    public boolean savePersonDetails(BusDetailsDTO busDetailsDTO) {

        BusDetailsEntity busDetailsEntity = new BusDetailsEntity();

        busDetailsEntity.setPersonName(busDetailsDTO.getPersonName());
        busDetailsEntity.setPersonEmail(busDetailsDTO.getPersonEmail());
        busDetailsEntity.setPersonPhoneNumber(busDetailsDTO.getPersonPhoneNumber());
        busDetailsEntity.setPersonAge(busDetailsDTO.getPersonAge());
        busDetailsEntity.setPersonCity(busDetailsDTO.getPersonCity());
        busDetailsEntity.setPersonState(busDetailsDTO.getPersonState());

        return userDetailsRepositoryImplementation.saveDetailsToDataBase(busDetailsEntity);

    }

    @Override
    public List<BusDetailsDTO> getAllData() {
        List<BusDetailsDTO> list = new ArrayList<>();
           List<BusDetailsEntity> list1 =    userDetailsRepositoryImplementation.getAllDataFromDataBase();

           BusDetailsDTO busDetailsDTO = new BusDetailsDTO();

           for(BusDetailsEntity busDetailsEntity : list1){
               busDetailsDTO.setPersonName(busDetailsEntity.getPersonName());
               busDetailsDTO.setPersonEmail(busDetailsEntity.getPersonEmail());
               busDetailsDTO.setPersonPhoneNumber(busDetailsEntity.getPersonPhoneNumber());
               busDetailsDTO.setPersonAge(busDetailsEntity.getPersonAge());
               busDetailsDTO.setPersonCity(busDetailsEntity.getPersonCity());
               busDetailsDTO.setPersonState(busDetailsEntity.getPersonState());


               list.add(busDetailsDTO);

           }
        return list;
    }
}
