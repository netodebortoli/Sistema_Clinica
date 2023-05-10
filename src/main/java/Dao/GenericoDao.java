package Dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class GenericoDao {

    public void create(Object obj) {

        Session session = null;

        try {
            session = ConexaoHibernate.getSessionFactory().openSession();
            session.beginTransaction();

            // SALVANDO NO BANCO DE DADOS
            session.save(obj);

            session.getTransaction().commit();
            session.close();

        } catch (HibernateException erro) {
            if (session != null) {
                session.getTransaction().rollback();
                session.close();
            }
        }

    }

    public void delete(Object obj) {

        Session session = null;

        try {
            session = ConexaoHibernate.getSessionFactory().openSession();
            session.beginTransaction();

            // DELETANDO O OBJETO DO BANCO DE DADOS
            session.delete(obj);

            session.getTransaction().commit();
            session.close();

        } catch (HibernateException erro) {
            if (session != null) {
                session.getTransaction().rollback();
                session.close();
            }
        }
    }

    public List read(Object obj) {

        Session session = null;
        List list = null;

        try {
            session = ConexaoHibernate.getSessionFactory().openSession();
            session.beginTransaction();

            // LENDO OS DADOS DO BANCO DE DADOS
            
            
            session.getTransaction().commit();
            session.close();

        } catch (HibernateException erro) {
            if (session != null) {
                session.getTransaction().rollback();
                session.close();
            }
        }

        return null;

    }

    public void update(Object obj) {

    }
}
