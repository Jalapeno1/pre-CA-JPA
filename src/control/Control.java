/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import entity.PersonEntity;
import exceptions.NotFoundException;
import facades.PersonFacadeDB;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Person;

/**
 *
 * @author Jonas
 */
public class Control
{
    
    public static void main(String[] args) throws NotFoundException
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("preCAMapping");
        EntityManager em = emf.createEntityManager();
        
        PersonEntity p1 = new PersonEntity("Test", "Testersen", "88888888");
        PersonEntity p2 = new PersonEntity("Test1", "Testersen1", "88888889");
        
        PersonFacadeDB pfdb = new PersonFacadeDB();
        
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.getTransaction().commit();
        
        PersonEntity pe1 = em.find(PersonEntity.class, p1.getId());
        PersonEntity pe2 = em.find(PersonEntity.class, p2.getId());
        System.out.println(pe1.getfName());                
        System.out.println(pe2.getfName()); 
        //pfdb.deletePerson(pe1.getId());
        
        
        
    }
}
