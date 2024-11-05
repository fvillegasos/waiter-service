package com.fvillegas.kafka.waiter_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CUSTOMER_TABLE")
public class CustomerTableEntity {

    @Id
    private Long customerTableId;

    public CustomerTableEntity(Long customerTableId) {
        this.customerTableId = customerTableId;
    }

    public Long getCustomerTableId() {
        return customerTableId;
    }

    public void setCustomerTableId(Long customerTableId) {
        this.customerTableId = customerTableId;
    }
}
