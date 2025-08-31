package com.xworkz.kabhishek_xworkzmodule.service;

import com.xworkz.kabhishek_xworkzmodule.dto.UserDTO;
import com.xworkz.kabhishek_xworkzmodule.entity.UserEntity;
import com.xworkz.kabhishek_xworkzmodule.repository.UserRepository;
import com.xworkz.kabhishek_xworkzmodule.repository.UserRepositoryImplementation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.time.LocalDateTime;
import java.util.Properties;
import java.util.Random;


@Service
public  class UserServiceImplementation implements UserService{

    @Autowired
    UserRepositoryImplementation userRepositoryImplementation ;

    @Autowired
    PasswordEncoder passwordEncoder;

    String otpNo = getOTP();

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


        sendEmail(userEntity.getUserEmail(), otpNo);

        return "otpSent";
    }

    @Override
    public String otpMatch(String otp){
    if(otpNo.equals(otp)){
        return "otp not matched";
    }
    return userRepositoryImplementation.singUpUserToDataBase(userEntity);
    }

    public String getOTP(){

        return "7894";
    }

    private void sendEmail(String email,String OTPNumber){
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
            message.setSubject("Your One-Time Password (OTP) for Verification");

            message.setText("Dear User,\n\n"
                    + "Your One-Time Password (OTP) for completing the verification process is:\n\n"
                    + OTPNumber + "\n\n"
                    + "Please use this code within the next 10 minutes. "
                    + "Do not share this OTP with anyone for security reasons.\n\n"
                    + "Thank you,\n"
                    + "Support Team");

            Transport.send(message);


            System.out.println("Done");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

//    private void sendEmailAfterOTP(String email){
//        final String username = "kabhishek.eng@gmail.com";
//        final String password = "voyy beef kyoc ahsn";
//
//        Properties prop = new Properties();
//        prop.put("mail.smtp.host", "smtp.gmail.com");
//        prop.put("mail.smtp.port", "587");
//        prop.put("mail.smtp.auth", "true");
//        prop.put("mail.smtp.starttls.enable", "true"); //TLS
//
//        Session session = Session.getInstance(prop,
//                new javax.mail.Authenticator() {
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication(username, password);
//                    }
//                });
//
//        try {
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(username));
//            message.setRecipients(
//                    Message.RecipientType.TO,
//                    InternetAddress.parse(email)
//            );
//            message.setSubject("Welcome to Our Website – Registration Successful");
//
//            message.setText("Dear " + email + ",\n\n"
//                    + "We are excited to inform you that your registration on our website has been completed successfully.\n\n"
//                    + "You can now log in to your account and start exploring our features and services.\n\n"
//                    + "If you did not sign up for this account, please contact our support team immediately.\n\n"
//                    + "Thank you for joining us!\n\n"
//                    + "Best regards,\n"
//                    + "The Support Team");
//
//            Transport.send(message);
//            System.out.println("Done");
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
//    }

    @Override
    public String singInUser(String email, String password) {
        LocalDateTime localDateTime = LocalDateTime.now();
        UserEntity userEntity1 = userRepositoryImplementation.singInUserToDatabase(email);
        if(userEntity1 == null){
            return "User not found";
        } else {
            if(userEntity1.getLoginAttempts() >= 3){
                if(localDateTime.isAfter(userEntity1.getLocalDateTime().plusDays(1))){
                    String fromDataBasePassword = userEntity1.getUserPassword();
                    if(passwordEncoder.matches(password,fromDataBasePassword)) {
                        userEntity1.setLoginAttempts(0);
                        userEntity1.setLocalDateTime(null);
                        userRepositoryImplementation.upDateTable(userEntity1);
                        return "password Matched";
                    }
                }else {
                   return "Account has been locked for one day";
                }
            }else {
                String fromDataBasePassword = userEntity1.getUserPassword();
                if(passwordEncoder.matches(password,fromDataBasePassword)){
                    userEntity1.setLoginAttempts(0);
                    userEntity1.setLocalDateTime(null);
                    return "password Matched";
                }else {
                    int trails = userEntity1.getLoginAttempts() + 1;
                    userEntity1.setLoginAttempts(trails);
                    if(userEntity1.getLoginAttempts() >= 3){
                        userEntity1.setLocalDateTime(localDateTime);
                    }
                    userRepositoryImplementation.upDateTable(userEntity1);
                    return "Wrong Password Attempt ";
                }
            }
        }
        return "singUp";
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