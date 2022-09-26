package com.deltaweather.deltaweather.api.auth;

import com.deltaweather.deltaweather.domain.entity.Member;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

@Slf4j
@Getter @Setter
public class SecurityUser extends User {
    private Member member;

    public SecurityUser(Member member){
        super(member.getMemberEmail(), member.getMemberPassword(), AuthorityUtils.createAuthorityList(member.getRole().toString()));

        log.info("SecurityUser member : {},{}", member.getMemberName(),member.getRole());

        this.member = member;
    }
}
