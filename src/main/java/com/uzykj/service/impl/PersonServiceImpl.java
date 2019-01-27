package com.uzykj.service.impl;

import com.uzykj.dao.PersonDao;
import com.uzykj.entity.Person;
import com.uzykj.service.PersonService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author ghostxbh
 * @date 27/01/2019 16:04
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao dao;

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public boolean insertOne(Person person) {
        if (person != null) dao.insertOne(person);
        return true;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public boolean updateOne(Person person) {
        if (person != null) dao.updateOne(person);
        return true;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public boolean deleteOne(Integer id) {
        if (id != null) dao.deleteOne(id);
        return true;
    }

    public Person selectOne(Integer id) {
        if (id != null) {
            Person person = dao.selectOne(id);
            return person;
        }
        return null;
    }

    public List<Person> selectAll() {
        List<Person> people = dao.selectAll();
        if (people != null && people.size() > 0) {
            return people;
        }
        return null;
    }
}
