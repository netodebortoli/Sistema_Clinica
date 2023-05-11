package Dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class GenericoDao {

    public GenericoDao() {
    }

    public void create(Object obj) throws HibernateException {

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

    public void delete(Object obj) throws HibernateException {

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

    public List read(Class classe) throws HibernateException {

        Session session = null;
        List list = null;

        try {
            session = ConexaoHibernate.getSessionFactory().openSession();
            session.beginTransaction();

            // LENDO OS DADOS DO BANCO DE DADOS
            Criteria consulta = session.createCriteria(classe);
            list = consulta.list();

            session.getTransaction().commit();
            session.close();

        } catch (HibernateException erro) {
            if (session != null) {
                session.getTransaction().rollback();
                session.close();
            }
            throw new HibernateException(erro);
        }

        return list;

    }

    public void update(Object obj) throws HibernateException {
        Session session = null;

        try {
            session = ConexaoHibernate.getSessionFactory().openSession();
            session.beginTransaction();

            // ALTERANDO OS DADOS DE UM OBJETO DO BANCO DE DADOS
            session.update(obj);

            session.getTransaction().commit();
            session.close();

        } catch (HibernateException erro) {
            if (session != null) {
                session.getTransaction().rollback();
                session.close();
            }
        }
    }
}
