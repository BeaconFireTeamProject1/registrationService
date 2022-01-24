package com.example.springssoauthserver.dao;

import com.example.springssoauthserver.domain.Contact;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class ContactDAO {
    @Autowired
    protected SessionFactory sessionFactory;

    protected final Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    public Contact findContactByID(int ID) {
        Session session = getCurrentSession();
        Query query = session.createQuery("From Contact c WHERE c.id = :ID");
        query.setParameter("ID", ID);
        Contact contact = (Contact) query.getSingleResult();
        return contact;
    }

    public int createContact(Contact contact){
        Session session = getCurrentSession();
        Serializable id = session.save(contact);
        System.out.println(id);
        return (int)id;
    }
}
