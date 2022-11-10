package org.webp;


//import com.sun.tools.javac.comp.Resolve;


import javax.persistence.*;




@Table(name = "Ogrenci")
@Entity
public class Ogrenci {


    public Ogrenci(){}

    @Column(name = "ID") @Id
    @GeneratedValue
    private Long id;


    @Column(name = "AdSoyad")
    private String adSoyad;

    @Column(name="OgrNo")
    private Long OgrNo;

    public void setOgrNo(Long ogrNo) {
        OgrNo = ogrNo;
    }

    public Long getOgrNo() {
        return OgrNo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public Long getId() {
        return id;
    }

    public String getAdSoyad() {
        return adSoyad;
    }


}
