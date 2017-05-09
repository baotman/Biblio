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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author farah
 */
@Entity
public class Ouvrage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String nom;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateEdition;
    private int nbrPage;
    private int nbrExplaire;
    @ManyToOne
    private Auteur auteur;
    @ManyToOne
    private Categorie categorie;
    @OneToMany(mappedBy = "ouvrage")
    private List<ReservationItem> reservationItems;

    public Ouvrage(String id, String nom, Date dateEdition, int nbrPage, int nbrExplaire) {
        this.id = id;
        this.nom = nom;
        this.dateEdition = dateEdition;
        this.nbrPage = nbrPage;
        this.nbrExplaire = nbrExplaire;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Ouvrage() {
    }

    public Ouvrage(String id) {
        this.id = id;
    }

    public List<ReservationItem> getReservationItems() {
        return reservationItems;
    }

    public void setReservationItems(List<ReservationItem> reservationItems) {
        this.reservationItems = reservationItems;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateEdition() {
        return dateEdition;
    }

    public void setDateEdition(Date dateEdition) {
        this.dateEdition = dateEdition;
    }

    public int getNbrPage() {
        return nbrPage;
    }

    public void setNbrPage(int nbrPage) {
        this.nbrPage = nbrPage;
    }

    public int getNbrExplaire() {
        return nbrExplaire;
    }

    public void setNbrExplaire(int nbrExplaire) {
        this.nbrExplaire = nbrExplaire;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        if (!(object instanceof Ouvrage)) {
            return false;
        }
        Ouvrage other = (Ouvrage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nom;
    }

}
