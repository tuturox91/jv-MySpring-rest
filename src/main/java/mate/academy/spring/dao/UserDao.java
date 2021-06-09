package mate.academy.spring.dao;

import java.util.Optional;
import mate.academy.spring.model.User;

public interface UserDao extends GenericDao<User> {
    Optional<User> findByEmail(String email);
}
