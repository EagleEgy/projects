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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Districtd generated by hbm2java
 */
@Entity
@Table(name="Districtd"
    ,catalog="Project_DB"
)
public class Districtd  implements java.io.Serializable {


     private Integer districtId;
     private Cities cities;
     private Governrates governrates;
     private int districtCode;
     private String districtName;
     private String districtDesc;
     private Set<Addresses> addresseses = new HashSet<Addresses>(0);

    public Districtd() {
    }

	
    public Districtd(Cities cities, Governrates governrates, int districtCode, String districtName) {
        this.cities = cities;
        this.governrates = governrates;
        this.districtCode = districtCode;
        this.districtName = districtName;
    }
    public Districtd(Cities cities, Governrates governrates, int districtCode, String districtName, String districtDesc, Set<Addresses> addresseses) {
       this.cities = cities;
       this.governrates = governrates;
       this.districtCode = districtCode;
       this.districtName = districtName;
       this.districtDesc = districtDesc;
       this.addresseses = addresseses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="District_Id", unique=true, nullable=false)
    public Integer getDistrictId() {
        return this.districtId;
    }
    
    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="City_Id", nullable=false)
    public Cities getCities() {
        return this.cities;
    }
    
    public void setCities(Cities cities) {
        this.cities = cities;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="governorate_Id", nullable=false)
    public Governrates getGovernrates() {
        return this.governrates;
    }
    
    public void setGovernrates(Governrates governrates) {
        this.governrates = governrates;
    }

    
    @Column(name="District_Code", nullable=false)
    public int getDistrictCode() {
        return this.districtCode;
    }
    
    public void setDistrictCode(int districtCode) {
        this.districtCode = districtCode;
    }

    
    @Column(name="District_Name", nullable=false)
    public String getDistrictName() {
        return this.districtName;
    }
    
    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    
    @Column(name="District_Desc")
    public String getDistrictDesc() {
        return this.districtDesc;
    }
    
    public void setDistrictDesc(String districtDesc) {
        this.districtDesc = districtDesc;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="districtd")
    public Set<Addresses> getAddresseses() {
        return this.addresseses;
    }
    
    public void setAddresseses(Set<Addresses> addresseses) {
        this.addresseses = addresseses;
    }




}


