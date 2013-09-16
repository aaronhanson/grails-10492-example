package com.acme

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(BookController)
class BookControllerSpec extends Specification {

    def bookService

    def setup() {
        bookService = Spy(BookService)
        controller.bookService = bookService
    }

    def cleanup() {
    }

    void "test something"() {
        expect: true
    }
}
