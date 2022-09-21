package com.deltaweather.deltaweather.domain.entity;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data @Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    @NotEmpty
    private Long id;

    @NotEmpty
    @Column(name = "name")
    private String memberName;

    @NotEmpty
    @Column(name = "email")
    private String memberEmail;

    @NotEmpty
    @Column(name = "password")
    private String memberPassword;

    @OneToMany(mappedBy = "location")
    private List<MemberLoc> memberLocs = new ArrayList<>();
}
