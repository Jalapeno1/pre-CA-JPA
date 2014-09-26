/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import entity.PersonEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jonas
 */
public class Control
{
    public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("preCA");
        EntityManager em = emf.createEntityManager();
        
        PersonEntity p1 = new PersonEntity("Test", "Testersen", "88888888");
        PersonEntity p2 = new PersonEntity("Test1", "Testersen1", "88888889");
        
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.getTransaction().commit();
        
    }
}
