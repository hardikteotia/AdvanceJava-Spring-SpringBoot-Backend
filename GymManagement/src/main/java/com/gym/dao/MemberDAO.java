package com.gym.dao;

import com.gym.entities.Member;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberDAO extends JpaRepository<Member, Long>{
	Optional<Member> findById(Long id);
}
