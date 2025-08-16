package com.xworkz.busdepot.service;

import com.xworkz.busdepot.dto.BusDetailsDTO;
import com.xworkz.busdepot.dto.IdDTO;
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



           for(BusDetailsEntity busDetailsEntity : list1){
               BusDetailsDTO busDetailsDTO = new BusDetailsDTO();
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

    @Override
    public BusDetailsDTO getById(int id) {

        BusDetailsEntity busDetailsEntity = userDetailsRepositoryImplementation.getByIdFormDataBase(id);

        BusDetailsDTO busDetailsDTO = new BusDetailsDTO();
        busDetailsDTO.setPersonName(busDetailsEntity.getPersonName());
        busDetailsDTO.setPersonEmail(busDetailsEntity.getPersonEmail());
        busDetailsDTO.setPersonPhoneNumber(busDetailsEntity.getPersonPhoneNumber());
        busDetailsDTO.setPersonAge(busDetailsEntity.getPersonAge());
        busDetailsDTO.setPersonCity(busDetailsEntity.getPersonCity());
        busDetailsDTO.setPersonState(busDetailsEntity.getPersonState());


        return busDetailsDTO;
    }

    @Override
    public String upDatePhoneNumber(IdDTO idDTO) {
        int id = idDTO.getPersonId();
        long phoneNo = idDTO.getPersonPhoneNumber();
        return userDetailsRepositoryImplementation.upDataPhoneNoInDataBase(id,phoneNo);
    }

    @Override
    public String deleteDataById(int personId ) {

        return userDetailsRepositoryImplementation.deleteDataByIdInDataBase(personId);
    }

    @Override
    public  List<String> getGamilByGmail( ) {

        return userDetailsRepositoryImplementation.getGmailByGmailByDataBase();






    }

    @Override
    public BusDetailsDTO getNameAndGmail(long phoneNumber) {
        BusDetailsEntity busDetailsEntity = userDetailsRepositoryImplementation.getNameAndGmailByDataBase(phoneNumber);
        BusDetailsDTO busDetailsDTO = new BusDetailsDTO();
        busDetailsDTO.setPersonName(busDetailsEntity.getPersonName());
        busDetailsDTO.setPersonEmail(busDetailsEntity.getPersonEmail());
        return busDetailsDTO;
    }

    @Override
    public List<String> getNameGreaterThan18() {
        return userDetailsRepositoryImplementation.getNameAgeIsGreaterThan18FromDataBase();
    }
}
