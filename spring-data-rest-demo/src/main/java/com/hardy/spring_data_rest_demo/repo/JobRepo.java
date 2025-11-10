package com.hardy.spring_data_rest_demo.repo;

import com.hardy.spring_data_rest_demo.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer> {

}
