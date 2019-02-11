package com.uzykj.controller;


import com.uzykj.emun.ExceptionEmun;
import com.uzykj.entity.Person;
import com.uzykj.exception.SSMException;
import com.uzykj.service.PersonService;
import com.uzykj.utils.JsonResult;
import org.apache.commons.lang.StringUtils;
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
    public String goHome() {
        return "person";
    }

    @RequestMapping("/add")
    @ResponseBody
    public JsonResult add(String name, Integer sex, Integer age) {
        JsonResult result = new JsonResult();
        if (!StringUtils.isEmpty(name)&&sex!=null&&age!=null)
        {
            Person person = new Person();
            person.setName(name);
            person.setSex(sex);
            person.setAge(age);
            personService.insertOne(person);
            result.setResult(personService.selectAll());
            return result;
        }else
            {
                throw new SSMException(ExceptionEmun.PARAMEX.getMeg());
            }

    }

    @RequestMapping("/update")
    @ResponseBody
    public boolean update(String name, Integer sex, Integer age) {
        Person person = new Person();
        person.setName(name);
        person.setSex(sex);
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
