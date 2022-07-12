package com.exo;
import java.util.Date;

public class Customer {
    private String name;
    private String lastName;
    private int numero;
    private String email;
    private Date birth;
    private String Addres_email;

    public Customer(String name, String lastName, int numero, String email, Date birth, String Address_email){
        this.name = name;
        this.lastName = lastName;
        this.numero = numero;
        this.email = email;
        this.birth = birth;
        this.Addres_email = Address_email;
    }

    //Getter & Setter
    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return int return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return Date return the birth
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * @param birth the birth to set
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * @return String return the Addres_email
     */
    public String getAddres_email() {
        return Addres_email;
    }

    /**
     * @param Addres_email the Addres_email to set
     */
    public void setAddres_email(String Addres_email) {
        this.Addres_email = Addres_email;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub

        return "Name is "+name+",\nLastName is "+lastName+",\nNumero : "+numero+
                "\nEmail : \""+email+"\",\nBirth is "+birth+
                "\nAddress-email is "+Addres_email;
    }
}
