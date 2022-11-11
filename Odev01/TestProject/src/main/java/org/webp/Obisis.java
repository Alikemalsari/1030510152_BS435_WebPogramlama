package org.webp;

import javax.persistence.*;
import java.util.List;


@Table(name = "Obisis")
@Entity
public class Obisis {

    public Obisis(){}

    @Column(name = "ID") //@GeneratedValue
    @Id
    private Long id;

    @ManyToOne
    private Obisis Ogrenci;

    @ManyToOne
    private Dersler dersadi;


    @ManyToOne
    private Dersler derskredi;


    public Obisis getOgrenci() {
        return Ogrenci;
    }

    public void setOgrenci(Obisis ogrenci) {
        Ogrenci = ogrenci;
    }

    public Dersler getDersadi() {
        return dersadi;
    }

    public void setDersadi(Dersler dersadi) {
        this.dersadi = dersadi;
    }

    public Dersler getDerskredi() {
        return derskredi;
    }

    public void setDerskredi(Dersler derskredi) {
        this.derskredi = derskredi;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }




}
