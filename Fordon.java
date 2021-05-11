/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenInBlack;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author kmaki
 */
@Entity
@Table(name = "fordon")
@NamedQueries({
    @NamedQuery(name = "Fordon.findAll", query = "SELECT f FROM Fordon f"),
    @NamedQuery(name = "Fordon.findByFordonsID", query = "SELECT f FROM Fordon f WHERE f.fordonsID = :fordonsID"),
    @NamedQuery(name = "Fordon.findByFordonsbeskrivning", query = "SELECT f FROM Fordon f WHERE f.fordonsbeskrivning = :fordonsbeskrivning"),
    @NamedQuery(name = "Fordon.findByRegistreringsdatum", query = "SELECT f FROM Fordon f WHERE f.registreringsdatum = :registreringsdatum"),
    @NamedQuery(name = "Fordon.findByArsmodell", query = "SELECT f FROM Fordon f WHERE f.arsmodell = :arsmodell")})
public class Fordon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Fordons_ID")
    private String fordonsID;
    @Column(name = "Fordonsbeskrivning")
    private String fordonsbeskrivning;
    @Basic(optional = false)
    @Column(name = "Registreringsdatum")
    @Temporal(TemporalType.DATE)
    private Date registreringsdatum;
    @Column(name = "Arsmodell")
    private Integer arsmodell;

    public Fordon() {
    }

    public Fordon(String fordonsID) {
        this.fordonsID = fordonsID;
    }

    public Fordon(String fordonsID, Date registreringsdatum) {
        this.fordonsID = fordonsID;
        this.registreringsdatum = registreringsdatum;
    }

    public String getFordonsID() {
        return fordonsID;
    }

    public void setFordonsID(String fordonsID) {
        this.fordonsID = fordonsID;
    }

    public String getFordonsbeskrivning() {
        return fordonsbeskrivning;
    }

    public void setFordonsbeskrivning(String fordonsbeskrivning) {
        this.fordonsbeskrivning = fordonsbeskrivning;
    }

    public Date getRegistreringsdatum() {
        return registreringsdatum;
    }

    public void setRegistreringsdatum(Date registreringsdatum) {
        this.registreringsdatum = registreringsdatum;
    }

    public Integer getArsmodell() {
        return arsmodell;
    }

    public void setArsmodell(Integer arsmodell) {
        this.arsmodell = arsmodell;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fordonsID != null ? fordonsID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fordon)) {
            return false;
        }
        Fordon other = (Fordon) object;
        if ((this.fordonsID == null && other.fordonsID != null) || (this.fordonsID != null && !this.fordonsID.equals(other.fordonsID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MenInBlack.Fordon[ fordonsID=" + fordonsID + " ]";
    }
    
}
