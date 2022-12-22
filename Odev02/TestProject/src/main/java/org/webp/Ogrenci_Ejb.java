package org.webp;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.validation.constraints.NotNull;

@Stateless
public class Ogrenci_Ejb {

    @PersistenceContext
    private EntityManager em;

    public long createNewOgrenci(@NotNull String userId,@NotNull String nameSurname,@NotNull long ogrNumber){
        if(isRegistered(userId)){
            return 0;
        }
        Ogrenci ogrenci=new Ogrenci();
        ogrenci.setAdSoyad(nameSurname);
        ogrenci.setOgrNo(ogrNumber);
        em.persist(ogrenci);
        return ogrenci.getId();
    }

    public boolean isRegistered(@NotNull String userId){
        Ogrenci ogrenci = em.find(Ogrenci.class, userId);
        return ogrenci != null;
    }



    public long getNumberOfUsers(){
        TypedQuery<Long> query = em.createQuery("select count(u) from Ogrenci u", Long.class);
        long n = query.getSingleResult();
        return n;
    }


}
