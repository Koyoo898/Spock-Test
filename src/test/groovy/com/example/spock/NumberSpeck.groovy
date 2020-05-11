package com.example.spock

import com.example.spock.service.NumberService
import com.example.spock.service.impl.NumberServiceImpl
import spock.lang.Specification
import spock.lang.Unroll

class NumberSpeck extends Specification {

    NumberService numberService = new NumberServiceImpl()

    def "should get average" () {
        given: "there are numbers"
            def numbers = [12, -2, 30, 0]
        when: "wants to calculate average"
            def result = numberService.getAverage(numbers)
        then: "gets result"
            result == 10
    }

    @Unroll
    def "should get sum of two numbers" () {
        when: "wants to calculate sum"
            def result = numberService.addNumbers(number1, number2)
        then: "gets result"
            result == expected
       where:
            number1 |   number2 ||  expected
            2       |   4       ||  6
            5       |   7       ||  12
            8       |   -2      ||  6
    }
}
