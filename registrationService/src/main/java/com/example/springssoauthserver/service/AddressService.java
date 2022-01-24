package com.example.springssoauthserver.service;

import com.example.springssoauthserver.dao.AddressDAO;
import com.example.springssoauthserver.domain.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.concurrent.ExecutionException;

@Service
public class AddressService {
    @Autowired
    AddressDAO addressDAO;

    public Address findAddressByID(int ID) {
        try {
            return addressDAO.findAddressByID(ID);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public int createAddress(Address address) {
        try {
            int id = addressDAO.createAdress(address);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return -1;
    }

}
