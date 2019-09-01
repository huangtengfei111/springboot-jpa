package com.example.springbootjpa.dao;

import com.example.springbootjpa.entity.Stu;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface StuRepository extends CrudRepository<Stu, Integer> {

    @Query(value = "select * from Stu where id = :id", nativeQuery = true)
    public Stu findByStuId(@Param("id")Integer id);

}
