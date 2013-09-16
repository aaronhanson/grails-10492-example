package com.acme

import spock.lang.*

class BookControllerSpec extends Specification {

    def controller
    def bookService

    def setup() {
        controller = new BookController()
        controller.bookService = bookService
    }

    void "test save without existing record using json request"() {
        given:
            controller.request.contentType = 'application/json'
            controller.request.content = '{"title":"book1", "author":"author1"}'.bytes
        when:
            controller.save()
        then:
            controller.response.status == 201
    }

    void "test save with existing record using json request"() {
        given:
            new Book(title: 'title1', author: 'author1').save(flush: true)
            controller.request.contentType = 'application/json'
            controller.request.content = '{"title":"book1", "author":"author1"}'.bytes
        when:
            controller.save()
        then:
            controller.response.status == 201
    }
    
    void "test save with existing record using params request"() {
        given:
            new Book(title: 'title1', author: 'author1').save(flush: true)
            controller.params.title = "book1"
            controller.params.author = "author1"
        when:
            controller.save()
        then:
            controller.response.status == 201
    }
}
