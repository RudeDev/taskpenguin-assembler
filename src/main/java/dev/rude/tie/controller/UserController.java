package dev.rude.tie.controller;

import dev.rude.tie.entity.person.Person;
import dev.rude.tie.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Person create(@RequestBody Person person) {
        return personRepository.insert(person);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Person update(@RequestBody Person person) {
        return personRepository.save(person);
    }

    @RequestMapping(value = "", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void delete(@RequestBody Person person) {
        personRepository.delete(person);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Person> findAll() {
        return personRepository.findAll();
    }

}
