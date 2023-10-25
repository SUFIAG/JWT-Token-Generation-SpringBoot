package com.github.ladynev.springboot.jwt.domain;

/**
 * @author V.Ladynev
 */
public class Report {

    private String name;

    public Report() {

    }

    public Report(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
