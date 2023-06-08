package Dao;

import Controle.FuncoesUteis;
import Dominio.Consulta;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class ConsultaDao extends GenericoDao {

    private List<Consulta> pesquisar(int tipo, String pesquisa) throws HibernateException, ParseException {

        List<Consulta> lista = new ArrayList();
        Session session = null;

        try {
            session = ConexaoHibernate.getSessionFactory().openSession();
            session.beginTransaction();

            // Construtor da CONSULTA
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Consulta.class);

            // FROM
            Root tabela = consulta.from(Consulta.class);

            // RESTRIÇÕES
            Predicate restricoes = null;
            Expression exp;

            switch (tipo) {
                case 0:
                    Date dataConsulta = FuncoesUteis.strToDate(pesquisa);
                    exp = tabela.get("dataConsulta");
                    restricoes = builder.equal(exp, dataConsulta);
                    break;
                case 1:
//                    exp = tabela.get("medico").get("nome");
//                    restricoes = builder.equal(exp, pesquisa + "%");
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }

            consulta.where(restricoes);
            lista = session.createQuery(consulta).getResultList();

            session.getTransaction().commit();
            session.close();

        } catch (HibernateException erro) {
            if (session != null) {
                session.getTransaction().rollback();
                session.close();
            }
            throw new HibernateException(erro);
        }

        return lista;
    }

    public List<Consulta> pesquisarData(String pesquisa, int tipoPesquisa) throws HibernateException, ParseException {
        return pesquisar(tipoPesquisa, pesquisa);
    }

    public List<Consulta> pesquisarMedico(String pesquisa, int tipoPesquisa) throws HibernateException, ParseException {
        return pesquisar(tipoPesquisa, pesquisa);
    }

    public List<Consulta> pesquisarPaciente(String pesquisa, int tipoPesquisa) throws HibernateException, ParseException {
        return pesquisar(tipoPesquisa, pesquisa);
    }

    public List<Consulta> pesquisarEspecialidade(String pesquisa, int tipoPesquisa) throws HibernateException, ParseException {
        return pesquisar(tipoPesquisa, pesquisa);
    }

}
