package asd.amazon.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ACCOUNT")
public class Account {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    //maybe create a class Credentials(username,password)?
    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String username;    //maybe unique?

    @Basic(optional = false)
    @Column(name = "PASSWORD")
    private String password;

    //anagraphic? Or maybe a class Customer with details about the Customer as a person and not as an account in our system
    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    //birthdate


    //some data about registration Date?
}
