package com.example.springbootjpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Description: java类作用描述
 * @Author: huangtf
 * @CreateDate: 2019/9/1 14:56
 */
@Entity
@Getter
@Setter
@Table(name = "stu")
public class Stu {
    @Id
    @GeneratedValue
    int id;
    String name;
    int age;

    @Override
    public String toString() {
        return "Stu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
