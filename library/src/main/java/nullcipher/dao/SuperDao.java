/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nullcipher.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class SuperDao {
    
    
    @Autowired//Inject
    private SessionFactory sessionFactory;
    //We need to Session for queries in DB
    protected Session getSession(){
        Session session = sessionFactory.getCurrentSession();
        return session;
    }
}
