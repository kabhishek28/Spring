package com.xworkz.bank.runner;

import com.xworkz.bank.entity.Account;
import com.xworkz.bank.service.DataService;
import com.xworkz.bank.service.DataServiceImplementation;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        DataService dataService = new DataServiceImplementation();

        ArrayList<Account> list = new ArrayList<>();
        list.add(new Account("K Abhi",587469,"SBI","Hospet","SBIFS96321",32));
        list.add(new Account("Kiran", 147852, "HDFC", "Bangalore", "HDFCIN00123",33));
        list.add(new Account( "Harsha",369258, "ICICI", "Mysore", "ICICIN00256",23));
        list.add(new Account("Ravi", 741963, "Axis", "Hubli", "UTIBIN00367",66));
        list.add(new Account("Divya", 852741, "Canara", "Dharwad", "CNRBIN00478",14));
        list.add(new Account("Manoj", 963852, "BOB", "Belgaum", "BARBIN00589",18));
        list.add(new Account("Priya", 123654, "Union Bank", "Davangere", "UBININ00690",22));
        list.add(new Account("Amit", 456789, "Kotak", "Shimoga", "KKBKIN00791",35));
        list.add(new Account("Neha", 789123, "IDFC", "Udupi", "IDFBIN00892",17));
        list.add(new Account("Varun", 321654, "PNB", "Mangalore", "PUNBIN00993",26));

//        **************************Save Data*************************
////        System.out.println(dataService.saveValidation(list));
////        BeanUtils.copyProperties(list, dataService);

//        String save = dataService.saveValidation(list);
//        System.out.println(save);



//        ************************update Data**************************
////        String update = dataService.upDateValidation(3 , "Harsha");
////        System.out.println(update);

//        **********************getting Data from DataBase***********************
////        System.out.println("data from database :" + dataService.getValidation(3));


//        ********************** Deleting data *************************
////        System.out.println(dataService.deleteValidation(4));




//  ************************** getting Data by ID brooo **************************
////        dataService.getValidation(2);




//  ***************************** get all Data ***************************
////    List<Account> list = dataService.findAllValidation();
////        list.stream().forEach(s-> System.out.println(s));
//



// ************************ Get Entity Base on Name*****************************
////        List<Account> list = dataService.findEntityByNameValidation("Abhi");
////        list.stream().forEach(s-> System.out.println(s));
//


//        ************************* get Entity base on BAnkName and Bank Branch **************************
        List<Account> list1 = dataService.findEntityByNameAndBankBranchValidation("Kiran","HDFC");
        list1.stream().forEach(l-> System.out.println(l));



//
    }
}
