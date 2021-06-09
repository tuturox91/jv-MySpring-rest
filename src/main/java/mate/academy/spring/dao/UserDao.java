package mate.academy.spring.dao;

import java.util.Optional;
import mate.academy.spring.model.User;

public interface UserDao {
    User add(User user);

    Optional<User> findByEmail(String email);
}
