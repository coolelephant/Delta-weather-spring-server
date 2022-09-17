package com.deltaweather.deltaweather.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.FetchType.*;

@Entity
@Getter @Setter
public class MemberLoc {
    @Id @GeneratedValue
    @Column(name = "mem_loc_id")
    private Long id;

    @Embedded
    private Region region;

//    @ManyToOne(fetch = LAZY)
//    private Member member;

    @ManyToOne(fetch = LAZY)
    private Location location;
}
