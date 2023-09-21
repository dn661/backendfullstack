package com.campusdual.backendfullstack.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="PRODUCTS")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column
    private String name;

    @Column
    private int stock;

    @Column
    private BigDecimal price;

    @Column
    private boolean active;

    @Column
    private Date date_added;
}
