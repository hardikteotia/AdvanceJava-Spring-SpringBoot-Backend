package com.hardy.spring_data_jpa_example;

import com.hardy.spring_data_jpa_example.model.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

//    @Query("select s from Student where s.name= ?1") it will work with this query
//    List<Student> findAll(String name);

    List<Student> findByName(String name);
    public List<Student> findByMarksGreaterThan(int marks);
}
