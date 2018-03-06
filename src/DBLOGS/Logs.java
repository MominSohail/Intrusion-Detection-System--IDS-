/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBLOGS;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SOHAIL MOMIN
 */
@Entity
@Table(name = "LOGS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Logs.findAll", query = "SELECT l FROM Logs l"),
    @NamedQuery(name = "Logs.findByLogid", query = "SELECT l FROM Logs l WHERE l.logid = :logid"),
    @NamedQuery(name = "Logs.findBySdt", query = "SELECT l FROM Logs l WHERE l.sdt = :sdt"),
    @NamedQuery(name = "Logs.findByEdt", query = "SELECT l FROM Logs l WHERE l.edt = :edt"),
    @NamedQuery(name = "Logs.findByUnlock", query = "SELECT l FROM Logs l WHERE l.unlock = :unlock"),
    @NamedQuery(name = "Logs.findByFc", query = "SELECT l FROM Logs l WHERE l.fc = :fc")})
public class Logs implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "LOGID")
    private BigDecimal logid;
    @Column(name = "SDT")
    private String sdt;
    @Column(name = "EDT")
    private String edt;
    @Column(name = "UNLOCK")
    private String unlock;
    @Column(name = "FC")
    private BigInteger fc;

    public Logs() {
    }

    public Logs(BigDecimal logid) {
        this.logid = logid;
    }

    public BigDecimal getLogid() {
        return logid;
    }

    public void setLogid(BigDecimal logid) {
        BigDecimal oldLogid = this.logid;
        this.logid = logid;
        changeSupport.firePropertyChange("logid", oldLogid, logid);
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        String oldSdt = this.sdt;
        this.sdt = sdt;
        changeSupport.firePropertyChange("sdt", oldSdt, sdt);
    }

    public String getEdt() {
        return edt;
    }

    public void setEdt(String edt) {
        String oldEdt = this.edt;
        this.edt = edt;
        changeSupport.firePropertyChange("edt", oldEdt, edt);
    }

    public String getUnlock() {
        return unlock;
    }

    public void setUnlock(String unlock) {
        String oldUnlock = this.unlock;
        this.unlock = unlock;
        changeSupport.firePropertyChange("unlock", oldUnlock, unlock);
    }

    public BigInteger getFc() {
        return fc;
    }

    public void setFc(BigInteger fc) {
        BigInteger oldFc = this.fc;
        this.fc = fc;
        changeSupport.firePropertyChange("fc", oldFc, fc);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (logid != null ? logid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Logs)) {
            return false;
        }
        Logs other = (Logs) object;
        if ((this.logid == null && other.logid != null) || (this.logid != null && !this.logid.equals(other.logid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DBLOGS.Logs[ logid=" + logid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
