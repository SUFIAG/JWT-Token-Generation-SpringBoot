package com.github.ladynev.springboot.jwt.service;

import com.github.ladynev.springboot.jwt.domain.user.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Collection;

/**
 * @author V.Ladynev
 */
public interface UserService extends UserDetailsService {

    Collection<User> getAllUsers();

}
