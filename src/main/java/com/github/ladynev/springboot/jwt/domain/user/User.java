package com.github.ladynev.springboot.jwt.domain.user;

import java.util.Collections;
import java.util.List;

/**
 * A user representation.
 *
 * @author V.Ladynev
 */
public class User {

    private String login;

    private String password;

    private List<Role> roles = Collections.emptyList();

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }


}
