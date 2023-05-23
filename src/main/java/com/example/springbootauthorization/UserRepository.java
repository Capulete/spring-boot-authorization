package com.example.springbootauthorization;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {

    final private Map<String, User> users = new HashMap<>();

    public UserRepository() {
        users.put("user", new User("user", "pass", Authorities.READ));
        users.put("user1", new User("user1", "pass1", Authorities.WRITE));
        users.put("user2", new User("user2", "pass2", Authorities.READ, Authorities.WRITE));
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        if  (!users.containsKey(user)) {
            throw new UnauthorizedUser("Unknown user");
        }
        if (!users.get(user).getPassword().equals(password)) {
            throw new UnauthorizedUser("Wrong password");
        }
        return users.get(user).getAuthorities();
    }
}
