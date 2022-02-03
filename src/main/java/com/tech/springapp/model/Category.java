package com.tech.springapp.model;



import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity // annotation defines that a class can be mapped to a table.
@Data
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;
    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "category_id")
    private List<Resource> resources = new ArrayList<>();

    public Category(Long id, String name, String description) {
        this.id = id;
        this.name = name;
    }

    public Category() {

    }

    public void addResource(Resource resource) {
        resources.add(resource);
    }





}
