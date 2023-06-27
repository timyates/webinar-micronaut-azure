package com.example

import jakarta.validation.Validator
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification


class PersonSpec extends Specification {

    @Shared
    @AutoCleanup
    Function function = new Function()

    void "Person::name is required"() {
        Validator validator = function.applicationContext.getBean(Validator)

        when:
        Person person = new Person()

        then:
        !validator.validate(person).isEmpty()

        when:
        person.name = 'sergio'

        then:
        validator.validate(person).isEmpty()
    }
}
