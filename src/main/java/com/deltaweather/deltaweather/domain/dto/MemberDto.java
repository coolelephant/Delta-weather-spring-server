package com.deltaweather.deltaweather.domain.dto;

import com.deltaweather.deltaweather.domain.entity.Member;
import lombok.Getter;

@Getter
public class MemberDto {
    private Long id;
    private String memberName;
    private String memberEmail;
    private String memberPassword;

    public MemberDto(Member member) {
        id = member.getId();
        memberName = member.getMemberName();
        memberEmail = member.getMemberEmail();
        memberPassword = member.getMemberPassword();
    }

    @Override
    public String toString(){
        return "MemberDto[memberId"+id+"memberName"+memberName+"memberEmail"+memberEmail+"memberPassword"+memberPassword+"]";
    }
}
