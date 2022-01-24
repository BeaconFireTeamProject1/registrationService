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
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @JsonProperty("ID")
    public int ID;

    @Column(name = "AddressLine1")
    public String AddressLine1;

    @Column(name = "AddressLine2")
    public String AddressLine2;

    @Column(name = "City")
    public String City;

    @Column(name = "Zipcode")
    public String Zipcode;

    @Column(name = "StateName")
    public String StateName;
}
