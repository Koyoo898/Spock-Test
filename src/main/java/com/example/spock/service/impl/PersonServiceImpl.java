package com.example.spock.service.impl;

import com.example.spock.domain.FakePersonDb;
import com.example.spock.domain.Person;
import com.example.spock.domain.PersonRepository;
import com.example.spock.service.PersonService;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Service
public class PersonServiceImpl implements PersonService {

  private PersonRepository personRepository;

  @Autowired
  public PersonServiceImpl(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  @Override
  public List<Person> getAdults() {
    final Collection<Person> people = personRepository.findAll();
    final List<Person> adults = new ArrayList<>();
    for (Person p : people) {
      if(p.getAge() >= 18) {
        adults.add(p);
      }
    }
    return adults;
  }

  @Override
  public List<Person> getNamesWithFirstLetter(String letter) {
    final Collection<Person> people = personRepository.findAll();
    final List<Person> startsWithLetterA = new ArrayList<>();
    for (Person p : people) {
      if(p.getName().startsWith(letter)) {
        startsWithLetterA.add(p);
      }
    }
    return startsWithLetterA;
  }
}
