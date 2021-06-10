package mate.academy.spring.dao;

import mate.academy.spring.model.ShoppingCart;
import mate.academy.spring.model.User;

public interface ShoppingCartDao extends GenericDao<ShoppingCart> {
    ShoppingCart getByUser(User user);

    void update(ShoppingCart shoppingCart);
}
