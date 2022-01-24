package com.example.springssoauthserver.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "Contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @JsonProperty("ID")
    public int ID;

    @ManyToOne
    @JoinColumn(name = "PersonID")
    public int personID;

    @Column(name = "name")
    public String name;

    @Column(name = "address")
    public String address;

    @Column(name = "phone")
    public String phone;

    @Column(name = "relationship")
    public String relationship;

    @Column(name = "title")
    public String title;

    @Column(name = "isReferrence")
    public boolean isReferrence;

    @Column(name = "isEmergency")
    public boolean isEmergency;
}
