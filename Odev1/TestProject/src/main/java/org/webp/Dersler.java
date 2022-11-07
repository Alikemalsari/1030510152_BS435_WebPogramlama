package org.webp;

import javax.persistence.*;

@Table(name = "Dersler")
@Entity
public class Dersler {
    @OneToMany
    @Column(name = "ID") @Id
    @GeneratedValue
    private Long id;


    @Column(name = "DersAdi")
    private String DersAdi;

    @Column(name = "DersKredisi")
    private int DersKredisi;


    public void setDersKredisi(int dersKredisi) {
        DersKredisi = dersKredisi;
    }

    public int getDersKredisi() {
        return DersKredisi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDersAdi(String dersAdi) {
        DersAdi = dersAdi;
    }

    public String getDersAdi() {
        return DersAdi;
    }
}
