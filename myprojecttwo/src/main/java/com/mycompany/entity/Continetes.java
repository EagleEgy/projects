package com.mycompany.entity;
// Generated Feb 23, 2018 5:59:52 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Continetes generated by hbm2java
 */
@Entity
@Table(name="Continetes"
    ,catalog="Project_DB"
)
public class Continetes  implements java.io.Serializable {


     private Integer continentId;
     private String continentCode;
     private String continentName;
     private String continentDesc;
     private Set<Addresses> addresseses = new HashSet<Addresses>(0);
     private Set<Countries> countrieses = new HashSet<Countries>(0);

    public Continetes() {
    }

	
    public Continetes(String continentName) {
        this.continentName = continentName;
    }
    public Continetes(String continentCode, String continentName, String continentDesc, Set<Addresses> addresseses, Set<Countries> countrieses) {
       this.continentCode = continentCode;
       this.continentName = continentName;
       this.continentDesc = continentDesc;
       this.addresseses = addresseses;
       this.countrieses = countrieses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Continent_Id", unique=true, nullable=false)
    public Integer getContinentId() {
        return this.continentId;
    }
    
    public void setContinentId(Integer continentId) {
        this.continentId = continentId;
    }

    
    @Column(name="Continent_Code", length=50)
    public String getContinentCode() {
        return this.continentCode;
    }
    
    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }

    
    @Column(name="Continent_Name", nullable=false, length=50)
    public String getContinentName() {
        return this.continentName;
    }
    
    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    
    @Column(name="Continent_Desc")
    public String getContinentDesc() {
        return this.continentDesc;
    }
    
    public void setContinentDesc(String continentDesc) {
        this.continentDesc = continentDesc;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="continetes")
    public Set<Addresses> getAddresseses() {
        return this.addresseses;
    }
    
    public void setAddresseses(Set<Addresses> addresseses) {
        this.addresseses = addresseses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="continetes")
    public Set<Countries> getCountrieses() {
        return this.countrieses;
    }
    
    public void setCountrieses(Set<Countries> countrieses) {
        this.countrieses = countrieses;
    }




}


