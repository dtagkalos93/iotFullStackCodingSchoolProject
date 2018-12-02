package com.codingschool.redIotProject.Entities;


import javax.persistence.*;

import java.util.List;

@Entity
@Table(name="DEVICE")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="DEVICE_ID")
    private long id;
    @ManyToMany(mappedBy="devices")
    private List<User> users;
    @Column(name="NAME")
    private String name;
    @Column(name="STATUS")
    private boolean status;
    @Column(name="INFORMATION")
    private String information;
    
    @ManyToOne
    @JoinColumn(name="ROOM_ID")
    private Room room;

    public DeviceType getDevicetype() {
        return devicetype;
    }

    public void setDevicetype(DeviceType devicetype) {
        this.devicetype = devicetype;
    }

    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="DEVICE_TYPE_ID")
    private DeviceType devicetype;

    public Device() {
    }

    public Device( String name, boolean status, String information, String type) {
        this.name = name;
        this.status = status;
        this.information = information;
        this.devicetype = new DeviceType(type);
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
