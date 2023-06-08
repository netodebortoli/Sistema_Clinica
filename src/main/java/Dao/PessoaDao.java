package Dao;

import Dominio.Pessoa;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class PessoaDao extends GenericoDao {

    public List pesquisarPessoa(Class classe, String pesq) {

        Session session = null;
        List<Pessoa> lista = null;

        try {
            session = ConexaoHibernate.getSessionFactory().openSession();
            session.beginTransaction();

            // Construtor da CONSULTA
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(classe);

            // FROM
            Root tabela = consulta.from(classe);

            // RESTRIÇÕES
            Predicate restricoes = builder.like(tabela.get("nome"), "%" + pesq.trim().toUpperCase() + "%");

            consulta.where(restricoes);
            lista = session.createQuery(consulta).getResultList();

            session.getTransaction().commit();

        } catch (HibernateException he) {
            session.getTransaction().rollback();
        } finally {
            if (session != null) {
                session.close();
            }
            return lista;
        }
    }

}
