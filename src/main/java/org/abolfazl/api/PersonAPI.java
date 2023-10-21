package org.abolfazl.api;

import lombok.RequiredArgsConstructor;
import org.abolfazl.entity.Person;
import org.abolfazl.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/person")
public class PersonAPI {
    private final PersonService personService;
    //@GetMapping("/save")
    @RequestMapping("/save")
    public Object save(@ModelAttribute Person person){
        personService.save(person);
        return person;
    }

    @GetMapping("/update")
    public Object update(@ModelAttribute Person person){
        personService.update(person);
        return person;
    }

    @RequestMapping("/remove")
    public Object remove(@ModelAttribute Person person){
        personService.remove(person);
        return person;
    }

    @RequestMapping("/findAll")
    public Object findAll(){
        return personService.findAll();
    }
}
