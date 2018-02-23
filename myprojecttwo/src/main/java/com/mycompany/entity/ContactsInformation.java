package com.mycompany.entity;
// Generated Feb 23, 2018 5:59:52 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ContactsInformation generated by hbm2java
 */
@Entity
@Table(name="Contacts_Information"
    ,catalog="Project_DB"
)
public class ContactsInformation  implements java.io.Serializable {


     private Integer contactId;
     private Companies companies;
     private ContactType contactType;
     private Employees employees;
     private String valueContact;
     private String contactDesc;

    public ContactsInformation() {
    }

	
    public ContactsInformation(Companies companies, ContactType contactType, Employees employees, String valueContact) {
        this.companies = companies;
        this.contactType = contactType;
        this.employees = employees;
        this.valueContact = valueContact;
    }
    public ContactsInformation(Companies companies, ContactType contactType, Employees employees, String valueContact, String contactDesc) {
       this.companies = companies;
       this.contactType = contactType;
       this.employees = employees;
       this.valueContact = valueContact;
       this.contactDesc = contactDesc;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Contact_Id", unique=true, nullable=false)
    public Integer getContactId() {
        return this.contactId;
    }
    
    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Company_Id", nullable=false)
    public Companies getCompanies() {
        return this.companies;
    }
    
    public void setCompanies(Companies companies) {
        this.companies = companies;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Contact_Type_Id", nullable=false)
    public ContactType getContactType() {
        return this.contactType;
    }
    
    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Employee_Id", nullable=false)
    public Employees getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    
    @Column(name="Value_Contact", nullable=false, length=200)
    public String getValueContact() {
        return this.valueContact;
    }
    
    public void setValueContact(String valueContact) {
        this.valueContact = valueContact;
    }

    
    @Column(name="contact_desc", length=300)
    public String getContactDesc() {
        return this.contactDesc;
    }
    
    public void setContactDesc(String contactDesc) {
        this.contactDesc = contactDesc;
    }




}


