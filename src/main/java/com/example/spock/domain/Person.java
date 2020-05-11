package com.example.spock.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Builder
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Getter
public class Person {
  Long id;
  String name;
  int age;

  public Person(Long id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}
