package com.deltaweather.deltaweather.api.auth;

import com.deltaweather.deltaweather.domain.entity.Member;
import com.deltaweather.deltaweather.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Slf4j
@Component
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    private final MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String memberEmail) throws UsernameNotFoundException{
        Optional<Member> findMember = memberRepository.findByMemberEmail(memberEmail);
        if(!findMember.isPresent()) throw new UsernameNotFoundException("존재하지 않는 이메일입니다.");

        log.info("loadUserByUsername member.memberEmail : {}",memberEmail);

        return new SecurityUser(findMember.get());
    }
}
