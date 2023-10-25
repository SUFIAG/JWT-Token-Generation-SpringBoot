package com.github.ladynev.springboot.jwt.utils;

import com.github.ladynev.springboot.jwt.domain.user.Role;
import com.github.ladynev.springboot.jwt.domain.user.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static com.github.ladynev.springboot.jwt.utils.CollectionUtils.stream;

/**
 * @author V.Ladynev
 */
public final class UserUtils {

    private UserUtils() {

    }

    public static User user(String login, String password, Role... roles) {
        User result = new User();
        result.setLogin(login);
        result.setPassword(password);
        result.setRoles(Arrays.asList(roles));
        return result;
    }


    public static UserDetails toUserDetails(User user) {
        return new org.springframework.security.core.userdetails.User(
                user.getLogin(),
                user.getPassword(),
                toAuthorities(user.getRoles())
        );
    }

    private static Collection<GrantedAuthority> toAuthorities(List<Role> roles) {
        return stream(roles)
                .map(Role::name)
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }

}
