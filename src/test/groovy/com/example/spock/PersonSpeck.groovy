package com.example.spock

import com.example.spock.domain.FakePersonDb
import com.example.spock.domain.Person
import com.example.spock.domain.PersonRepository
import com.example.spock.service.PersonService
import com.example.spock.service.impl.PersonServiceImpl
import spock.lang.Specification

class PersonSpeck extends Specification {

    PersonRepository personRepository = new FakePersonDb()
    PersonService personService = new PersonServiceImpl(personRepository)

    def "should get only adults" () {
        given: "there are adults"
            personRepository.withSampleData()
        when: "wants to get adults"
            def adults = personService.getAdults()
        then: "there are only adults"
            adults.size() == 7
    }

    def "should get adults whose names starts with letter A" () {
        given: "there are adults"
            def marek = new Person(1L, "Marek", 19)
            def artur = new Person(2L, "Artur", 27)
            def ola = new Person(3L, "Ola", 23)
            personRepository.save(marek)
            personRepository.save(artur)
            personRepository.save(ola)
        when: "wants to get adults"
            def people = personService.getNamesWithFirstLetter("A")
        then: "there are people with name which starts with A"
            people.size() == 1
        and: "there is Artur"
            people.contains(artur)
    }
}
