package Model;

public class Person {
    
    private String name;
    long NUID;
    String collegeName;
    
    Address address;
    Address permanentAddress;
    
    Contact personalContact;
    Contact officeContact;
    
    public Person() {
        this.name = "";
        this.address = new Address();
        this.permanentAddress = new Address();
        
        this.officeContact = new Contact();
        this.personalContact = new Contact();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getCollegeName() {
        return collegeName;
    }
    
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    
    public long getNUID() {
        return NUID;
    }
    
    public void setNUID(long NUID) {
        this.NUID = NUID;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public Contact getPersonalContact() {
        return personalContact;
    }

    public void setPersonalContact(Contact personalContact) {
        this.personalContact = personalContact;
    }

    public Contact getOfficeContact() {
        return officeContact;
    }

    public void setOfficeContact(Contact officeContact) {
        this.officeContact = officeContact;
    }
    
    
}
