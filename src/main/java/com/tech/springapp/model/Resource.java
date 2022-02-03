package com.tech.springapp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "resouorces")
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String serialNumber;
}
