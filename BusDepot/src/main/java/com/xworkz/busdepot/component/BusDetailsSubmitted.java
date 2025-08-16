package com.xworkz.busdepot.component;

import com.xworkz.busdepot.dto.BusDetailsDTO;
import com.xworkz.busdepot.dto.IdDTO;
import com.xworkz.busdepot.service.UserDetailsServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Component
@RequestMapping
public class BusDetailsSubmitted {

    @Autowired
    UserDetailsServiceImplementation userDetailsServiceImplementation;

    public BusDetailsSubmitted() {
        System.out.println("BusDetailsSubmitted...................");
    }

    @RequestMapping("openSaveDetails")
    public String openSaveDetailsPage() {
        return "saveDetails";
    }


    @RequestMapping("busDetailsSubmitted")
    public String gotDetails(BusDetailsDTO busDetailsDTO, Model model) {
        boolean value = userDetailsServiceImplementation.savePersonDetails(busDetailsDTO);
        if (value == true) {
            model.addAttribute("name", busDetailsDTO.getPersonName());
            return "submittedPage";
        }
        model.addAttribute("name", busDetailsDTO.getPersonName());
        return "notSubmittedPage";
    }

    @RequestMapping("getAllDetails")
    public String getAllData(Model model) {

        List<BusDetailsDTO> list = userDetailsServiceImplementation.getAllData();
        model.addAttribute("busList", list);
        return "allData";
    }

    @RequestMapping("getByIdDetails")
    public String getByIdDetails() {
        return "getDataByIdPage";
    }

    @RequestMapping("getById")
    public String getEntityByID(IdDTO idDTO, Model model) {
        System.out.println(idDTO.getPersonId());
        BusDetailsDTO busDetailsDTO = userDetailsServiceImplementation.getById(idDTO.getPersonId());
//        System.out.println(busDetailsDTO);
        model.addAttribute("bus", busDetailsDTO);
        return "getByIdData";
    }

    @RequestMapping("upDateDataById")
    public String getUaDatePage() {
        return "upDatePage";
    }

    @RequestMapping("upDatePhoneNo")
    public String phoneNoUp(IdDTO idDTO ){

        String update = userDetailsServiceImplementation.upDatePhoneNumber(idDTO);
        if(!update.equals("your Data has ben updated")){
            return "notSubmitted";
        }
        return "submittedPage";
    }

    @RequestMapping("deleteDataByIdPage")
    public String getDeletePage(){
        return "deletePage";
    }

    @RequestMapping("deleteData")
    public String DeleteData(IdDTO idDTO){
        String delete = userDetailsServiceImplementation.deleteDataById(idDTO);
        if(!delete.equals("Your Data has Deleted")){
            return "notDeletedPage";
        }
        return "deletedPage";

    }
}

