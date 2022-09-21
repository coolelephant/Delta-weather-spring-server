package com.deltaweather.deltaweather.repository;

import com.deltaweather.deltaweather.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {
}
