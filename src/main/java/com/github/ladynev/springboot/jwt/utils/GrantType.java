package com.github.ladynev.springboot.jwt.utils;

/**
 * @author V.Ladynev
 */
public enum GrantType {

    PASSWORD("password"),

    REFRESH_TOKEN("refresh_token");

    private String value;

    GrantType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
