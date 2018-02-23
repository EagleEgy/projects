package com.mycompany.entity;
// Generated Feb 23, 2018 5:59:52 AM by Hibernate Tools 4.3.1


import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Employees generated by hbm2java
 */
@Entity
@Table(name="Employees"
    ,catalog="Project_DB"
)
public class Employees  implements java.io.Serializable {


     private Integer employeeId;
     private DepartmentsCompanies departmentsCompanies;
     private Gender gender;
     private Status status;
     private TitlesType titlesType;
     private String employeeFirstName;
     private String employeeSecondName;
     private String employeeThirdName;
     private String employeeForthName;
     private String employeeInternationalIdImagePath;
     private int employeePassportId;
     private String employeePassportIdImage;
     private Date employeeBirthDate;
     private Date employeeHireDate;
     private int employeeInternationalId;
     private Set<Addresses> addresseses = new HashSet<Addresses>(0);
     private Set<ContactsInformation> contactsInformations = new HashSet<ContactsInformation>(0);
     private Set<Technology> technologies = new HashSet<Technology>(0);

    public Employees() {
    }

	
    public Employees(DepartmentsCompanies departmentsCompanies, Gender gender, Status status, TitlesType titlesType, String employeeFirstName, String employeeSecondName, String employeeThirdName, String employeeForthName, String employeeInternationalIdImagePath, int employeePassportId, Date employeeBirthDate, int employeeInternationalId) {
        this.departmentsCompanies = departmentsCompanies;
        this.gender = gender;
        this.status = status;
        this.titlesType = titlesType;
        this.employeeFirstName = employeeFirstName;
        this.employeeSecondName = employeeSecondName;
        this.employeeThirdName = employeeThirdName;
        this.employeeForthName = employeeForthName;
        this.employeeInternationalIdImagePath = employeeInternationalIdImagePath;
        this.employeePassportId = employeePassportId;
        this.employeeBirthDate = employeeBirthDate;
        this.employeeInternationalId = employeeInternationalId;
    }
    public Employees(DepartmentsCompanies departmentsCompanies, Gender gender, Status status, TitlesType titlesType, String employeeFirstName, String employeeSecondName, String employeeThirdName, String employeeForthName, String employeeInternationalIdImagePath, int employeePassportId, String employeePassportIdImage, Date employeeBirthDate, Date employeeHireDate, int employeeInternationalId, Set<Addresses> addresseses, Set<ContactsInformation> contactsInformations, Set<Technology> technologies) {
       this.departmentsCompanies = departmentsCompanies;
       this.gender = gender;
       this.status = status;
       this.titlesType = titlesType;
       this.employeeFirstName = employeeFirstName;
       this.employeeSecondName = employeeSecondName;
       this.employeeThirdName = employeeThirdName;
       this.employeeForthName = employeeForthName;
       this.employeeInternationalIdImagePath = employeeInternationalIdImagePath;
       this.employeePassportId = employeePassportId;
       this.employeePassportIdImage = employeePassportIdImage;
       this.employeeBirthDate = employeeBirthDate;
       this.employeeHireDate = employeeHireDate;
       this.employeeInternationalId = employeeInternationalId;
       this.addresseses = addresseses;
       this.contactsInformations = contactsInformations;
       this.technologies = technologies;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Employee_Id", unique=true, nullable=false)
    public Integer getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Department_Id", nullable=false)
    public DepartmentsCompanies getDepartmentsCompanies() {
        return this.departmentsCompanies;
    }
    
    public void setDepartmentsCompanies(DepartmentsCompanies departmentsCompanies) {
        this.departmentsCompanies = departmentsCompanies;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Gender_Id", nullable=false)
    public Gender getGender() {
        return this.gender;
    }
    
    public void setGender(Gender gender) {
        this.gender = gender;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Status_Id", nullable=false)
    public Status getStatus() {
        return this.status;
    }
    
    public void setStatus(Status status) {
        this.status = status;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Title_Id", nullable=false)
    public TitlesType getTitlesType() {
        return this.titlesType;
    }
    
    public void setTitlesType(TitlesType titlesType) {
        this.titlesType = titlesType;
    }

    
    @Column(name="Employee_FirstName", nullable=false)
    public String getEmployeeFirstName() {
        return this.employeeFirstName;
    }
    
    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    
    @Column(name="Employee_SecondName", nullable=false)
    public String getEmployeeSecondName() {
        return this.employeeSecondName;
    }
    
    public void setEmployeeSecondName(String employeeSecondName) {
        this.employeeSecondName = employeeSecondName;
    }

    
    @Column(name="Employee_thirdName", nullable=false)
    public String getEmployeeThirdName() {
        return this.employeeThirdName;
    }
    
    public void setEmployeeThirdName(String employeeThirdName) {
        this.employeeThirdName = employeeThirdName;
    }

    
    @Column(name="Employee_ForthName", nullable=false)
    public String getEmployeeForthName() {
        return this.employeeForthName;
    }
    
    public void setEmployeeForthName(String employeeForthName) {
        this.employeeForthName = employeeForthName;
    }

    
    @Column(name="Employee_International_Id_Image_Path", nullable=false)
    public String getEmployeeInternationalIdImagePath() {
        return this.employeeInternationalIdImagePath;
    }
    
    public void setEmployeeInternationalIdImagePath(String employeeInternationalIdImagePath) {
        this.employeeInternationalIdImagePath = employeeInternationalIdImagePath;
    }

    
    @Column(name="Employee_Passport_Id", nullable=false)
    public int getEmployeePassportId() {
        return this.employeePassportId;
    }
    
    public void setEmployeePassportId(int employeePassportId) {
        this.employeePassportId = employeePassportId;
    }

    
    @Column(name="Employee_Passport_Id_Image")
    public String getEmployeePassportIdImage() {
        return this.employeePassportIdImage;
    }
    
    public void setEmployeePassportIdImage(String employeePassportIdImage) {
        this.employeePassportIdImage = employeePassportIdImage;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Employee_Birth_Date", nullable=false, length=10)
    public Date getEmployeeBirthDate() {
        return this.employeeBirthDate;
    }
    
    public void setEmployeeBirthDate(Date employeeBirthDate) {
        this.employeeBirthDate = employeeBirthDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Employee_Hire_Date", length=10)
    public Date getEmployeeHireDate() {
        return this.employeeHireDate;
    }
    
    public void setEmployeeHireDate(Date employeeHireDate) {
        this.employeeHireDate = employeeHireDate;
    }

    
    @Column(name="employee_international_id", nullable=false)
    public int getEmployeeInternationalId() {
        return this.employeeInternationalId;
    }
    
    public void setEmployeeInternationalId(int employeeInternationalId) {
        this.employeeInternationalId = employeeInternationalId;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="employees")
    public Set<Addresses> getAddresseses() {
        return this.addresseses;
    }
    
    public void setAddresseses(Set<Addresses> addresseses) {
        this.addresseses = addresseses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="employees")
    public Set<ContactsInformation> getContactsInformations() {
        return this.contactsInformations;
    }
    
    public void setContactsInformations(Set<ContactsInformation> contactsInformations) {
        this.contactsInformations = contactsInformations;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="employees")
    public Set<Technology> getTechnologies() {
        return this.technologies;
    }
    
    public void setTechnologies(Set<Technology> technologies) {
        this.technologies = technologies;
    }




}


