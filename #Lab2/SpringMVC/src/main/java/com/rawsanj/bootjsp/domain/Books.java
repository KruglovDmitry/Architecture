package com.rawsanj.bootjsp.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JacksonXmlRootElement
public class Books implements Serializable {

    private static final long serialVersionUID = 22L;

    @JacksonXmlProperty(localName = "Book")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Book> books = new ArrayList<>();

    public Books(List<Book> books) {
        this.books = books;
    }
}
