package org.webp;

import javax.persistence.*;


@Table(name = "Obisis")
@Entity
public class Obisis {

    public Obisis(){}

    @Column(name = "ID") //@GeneratedValue
    @Id
    private Long id;

    @Column(name = "OgrAdiSoyadi")
    @OneToMany

    private Ogrenci OgreAdiSoyadi;


    @Column(name = "DersAdi")
    @OneToMany

    private Dersler DersAdi;

    @OneToMany
    @Column(name = "Kredi")

    private Dersler DersKredisi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ogrenci getOgreAdiSoyadi() {
        return OgreAdiSoyadi;
    }

    public void setOgreAdiSoyadi(Ogrenci ogreAdiSoyadi) {
        OgreAdiSoyadi = ogreAdiSoyadi;
    }

/*
    public int getOgrAdiSoyadi() {
        return OgrAdiSoyadi;
    }

    public void setOgrAdiSoyadi(int ogrAdiSoyadi) {
        OgrAdiSoyadi = ogrAdiSoyadi;
    }*/
/*
    public int getDersAdi() {
        return DersAdi;
    }

    public void setDersAdi(int dersAdi) {
        DersAdi = dersAdi;
    }*/

    public Dersler getDersAdi() {
        return DersAdi;
    }

    public void setDersAdi(Dersler dersAdi) {
        DersAdi = dersAdi;
    }
/*
    public int getDersKredisi() {
        return DersKredisi;
    }

    public void setDersKredisi(int dersKredisi) {
        DersKredisi = dersKredisi;
    }*/

    public Dersler getDersKredisi() {
        return DersKredisi;
    }

    public void setDersKredisi(Dersler dersKredisi) {
        DersKredisi = dersKredisi;
    }
}
