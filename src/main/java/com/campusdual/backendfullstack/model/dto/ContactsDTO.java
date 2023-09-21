package com.campusdual.backendfullstack.model.dto;


public class ContactsDTO {
    private int ID;

    private String name;

    private String surname;

    private String lastname;

    private int tel;

    private String email;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String first_name) {
        this.name = first_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String middle_name) {
        this.surname = middle_name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String last_name) {
        this.lastname = last_name;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
