package com.deltaweather.deltaweather.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Coordinate {

    public String x;
    public String y;

    public String lngHour;
    public String lngMin;
    public String lngSec;
    public String lngMsec;

    public String latHour;
    public String latMin;
    public String latSec;
    public String latMsec;

    protected Coordinate() {
    }

    public Coordinate(String x, String y, String lngHour, String lngMin, String lngSec, String lngMsec, String latHour, String latMin, String latSec, String latMsec) {
        this.x = x;
        this.y = y;
        this.lngHour = lngHour;
        this.lngMin = lngMin;
        this.lngSec = lngSec;
        this.lngMsec = lngMsec;
        this.latHour = latHour;
        this.latMin = latMin;
        this.latSec = latSec;
        this.latMsec = latMsec;
    }
}
