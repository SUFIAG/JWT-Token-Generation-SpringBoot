package com.github.ladynev.springboot.jwt.domain;

/**
 * @author V.Ladynev
 */
public class Campaign {

    private String name;

    public Campaign() {

    }

    public Campaign(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
