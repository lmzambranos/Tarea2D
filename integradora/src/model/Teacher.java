package model;

public class Teacher {

    private String numIdentification;
    private String typeIdentification;
    private String fullName;
    private String email;

    public Teacher(String numIdentification, String typeIdentification, String fullName, String email) {
        this.numIdentification = numIdentification;
        this.typeIdentification = typeIdentification;
        this.fullName = fullName;
        this.email = email;
    }

    public String getNumIdentification() {
        return numIdentification;
    }

    public void setNumIdentification(String numIdentification) {
        this.numIdentification = numIdentification;
    }

    public String getTypeIdentification() {
        return typeIdentification;
    }

    public void setTypeIdentification(String typeIdentification) {
        this.typeIdentification = typeIdentification;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    
}
