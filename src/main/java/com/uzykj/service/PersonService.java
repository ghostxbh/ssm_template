package com.uzykj.service;

import com.uzykj.entity.Person;

import java.util.List;

/**
 * @author ghostxbh
 * @date 27/01/2019 16:03
 */
public interface PersonService {
    boolean insertOne(Person person);

    boolean updateOne(Person person);

    boolean deleteOne(Integer id);

    Person selectOne(Integer id);

    List<Person> selectAll();
}
