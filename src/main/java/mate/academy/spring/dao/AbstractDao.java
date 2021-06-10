package mate.academy.spring.dao;

import mate.academy.spring.exception.DataProcessingException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public abstract class AbstractDao<T> implements GenericDao<T> {
    protected final SessionFactory sessionFactory;

    public AbstractDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public T add(T entity) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(entity);
            transaction.commit();
            return entity;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't insert " + entity.getClass().getSimpleName()
                    + ": " + entity, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
