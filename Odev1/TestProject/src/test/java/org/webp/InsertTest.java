package org.webp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InsertTest {

    private EntityManagerFactory factory;
    private EntityManager em;

    @BeforeEach
    public void init() {
        //her bir test calismadan once BeforeEach calistirilir
        factory = Persistence.createEntityManagerFactory("Hibernate");
        em = factory.createEntityManager();
    }

    @AfterEach
    public void tearDown() {
        //her bir test calistiktan sonra BeforeEach calistirilir

        em.close();
        factory.close();
    }

    private boolean persistInATransaction(Object obj) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            em.persist(obj);
            tx.commit();
        } catch (Exception e) {
            System.out.println("FAILED TRANSACTION: " + e.toString());
            tx.rollback();
            return false;
        }

        return true;
    }

/**/
    @Test
    public void Dersler() {

        Dersler dersler = new Dersler();


        boolean persisted = persistInATransaction(dersler);
        assertTrue(persisted);
    }

    @Test
    public void Ogrenci() {

        Ogrenci ogrenci = new Ogrenci();


        boolean persisted = persistInATransaction(ogrenci);
        assertTrue(persisted); // "Song" adında bir tablo yok
    }

    @Test
    public void Obisis() {

        Obisis obisis = new Obisis();


        boolean persisted = persistInATransaction(obisis);
        assertTrue(persisted);
    }

}
