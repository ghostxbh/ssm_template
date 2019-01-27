package com.uzykj.dao;

import com.uzykj.BaseTest;
import com.uzykj.entity.Person;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author ghostxbh
 * @date 27/01/2019 20:57
 */
public class PersonDaoTest extends BaseTest {
    @Autowired
    PersonDao dao;

    @Test
    public void getPerson(){
        List<Person> people = dao.selectAll();
        for (Person person:people) {
            System.out.println(person.toString());
        }
    }

    @Test
    public void person(){
        System.out.println(dao.selectOne(1));
    }
}

