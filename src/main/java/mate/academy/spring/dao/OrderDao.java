package mate.academy.spring.dao;

import java.util.List;
import mate.academy.spring.model.Order;
import mate.academy.spring.model.User;

public interface OrderDao extends GenericDao<Order> {
    List<Order> getOrdersHistory(User user);
}
