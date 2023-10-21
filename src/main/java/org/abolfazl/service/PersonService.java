package org.abolfazl.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.abolfazl.entity.Person;
import org.abolfazl.repository.PersonDA;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PersonService {
    private final PersonDA personDA;

    @Transactional
    public void save(Person person){
        log.info("invoked save . . .");
        personDA.save(person);
    }
    @Transactional
    public void update(Person person){
        log.info("invoked update . . .");
        personDA.save(person); // chon id ham midim update anjam mishe
    }

    @Transactional
    public void remove(Person person){
        log.info("invoked remove . . .");
        personDA.delete(person);
    }

    public List<Person> findAll(){
        log.info("invoked findAll . . .");
        return personDA.findAll();
    }
}
