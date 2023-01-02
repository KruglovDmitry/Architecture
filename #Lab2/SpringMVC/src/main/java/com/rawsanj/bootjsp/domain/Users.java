package com.rawsanj.bootjsp.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JacksonXmlRootElement
public class Users implements Serializable {

    private static final long serialVersionUID = 22L;

    @JacksonXmlProperty(localName = "User")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<User> users = new ArrayList<>();

    public Users(List<User> users) {
        this.users = users;
    }
}
