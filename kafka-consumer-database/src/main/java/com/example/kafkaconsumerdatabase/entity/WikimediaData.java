package com.example.kafkaconsumerdatabase.entity;

import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "wikimedia_resentchange")
@Getter
@Setter
public class WikimediaData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    //@Column(columnDefinition = "text")
    @Lob
    private String wikimediEventData;

}
