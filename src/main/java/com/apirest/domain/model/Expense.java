package com.apirest.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;


@Entity(name = "tb_expense")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String category;
    @Column(precision = 13, scale = 2)
    private BigDecimal amount;
    private LocalDate date;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
