package com.codingschool.redIotProject.Entities;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="DEVICE_TYPE")
public class DeviceType {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="DEVICE_TYPE_ID")
    private long id;
    @Column(name="DEVICE_TYPE_NAME")
    private String typeName;
    
    @OneToMany(mappedBy="deviceType")
    private List<Device> devices;

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

//    @JsonIgnore
    public List<Device> getDevices() {
		return devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}
    
}
