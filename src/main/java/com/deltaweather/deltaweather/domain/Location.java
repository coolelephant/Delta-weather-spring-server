package com.deltaweather.deltaweather.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Location {
    @Id @GeneratedValue
    @Column(name="location_id")
    private Long id;

    @Embedded
    private Region region;

    @Embedded
    private Coordinate coordinate;

    @OneToMany(mappedBy = "location")
    private List<MemberLoc> memberLocs = new ArrayList<>();
}
