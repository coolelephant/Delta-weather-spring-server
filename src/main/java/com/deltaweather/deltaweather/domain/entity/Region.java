package com.deltaweather.deltaweather.domain.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Region {
    public String zipcode;
    public String regionDepth1;
    public String regionDepth2;
    public String regionDepth3;

    protected Region(){}

    public Region(String zipcode, String regionDepth1, String regionDepth2, String regionDepth3) {
        this.zipcode = zipcode;
        this.regionDepth1 = regionDepth1;
        this.regionDepth2 = regionDepth2;
        this.regionDepth3 = regionDepth3;
    }
}
