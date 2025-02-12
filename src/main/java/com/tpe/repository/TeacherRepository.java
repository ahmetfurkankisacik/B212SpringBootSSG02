package com.tpe.repository;

import com.tpe.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
    Boolean existsByEmail(String email);


    Boolean existsByPhone(String phone);
}
