package com.example.spock.service;

import com.example.spock.domain.Person;

import java.util.List;

public interface PersonService {

  List<Person> getAdults();

  List<Person> getNamesWithFirstLetter(String letter);

}
