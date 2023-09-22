package org.example.entity;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.autoconfigure.domain.EntityScan;


import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Document(collection = "devicedata")
public class DeviceData {

@Id
private String id;
    private String deviceId;
    private String idHlsDiagnostic;
    private String source;
    private String patientCode;
    private String byteData;
    private int channelCount;
    private int dataDuration;
    private int baseDataLength;
    private String liveModeKey;
    private String registerDate;
    private int sampleRate;
    private String data;
}
