package com.deltaweather.deltaweather.repository;

import com.deltaweather.deltaweather.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member,Long> {
    Optional<Member> findByMemberEmail(String memberEmail);
}
