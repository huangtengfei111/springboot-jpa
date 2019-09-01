package com.example.springbootjpa.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.springbootjpa.entity.Stu;
import com.example.springbootjpa.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: huangtf
 * @CreateDate: 2019/9/1 15:10
 */
@RestController
public class StuController {

    @Autowired
    StuService stuService;

    @GetMapping("/stus")
    public List<Stu> index(){
        return stuService.findAll();
    }

    @PostMapping("/stus")
    public Stu create(@RequestBody Stu stu){
        return stuService.create(stu);
    }

    @PutMapping("/stus/{id}")
    public Stu update(@PathVariable Integer id,@RequestBody Stu stu){
        stu.setId(id);
        return stuService.update(stu);
    }

    @DeleteMapping("/stus/{id}")
    public void delete(@PathVariable Integer id){
        stuService.delete(id);
    }

    @PutMapping("/stus/test/{id}")
    public Stu updateTest(@PathVariable Integer id,@RequestBody String json){
        Stu stu = stuService.findById(id);
        JSONObject jsonObject = JSON.parseObject(json);
        stu.setAge(jsonObject.getInteger("age"));
        stu.setId(id);
        return stuService.update(stu);
    }

    @PostMapping("/stus/update/{id}")
    public int updateName(@PathVariable Integer id,@RequestBody String json){
        Stu stu = stuService.findById(id);
        JSONObject jsonObject = JSON.parseObject(json);
        return stuService.updateName(id, jsonObject.getString("name"));
    }
}
