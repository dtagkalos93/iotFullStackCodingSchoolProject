package com.codingschool.redIotProject.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class DeviceType {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String typeName;

    public DeviceType() {
    }

    public DeviceType( String typeName) {
        this.typeName = typeName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
