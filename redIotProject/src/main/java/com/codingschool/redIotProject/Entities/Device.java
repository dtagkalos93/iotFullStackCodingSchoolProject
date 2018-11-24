package com.codingschool.redIotProject.Entities;

public class Device {
    private long id;
    private String name;
    private DeviceType type;
    private boolean status;
    private String information;

    public Device() {
    }

    public Device(long id, String name, DeviceType type, boolean status, String information) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.status = status;
        this.information = information;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeviceType getType() {
        return type;
    }

    public void setType(DeviceType type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
