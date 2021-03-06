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
 * TitlesType generated by hbm2java
 */
@Entity
@Table(name="Titles_Type"
    ,catalog="Project_DB"
)
public class TitlesType  implements java.io.Serializable {


     private Integer titleId;
     private String titleName;
     private int titleDesc;
     private Set<Employees> employeeses = new HashSet<Employees>(0);
     private Set<UsersAppUserUs> usersAppUserUses = new HashSet<UsersAppUserUs>(0);

    public TitlesType() {
    }

	
    public TitlesType(String titleName, int titleDesc) {
        this.titleName = titleName;
        this.titleDesc = titleDesc;
    }
    public TitlesType(String titleName, int titleDesc, Set<Employees> employeeses, Set<UsersAppUserUs> usersAppUserUses) {
       this.titleName = titleName;
       this.titleDesc = titleDesc;
       this.employeeses = employeeses;
       this.usersAppUserUses = usersAppUserUses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Title_Id", unique=true, nullable=false)
    public Integer getTitleId() {
        return this.titleId;
    }
    
    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }

    
    @Column(name="Title_Name", nullable=false)
    public String getTitleName() {
        return this.titleName;
    }
    
    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    
    @Column(name="Title_Desc", nullable=false)
    public int getTitleDesc() {
        return this.titleDesc;
    }
    
    public void setTitleDesc(int titleDesc) {
        this.titleDesc = titleDesc;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="titlesType")
    public Set<Employees> getEmployeeses() {
        return this.employeeses;
    }
    
    public void setEmployeeses(Set<Employees> employeeses) {
        this.employeeses = employeeses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="titlesType")
    public Set<UsersAppUserUs> getUsersAppUserUses() {
        return this.usersAppUserUses;
    }
    
    public void setUsersAppUserUses(Set<UsersAppUserUs> usersAppUserUses) {
        this.usersAppUserUses = usersAppUserUses;
    }




}


