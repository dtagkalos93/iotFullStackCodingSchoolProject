package com.codingschool.redIotProject.Entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name="DEVICE")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="DEVICE_ID")
    private long id;
    @ManyToMany(mappedBy="devices")
    private List<Person> person;
    @Column(name="NAME")
    private String name;
    @Column(name="TYPE")
    private String type;
    @Column(name="STATUS")
    private boolean status;
    @Column(name="INFORMATION")
    private String information;
    
    @ManyToOne
    @JoinColumn(name="ROOM_ID")
    private Room room;
    
    @ManyToOne
    @JoinColumn(name="DEVICE_TYPE_ID")
    private DeviceType devicetype;

    public Device() {
    }

    public Device( String name, boolean status, String information,String type) {
        this.name = name;
        this.status = status;
        this.information = information;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
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
