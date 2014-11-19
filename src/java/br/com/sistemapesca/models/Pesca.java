package br.com.sistemapesca.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author John
 */
@Entity
public class Pesca implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "HORARIO")
    private Horario horario;
    @Column(name = "CX_PEIXES")
    private Integer cxPeixes;
    @Column(name = "PROF_PESCA")
    private Integer profPesca;
    @Column(name = "GELO")
    private Integer gelo;
    @Column(name = "PRECO_GELO")
    private Integer Precogelo;
    @Column(name = "PROFUNDIDADE")
    private Integer profundiade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Integer getPrecogelo() {
        return Precogelo;
    }

    public void setPrecogelo(Integer Precogelo) {
        this.Precogelo = Precogelo;
    }

    
    public Integer getCxPeixes() {
        return cxPeixes;
    }

    public void setCxPeixes(Integer cxPeixes) {
        this.cxPeixes = cxPeixes;
    }

    public Integer getProfPesca() {
        return profPesca;
    }

    public void setProfPesca(Integer profPesca) {
        this.profPesca = profPesca;
    }

    public Integer getGelo() {
        return gelo;
    }

    public void setGelo(Integer gelo) {
        this.gelo = gelo;
    }

    public Integer getProfundiade() {
        return profundiade;
    }

    public void setProfundiade(Integer profundiade) {
        this.profundiade = profundiade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pesca)) {
            return false;
        }
        Pesca other = (Pesca) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.sistemapesca.models.Pesca[ id=" + id + " ]";
    }

}
