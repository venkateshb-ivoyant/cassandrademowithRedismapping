package com.ivoyant.springdemoodcassandradb.entity;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.io.Serializable;

@Data
@UserDefinedType("address")
public class AddressUDT implements Serializable {
    private String street;
    @Column("door_no")
    private Integer doorNo;
    @Column("pin_code")
    private Integer pinCode;
}
