package com.gym.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gym.entities.Trainer;

@Repository
public interface TrainerDAO extends JpaRepository<Trainer, Long> {
	Optional<Trainer> findById(Long id);
}
