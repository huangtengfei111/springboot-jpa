package com.example.springbootjpa.service;

import com.example.springbootjpa.dao.StuRepository;
import com.example.springbootjpa.entity.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: huangtf
 * @CreateDate: 2019/9/1 15:13
 */
@Service
public class StuService {
    @Autowired
    StuRepository stuRepository;

    public List<Stu> findAll(){
        List<Stu> stus  = (List<Stu>) stuRepository.findAll();
        return stus;
    }

    public Stu create(Stu stu){
       return stuRepository.save(stu);
    }

    public Stu update(Stu stu){
        return  stuRepository.save(stu);
    }

    public void delete(int id){
        stuRepository.deleteById(id);
    }
}
