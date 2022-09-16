package com.project.MissingPetsApp.Pet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Pet {
    @Id // id is the primary key in the database

    @Column
    private int id;

    // defining name as the coloumn names
    @Column
    private String name;

    @Column
    private String type;

    @Column
    private String colour;

    @Column
    private String missingSince;

    @Column
    private String missingFrom;

    @Column
    private String contactDetail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getColour() { return colour; }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMissingSince() { return missingSince; }

    public void setMissingSince(String missingSince) { this.missingSince = missingSince; }

    public String getMissingFrom() { return missingFrom; }

    public void setMissingFrom(String missingFrom) { this.missingFrom = missingFrom; }

    public String getContactDetail() { return contactDetail; }

    public void setContactDetail(String contactDetail) { this.contactDetail = contactDetail; }
}