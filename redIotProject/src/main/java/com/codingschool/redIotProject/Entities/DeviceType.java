package com.codingschool.redIotProject.Entities;

public class DeviceType {

    private long id;
    private String typeName;

    public DeviceType() {
    }

    public DeviceType(long id, String typeName) {
        this.id = id;
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
