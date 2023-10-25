package com.github.ladynev.springboot.jwt.web.api;

import com.github.ladynev.springboot.jwt.domain.user.User;
import com.github.ladynev.springboot.jwt.service.UserService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * User resource.
 *
 * @author V.Ladynev
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('ADMIN')")
    public Collection<User> getUsers() {
        return userService.getAllUsers();
    }

}
