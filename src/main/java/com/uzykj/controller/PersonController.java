package com.uzykj.controller;

import com.uzykj.entity.Person;
import com.uzykj.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ghostxbh
 * @date 27/01/2019 21:10
 */
@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/")
    @ResponseBody
    public String goHome() {
        return "person";
    }

    @RequestMapping("/add")
    @ResponseBody
    public boolean add(String name, String sex, Integer age) {
        Person person = new Person();
        person.setName(name);
        if (sex.equals("男")) {
            person.setSex(1);
        } else {
            person.setSex(2);
        }
        person.setAge(age);
        return personService.insertOne(person);
    }

    @RequestMapping("/update")
    @ResponseBody
    public boolean update(String name, String sex, Integer age) {
        Person person = new Person();
        person.setName(name);
        if (sex.equals("男")) {
            person.setSex(1);
        } else {
            person.setSex(2);
        }
        person.setAge(age);
        return personService.updateOne(person);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public boolean delete(Integer id) {
        return personService.deleteOne(id);
    }

    @RequestMapping("/query")
    @ResponseBody
    public Person person(Integer id) {
        return personService.selectOne(id);
    }

    @RequestMapping("/all")
    @ResponseBody
    public List<Person> personAll() {
        return personService.selectAll();
    }
}
