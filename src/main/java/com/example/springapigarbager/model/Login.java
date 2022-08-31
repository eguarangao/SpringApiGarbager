package com.example.springapigarbager.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "login")
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",unique = true,nullable = false)
    private int id;
    @Column(name = "userName",length = 45)
    String userName;
    @Column(name = "password",length = 45)
    String password;
    @OneToOne
    @JoinColumn(name = "loginIdPerson")
    Person loginIdPerson;

}
