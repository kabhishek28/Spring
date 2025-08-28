package com.xworkz.kabhishek_xworkzmodule.service;

import com.xworkz.kabhishek_xworkzmodule.dto.UserDTO;
import com.xworkz.kabhishek_xworkzmodule.entity.UserEntity;
import com.xworkz.kabhishek_xworkzmodule.repository.UserRepository;
import com.xworkz.kabhishek_xworkzmodule.repository.UserRepositoryImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.time.LocalDateTime;
import java.util.Properties;


@Service
public  class UserServiceImplementation implements UserService{

    @Autowired
    UserRepositoryImplementation userRepositoryImplementation ;

    @Autowired
    PasswordEncoder passwordEncoder;

    UserEntity userEntity = new UserEntity();
    @Override
    public String singUpUser(UserDTO userDTO) {

        userEntity.setUserName(userDTO.getUserName());
        userEntity.setUserEmail(userDTO.getUserEmail());
        userEntity.setUserPhoneNo(userDTO.getUserPhoneNo());
        userEntity.setUserAge(userDTO.getUserAge());
        userEntity.setUserGender(userDTO.getUserGender());
        userEntity.setUserAddress(userDTO.getUserAddress());

        userEntity.setUserPassword(passwordEncoder.encode(userDTO.getUserPassword()));
        sendEmail(userEntity.getUserEmail());


        return userRepositoryImplementation.singUpUserToDataBase(userEntity);

    }

    private void sendEmail(String email){
        final String username = "kabhishek.eng@gmail.com";
        final String password = "voyy beef kyoc ahsn";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(email)
            );
            message.setSubject("Testing Gmail TLS");
            message.setText("Dear Mail Crawler,"
                    + "\n\n Please do not spam my email!");

            Transport.send(message);


            System.out.println("Done");

        } catch (MessagingException e) {
            e.printStackTrace();


        }

    }

    @Override
    public boolean singInUser(String email, String password) {
        LocalDateTime localDateTime = LocalDateTime.now();
        UserEntity userEntity1 = userRepositoryImplementation.singInUserToDatabase(email);
        String fromDataBasePassword = userEntity1.getUserPassword();
        if(userEntity1 == null){
            System.out.println("querry not found ");
            return false;
        }

        else {
            if(userEntity1.getLoginAttempts() >= 3){
                if(localDateTime.isAfter(userEntity1.getLocalDateTime().plusDays(1))){
                    System.out.println("account is unlocked");
                    if(passwordEncoder.matches(password,fromDataBasePassword)) {
                        userEntity1.setLoginAttempts(0);
                        userEntity1.setLocalDateTime(null);
                        System.out.println("password matchesssssssss");
                        userRepositoryImplementation.upDateTable(userEntity1);
                        return true;
                    }
                }else {
                    System.out.println("account is locked");

                }
            }else {
                if(passwordEncoder.matches(password,fromDataBasePassword)){
                    userEntity1.setLoginAttempts(0);
                    userEntity1.setLocalDateTime(null);
                    System.out.println("password matchesssssssss");
                    return true;
                }else {
                    int trails = userEntity1.getLoginAttempts() + 1;
                    userEntity1.setLoginAttempts(trails);
                    System.out.println("wonrg password attempt " + trails);

                    if(userEntity1.getLoginAttempts() >= 3){
                        userEntity1.setLocalDateTime(localDateTime);
                        System.out.println("account hase been locked for one day");
                    }
                    userRepositoryImplementation.upDateTable(userEntity1);
                    return false;
                }
            }
        }
//        userRepositoryImplementation.upDateTable(userEntity1);
        return  false;
    }

    @Override
    public boolean upDatePassword(String email, String password, String confirmPassword) {
        if (password.equals(confirmPassword)) {

           return userRepositoryImplementation.UpDatePassword(email, passwordEncoder.encode(password));

        }
        return false;
    }

//    @Override
//    public boolean getGmailIsExist(String email) {
//
//        return userRepositoryImplementation.getGmailIsExist(email);
//    }
//
//    @Override
//    public void setPassword(String email ,String password, String confirmPassword) {
//        if(password.equals(confirmPassword)) {
//            String encodedPassword = passwordEncoder.encode(password);
//            UserRepositoryImplementation.setForgotPassword(email, password);
//        }
//
//
//    }
}
