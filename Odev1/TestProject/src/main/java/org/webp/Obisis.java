package org.webp;

import javax.persistence.*;

@Table(name = "Obisis")
@Entity
public class Obisis {

    @Column(name = "ID") @GeneratedValue
    @Id
    private Long id;

    @Column(name = "OgrAdiSoyadi")
    private int OgrAdiSoyadi;

    @Column(name = "DersAdi")
    private int DersAdi;

    @Column(name = "Kredi")
    private int DersKredisi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOgrAdiSoyadi() {
        return OgrAdiSoyadi;
    }

    public void setOgrAdiSoyadi(int ogrAdiSoyadi) {
        OgrAdiSoyadi = ogrAdiSoyadi;
    }

    public int getDersAdi() {
        return DersAdi;
    }

    public void setDersAdi(int dersAdi) {
        DersAdi = dersAdi;
    }

    public int getDersKredisi() {
        return DersKredisi;
    }

    public void setDersKredisi(int dersKredisi) {
        DersKredisi = dersKredisi;
    }
}
