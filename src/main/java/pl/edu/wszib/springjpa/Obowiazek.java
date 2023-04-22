package pl.edu.wszib.springjpa;

import javax.persistence.*;

@Entity
@Table
public class Obowiazek {

    @Id
    @GeneratedValue
    private Integer id;

    private String nazwa;

    @ManyToOne
    @JoinColumn
    private Pracownik pracownik;

    public Integer getId() {
        return id;
    }

    public Pracownik getPracownik() {
        return pracownik;
    }

    public void setPracownik(Pracownik pracownik) {
        this.pracownik = pracownik;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
