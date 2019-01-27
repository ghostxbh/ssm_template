package com.uzykj.dao;

import com.uzykj.entity.Person;

import java.util.List;

/**
 * @author ghostxbh
 * @date 27/01/2019 15:52
 */
public interface PersonDao {
    int insertOne(Person person);

    int updateOne(Person person);

    int deleteOne(Integer id);

    Person selectOne(Integer id);

    List<Person> selectAll();
}
