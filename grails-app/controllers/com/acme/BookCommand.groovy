package com.acme

import grails.validation.Validateable

@Validateable
class BookCommand {
    String title
    String author

    static contraints = {
        title nullable: false
        author nullable: false
    }
}
