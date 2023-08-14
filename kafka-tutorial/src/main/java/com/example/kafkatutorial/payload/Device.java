package com.example.kafkatutorial.payload;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

import java.io.Serializable;
import java.math.BigInteger;


public class Device {
    private int id;

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", macAddress='" + macAddress + '\'' +
                ", deviceType='" + deviceType + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public int getId() {
        return id;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public String getDeviceType() {
        return deviceType;
    }

    private String macAddress;
    private String deviceType;

}
