package com.example.springbootjpa.dao;

import com.example.springbootjpa.entity.Stu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StuRepository extends CrudRepository<Stu, Integer> {

}
