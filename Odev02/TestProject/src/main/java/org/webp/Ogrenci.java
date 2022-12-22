package org.webp;




import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;


@Table(name = "Ogrenci")
@Entity
public class Ogrenci {

    @GeneratedValue
    @Id
    private Long id;

    @OneToMany(mappedBy = "Ogrenci")
    private List<Obisis> ys = new ArrayList<>();

    @NotNull
    private String adSoyad;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Obisis> getYs() {
        return ys;
    }

    public void setYs(List<Obisis> ys) {
        this.ys = ys;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public Long getOgrNo() {
        return OgrNo;
    }

    public void setOgrNo(Long ogrNo) {
        OgrNo = ogrNo;
    }

    @NotNull
    private Long OgrNo;

    public Ogrenci(){}





}










