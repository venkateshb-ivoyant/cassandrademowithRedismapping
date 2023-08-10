package com.ivoyant.springdemoodcassandradb.entity;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.io.Serializable;

@Data
@UserDefinedType("subject")
public class SubjectUDT  implements Serializable {
    private String name;
}