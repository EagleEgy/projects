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
 * ContactType generated by hbm2java
 */
@Entity
@Table(name="Contact_Type"
    ,catalog="Project_DB"
)
public class ContactType  implements java.io.Serializable {


     private Integer contactTypeId;
     private String contactTypeName;
     private String contactTypeImagePath;
     private Set<ContactsInformation> contactsInformations = new HashSet<ContactsInformation>(0);

    public ContactType() {
    }

	
    public ContactType(String contactTypeName) {
        this.contactTypeName = contactTypeName;
    }
    public ContactType(String contactTypeName, String contactTypeImagePath, Set<ContactsInformation> contactsInformations) {
       this.contactTypeName = contactTypeName;
       this.contactTypeImagePath = contactTypeImagePath;
       this.contactsInformations = contactsInformations;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Contact_Type_Id", unique=true, nullable=false)
    public Integer getContactTypeId() {
        return this.contactTypeId;
    }
    
    public void setContactTypeId(Integer contactTypeId) {
        this.contactTypeId = contactTypeId;
    }

    
    @Column(name="Contact_Type_Name", nullable=false)
    public String getContactTypeName() {
        return this.contactTypeName;
    }
    
    public void setContactTypeName(String contactTypeName) {
        this.contactTypeName = contactTypeName;
    }

    
    @Column(name="contact_type_image_path", length=300)
    public String getContactTypeImagePath() {
        return this.contactTypeImagePath;
    }
    
    public void setContactTypeImagePath(String contactTypeImagePath) {
        this.contactTypeImagePath = contactTypeImagePath;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contactType")
    public Set<ContactsInformation> getContactsInformations() {
        return this.contactsInformations;
    }
    
    public void setContactsInformations(Set<ContactsInformation> contactsInformations) {
        this.contactsInformations = contactsInformations;
    }




}

