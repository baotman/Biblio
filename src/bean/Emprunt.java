/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author farah
 */
@Entity
public class Emprunt implements Serializable {

    @OneToMany(mappedBy = "emprunt")
    private List<EmpruntItem> empruntItems;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateEmprunt;
    private int nbrOuvrage;
    @OneToOne
    private Reservation reservation;

    public Emprunt() {
    }

    public Emprunt(Long id) {
        this.id = id;
    }
    

    public List<EmpruntItem> getEmpruntItems() {
        return empruntItems;
    }

    public Emprunt(Long id, Date dateEmprunt, int nbrOuvrage) {
        this.id = id;
        this.dateEmprunt = dateEmprunt;
        this.nbrOuvrage = nbrOuvrage;
    }
    

    public void setEmpruntItems(List<EmpruntItem> empruntItems) {
        this.empruntItems = empruntItems;
    }

    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(Date dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public int getNbrOuvrage() {
        return nbrOuvrage;
    }

    public void setNbrOuvrage(int nbrOuvrage) {
        this.nbrOuvrage = nbrOuvrage;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Emprunt)) {
            return false;
        }
        Emprunt other = (Emprunt) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Emprunt[ id=" + id + " ]";
    }
    
}
