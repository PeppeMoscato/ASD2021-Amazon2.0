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

    //maybe class Credentials(username,password)?
    @Basic(optional = false)
    @Column(name = "USERNAME", unique = true)
    private String username;

    @Basic(optional = false)
    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;
}
