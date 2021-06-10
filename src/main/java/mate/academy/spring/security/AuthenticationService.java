package mate.academy.spring.security;

import mate.academy.spring.exception.AuthenticationException;
import mate.academy.spring.model.User;

public interface AuthenticationService {
    User login(String email, String password) throws AuthenticationException;

    User register(String email, String password);
}
