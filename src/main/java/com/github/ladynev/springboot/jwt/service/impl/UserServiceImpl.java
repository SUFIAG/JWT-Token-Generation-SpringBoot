package com.github.ladynev.springboot.jwt.service.impl;

import com.github.ladynev.springboot.jwt.domain.user.Role;
import com.github.ladynev.springboot.jwt.domain.user.User;
import com.github.ladynev.springboot.jwt.service.UserService;
import com.github.ladynev.springboot.jwt.utils.UserUtils;
import com.google.common.collect.ImmutableMap;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;
import java.util.Map;

import static com.github.ladynev.springboot.jwt.utils.UserUtils.user;

/**
 * @author V.Ladynev
 */
public class UserServiceImpl implements UserService {

    private static final Map<String, User> USERS = ImmutableMap.of(
            "admin", user("admin", "admin", Role.ADMIN),
            "advertiser", user("advertiser", "advertiser", Role.ADVERTISER),
            "analyst", user("analyst", "analyst", Role.ANALYST),
            "advertiser_analyst", user("advertiser_analyst", "advertiser_analyst", Role.ADVERTISER, Role.ANALYST)
    );

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = USERS.get(username);

        if (user == null) {
            throw new UsernameNotFoundException(String.format("User login='%s' not found", username));
        }

        return UserUtils.toUserDetails(user);
    }

    @Override
    public Collection<User> getAllUsers() {
        return USERS.values();
    }

}
