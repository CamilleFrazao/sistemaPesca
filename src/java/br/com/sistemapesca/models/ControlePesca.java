package br.com.sistemapesca.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class ControlePesca implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @Column(name = "TECNICO_ID")
    private Tecnico tecnico;

    @OneToOne
    @Column(name = "APONTADOR_ID")
    private Apontador apontador;

    @OneToOne
    @Column(name = "EMBARCACAO_ID")
    private Embarcacao embarcacao;

    @OneToOne
    @Column(name = "PESCADOR_ID")
    private Pescador pescador;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "HABITAT_ID")
    private Habitat habitat;

    @OneToOne
    @Column(name = "PESCA_ID")
    private Pesca pesca;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public Apontador getApontador() {
        return apontador;
    }

    public void setApontador(Apontador apontador) {
        this.apontador = apontador;
    }

    public Embarcacao getEmbarcacao() {
        return embarcacao;
    }

    public void setEmbarcacao(Embarcacao embarcacao) {
        this.embarcacao = embarcacao;
    }

    public Pescador getPescador() {
        return pescador;
    }

    public void setPescador(Pescador pescador) {
        this.pescador = pescador;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    public Pesca getPesca() {
        return pesca;
    }

    public void setPesca(Pesca pesca) {
        this.pesca = pesca;
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
        if (!(object instanceof ControlePesca)) {
            return false;
        }
        ControlePesca other = (ControlePesca) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.sistemapesca.models.ControlePesca[ id=" + id + " ]";
    }

}
