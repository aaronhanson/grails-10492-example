package com.acme

class Book {

    String title
    String author

    Date dateCreated
    Date lastUpdated

    static constraints = {
        title nullable: false, empty: false
        author nullable: false, empty: false
    }
}
