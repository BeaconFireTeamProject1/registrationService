package com.example.springssoauthserver.service;

import com.example.springssoauthserver.dao.ContactDAO;
import com.example.springssoauthserver.domain.Contact;
//import org.graalvm.compiler.lir.LIRInstruction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.concurrent.ExecutionException;

@Service
public class ContactService {
    @Autowired
    ContactDAO contactDAO;

    public Contact findContactByID(int ID) {
        try {
            return contactDAO.findContactByID(ID);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public int createContact(Contact contact){
        try{
            int id = contactDAO.createContact(contact);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return -1;
    }
}
