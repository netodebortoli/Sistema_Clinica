package Dao;

import Controle.FuncoesUteis;
import Dominio.Consulta;
import Dominio.Medico;
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

    private List<Consulta> pesquisarConsulta(int tipo, String pesquisa) throws HibernateException, ParseException {

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
                case 0: //data
                    Date dataConsulta = FuncoesUteis.strToDate(pesquisa);
                    exp = tabela.get("dataConsulta");
                    restricoes = builder.equal(exp, dataConsulta);
                    break;
                case 1: // medico
                    restricoes = builder.like(tabela.get("medico").get("nome"), "%" + pesquisa.trim().toUpperCase() + "%");
                    break;
                case 2: // paciente
                    restricoes = builder.like(tabela.get("paciente").get("nome"), "%" + pesquisa.trim().toUpperCase() + "%");
                    break;
                case 3: // modalidade
                    restricoes = builder.like(tabela.get("especialidade").get("descricao"), "%" + pesquisa.trim().toUpperCase() + "%");
                    break;
                default: // todas
                    Predicate res[] = new Predicate[3];
                    res[0] = builder.like(tabela.get("especialidade").get("descricao"), "%" + pesquisa.trim().toUpperCase() + "%");
                    res[1] = builder.like(tabela.get("paciente").get("nome"), "%" + pesquisa.trim().toUpperCase() + "%");
                    res[2] = builder.like(tabela.get("medico").get("nome"), "%" + pesquisa.trim().toUpperCase() + "%");
                    restricoes = builder.or(res);
                    break;
            }

            consulta.where(restricoes);
            consulta.orderBy(builder.desc(tabela.get("dataConsulta")), builder.asc(tabela.get("horario")));

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
        return pesquisarConsulta(tipoPesquisa, pesquisa);
    }

    public List<Consulta> pesquisarMedico(String pesquisa, int tipoPesquisa) throws HibernateException, ParseException {
        return pesquisarConsulta(tipoPesquisa, pesquisa);
    }

    public List<Consulta> pesquisarPaciente(String pesquisa, int tipoPesquisa) throws HibernateException, ParseException {
        return pesquisarConsulta(tipoPesquisa, pesquisa);
    }

    public List<Consulta> pesquisarEspecialidade(String pesquisa, int tipoPesquisa) throws HibernateException, ParseException {
        return pesquisarConsulta(tipoPesquisa, pesquisa);
    }

    public List<Consulta> pesquisarTodas(String pesquisa, int tipoPesquisa) throws HibernateException, ParseException {
        return pesquisarConsulta(tipoPesquisa, pesquisa);
    }

    public List<Consulta> pesquisarAgendamentos(String pesquisa, Medico med) throws HibernateException, ParseException {

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
            Predicate res[] = new Predicate[2];
            Expression exp = tabela.get("dataConsulta");

            Date dataConsulta = FuncoesUteis.strToDate(pesquisa);

            res[0] = builder.equal(exp, dataConsulta);
            res[1] = builder.like(tabela.get("medico").get("nome"), "%" + med.getNome() + "%");

            restricoes = builder.and(res);

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

    public List<Object> pesquisarTotal() {
        List lista = new ArrayList();

        Session session = null;

        try {
            session = ConexaoHibernate.getSessionFactory().openSession();
            session.beginTransaction();

            // Construtor da CONSULTA
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Object[].class);

            // FROM
            Root tabela = consulta.from(Consulta.class);

            consulta.multiselect(
                    tabela.get("especialidade").get("descricao"),
                    builder.count( tabela.get("idConsulta"))
           );

            consulta.groupBy(tabela.get("especialidade").get("descricao") );

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

}
