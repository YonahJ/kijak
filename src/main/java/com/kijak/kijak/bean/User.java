package com.kijak.kijak.bean;

import javax.persistence.*;


import java.io.Serializable;
import java.util.Date;

@Entity
public class User implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
    private String email;
    private Boolean admin;
    private boolean bloqued;
    private int nbrTentatifRestant;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateBloquage;
    @ManyToOne
    private Departement departement;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }
    
    
    
    public boolean isBloqued() {
		return bloqued;
	}

	public void setBloqued(boolean bloqued) {
		this.bloqued = bloqued;
	}

	public int getNbrTentatifRestant() {
		return nbrTentatifRestant;
	}

	public void setNbrTentatifRestant(int nbrTentatifRestant) {
		this.nbrTentatifRestant = nbrTentatifRestant;
	}

	public Date getDateBloquage() {
		return dateBloquage;
	}

	public void setDateBloquage(Date dateBloquage) {
		this.dateBloquage = dateBloquage;
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
		if (!(object instanceof User)) {
			return false;
		}
		User other = (User) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + "]";
	}
	
	
}
