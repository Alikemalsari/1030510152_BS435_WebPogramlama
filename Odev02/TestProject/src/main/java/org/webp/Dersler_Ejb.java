package org.webp;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.validation.constraints.NotNull;

@Stateless
public class Dersler_Ejb {

    @PersistenceContext
    private EntityManager em;

    public long createNewDers(@NotNull String userId, @NotNull String dersAdi, @NotNull int kredi){
        if(isRegistered(userId)){
            return 0;
        }
        Dersler dersler=new Dersler();
        dersler.setDersAdi(dersAdi);
        dersler.setDersKredisi(kredi);
        em.persist(dersler);
        return dersler.getId();
    }

    public boolean isRegistered(@NotNull String userId){
        Dersler dersler = em.find(Dersler.class, userId);
        return dersler != null;
    }



    public long getNumberOfUsers(){
        TypedQuery<Long> query = em.createQuery("select count(u) from Dersler u", Long.class);
        long n = query.getSingleResult();
        return n;
    }
}
