package pl.krrybarc.utils

import pl.krrybarc.exception.EmptyStackException
import pl.krrybarc.exception.FullStackException
import spock.lang.Specification

class CustomStackSpec extends Specification {

    def "Should return the same element when pushed and popped from the stack"() {
        given:
        int number = 10
        CustomStack<Integer> numbers = new CustomStack<>(3)
        numbers.push(number)

        when:
        def result = numbers.pop()

        then:
        result == number
    }

    def "Should throw FullStackException when trying to add beyond maximum size"() {
        given:
        int number = 10
        CustomStack<Integer> numbers = new CustomStack<>(1)

        when:
        numbers.push(number)
        numbers.push(number)

        then:
        thrown(FullStackException)
    }

    def "Should throw EmptyStackException when trying to pop from an empty stack"() {
        given:
        CustomStack<Integer> numbers = new CustomStack<>(1)

        when:
        numbers.pop()

        then:
        thrown(EmptyStackException)
    }
}
