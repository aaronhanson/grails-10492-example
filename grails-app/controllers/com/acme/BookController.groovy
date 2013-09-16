package com.acme

class BookController {

    def bookService

    def index() { 
        bookService.doSomething()
        render(status: 200)
    }

    def save(BookCommand bookCommand) {
        assert bookCommand.title != null
       
        bookService.doSomething()
 
        render(status: 201)
    }
}
