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
    public String DeleteData(int Id  ){
        String delete = userDetailsServiceImplementation.deleteDataById(Id);
        if(!delete.equals("Your Data has Deleted")){
            return "notDeletedPage";
        }
        return "deletedPage";
    }

//    @RequestMapping("getGmailPage")
//    public String getGmailPage(){
//        return "gmailPage";
//    }

    @RequestMapping("getGmailPage")
    public String getGmail(Model model){

        List<String> list = userDetailsServiceImplementation.getGamilByGmail();
        System.out.println(list);
        model.addAttribute("list" , list);
        return "gmailDataPage";
    }

    @RequestMapping("getPhoneNumberPage")
    public String getPhoneNumberPage(){
        return "phoneNumberPage";
    }

    @RequestMapping("getNameAndEmail")
    public String getNameAndEmail(long personPhoneNumber,Model model){
        BusDetailsDTO busDetailsDTO = userDetailsServiceImplementation.getNameAndGmail(personPhoneNumber);
        model.addAttribute("name" , busDetailsDTO.getPersonName());
        model.addAttribute("email" , busDetailsDTO.getPersonEmail());
        return "nameAndEmail";
    }

    @RequestMapping("getAgeGreaterthan18")
    public String getNameAgeIsGreaterThan18(Model model){
        List<String> list = userDetailsServiceImplementation.getNameGreaterThan18();
        model.addAttribute("nameList",list);
        return "ageGreaterThan18";
    }
}

