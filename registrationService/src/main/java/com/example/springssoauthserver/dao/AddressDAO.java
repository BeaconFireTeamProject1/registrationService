package com.example.springssoauthserver.dao;

import com.example.springssoauthserver.domain.Address;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class AddressDAO {
    @Autowired
    protected SessionFactory sessionFactory;

    protected final Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    public Address findAddressByID(int ID){
        Session session = getCurrentSession();
        Query query = session.createQuery("From Address a WHERE a.ID = :ID");
        query.setParameter("ID", ID);
        Address address = (Address) query.getSingleResult();
        return address;
    }

    public int createAdress(Address address) {
        Session session = getCurrentSession();
        Serializable id = session.save(address);
        System.out.println(id);
        return (int)id;
    }

}
