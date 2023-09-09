package com.ruijafa.acoupleexpenses.expenses;


import jakarta.persistence.*;

import java.util.Date;

/**
 * @implNote expenses are supported in euros only as there is no currency changing mechanism.
 */
@Entity
@Table(name = "EXPENSE")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EXPENSE_ID")
    private long id;

    @Column(name = "EXPENSE_TIMESTAMP")
    private Date timestamp;

    @Column(name = "AMOUNT")
    private int amount;

    @Column(name = "DESCRIPTION")
    private String description;

    public long getId() {
        return id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public int getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", timestamp=" + timestamp +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }
}
