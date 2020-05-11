package com.example.spock.domain;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class FakePersonDb implements PersonRepository {

  private final Map<Long, Person> people = new HashMap<>();

  public FakePersonDb() {
  }

  public void withSampleData() {
    people.put(1L, new Person(1L, "Artur", 17));
    people.put(2L, new Person(2L, "Marta", 23));
    people.put(3L, new Person(3L, "Kamil", 11));
    people.put(4L, new Person(4L, "Wojtek", 47));
    people.put(5L, new Person(5L, "Tomek", 19));
    people.put(6L, new Person(6L, "Grzesiek", 27));
    people.put(7L, new Person(7L, "Krzysiek", 33));
    people.put(8L, new Person(8L, "Ola", 18));
    people.put(9L, new Person(9L, "Sylwia", 15));
    people.put(10L, new Person(10L, "Marcin", 22));
  }

  @Override
  public List<Person> findAll() {
    return new ArrayList<>(people.values());
  }

  @Override
  public List<Person> findAll(Sort sort) {
    return null;
  }

  @Override
  public Page<Person> findAll(Pageable pageable) {
    return null;
  }

  @Override
  public List<Person> findAllById(Iterable<Long> iterable) {
    return null;
  }

  @Override
  public long count() {
    return 0;
  }

  @Override
  public void deleteById(Long aLong) {

  }

  @Override
  public void delete(Person person) {

  }

  @Override
  public void deleteAll(Iterable<? extends Person> iterable) {

  }

  @Override
  public void deleteAll() {

  }

  @Override
  public Person save(Person p) {
    people.put(p.getId(), p);
    return p;
  }

  @Override
  public <S extends Person> List<S> saveAll(Iterable<S> iterable) {
    return null;
  }

  @Override
  public Optional<Person> findById(Long aLong) {
    return Optional.empty();
  }

  @Override
  public boolean existsById(Long aLong) {
    return false;
  }

  @Override
  public void flush() {

  }

  @Override
  public <S extends Person> S saveAndFlush(S s) {
    return null;
  }

  @Override
  public void deleteInBatch(Iterable<Person> iterable) {

  }

  @Override
  public void deleteAllInBatch() {

  }

  @Override
  public Person getOne(Long aLong) {
    return null;
  }

  @Override
  public <S extends Person> Optional<S> findOne(Example<S> example) {
    return Optional.empty();
  }

  @Override
  public <S extends Person> List<S> findAll(Example<S> example) {
    return null;
  }

  @Override
  public <S extends Person> List<S> findAll(Example<S> example, Sort sort) {
    return null;
  }

  @Override
  public <S extends Person> Page<S> findAll(Example<S> example, Pageable pageable) {
    return null;
  }

  @Override
  public <S extends Person> long count(Example<S> example) {
    return 0;
  }

  @Override
  public <S extends Person> boolean exists(Example<S> example) {
    return false;
  }
}
