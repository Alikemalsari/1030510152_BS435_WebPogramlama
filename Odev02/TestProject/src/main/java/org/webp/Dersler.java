package org.webp;




import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;


@Table(name = "Dersler")
@Entity
public class Dersler {

    @GeneratedValue
    @Id
    private Long id;

    @OneToMany(mappedBy = "dersadi")
    private List<Obisis> yss = new ArrayList<>();


    @OneToMany(mappedBy = "derskredi")
    private List<Obisis> xss = new ArrayList<>();

    @NotNull
    private String DersAdi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Obisis> getYss() {
        return yss;
    }

    public void setYss(List<Obisis> yss) {
        this.yss = yss;
    }

    public List<Obisis> getXss() {
        return xss;
    }

    public void setXss(List<Obisis> xss) {
        this.xss = xss;
    }

    public String getDersAdi() {
        return DersAdi;
    }

    public void setDersAdi(String dersAdi) {
        DersAdi = dersAdi;
    }

    public int getDersKredisi() {
        return DersKredisi;
    }

    public void setDersKredisi(int dersKredisi) {
        DersKredisi = dersKredisi;
    }

    @NotNull
    private int DersKredisi;


    public Dersler(){}


}


